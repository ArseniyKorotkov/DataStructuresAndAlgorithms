package track14WeightedGraph.pack2MinimumWaysDijkstra.fromBook;

public class Graph {
    private final int MAX_VERTS = 20;
    private final int INFINITY = 1000000;
    private Vertex[] vertexList;
    private int[][] adjMat;
    private int nVerts;
    private int nTree;
    private DistPar[] sPath;
    private int currentVert;
    private int startToCurrent;

    public Graph() {
        vertexList = new Vertex[MAX_VERTS];
        adjMat = new int[MAX_VERTS][MAX_VERTS];

        nVerts = 0;
        nTree = 0;
        for (int i = 0; i < MAX_VERTS; i++)
            for (int j = 0; j < MAX_VERTS; j++)
                adjMat[i][j] = INFINITY;
        sPath = new DistPar[MAX_VERTS];
    }

    public void addVertex(char lab) {
        vertexList[nVerts++] = new Vertex(lab);
    }

    public void addEdge(int start, int end, int weight) {
        adjMat[start][end] = weight;
    }

    public void path() {
        int startTree = 0;
        vertexList[startTree].setInTree(true);
        nTree = 1;

        for (int i = 0; i < nVerts; i++) {
            int tempDist = adjMat[startTree][i];
            sPath[i] = new DistPar(startTree, tempDist);
        }

        while (nTree < nVerts) {
            int indexMin = getMin();
            int minDist = sPath[indexMin].getDistance();


            if (minDist == INFINITY) {
                System.out.println("Finish find");
                break;
            } else {
                currentVert = indexMin;
                startToCurrent = sPath[indexMin].getDistance();
            }

            vertexList[currentVert].setInTree(true);
            nTree++;
            adjust_sPath();
        }

        displayPaths();

        nTree = 0;
        for (int i = 0; i < nVerts; i++)
            vertexList[i].setInTree(false);
    }

    public int getMin() {
        int minDist = INFINITY;
        int indexMin = 0;

        for (int i = 1; i < nVerts; i++) {
            if (!vertexList[i].isInTree()
                && sPath[i].getDistance() < minDist) {
                minDist = sPath[i].getDistance();
                indexMin = i;
            }
        }

        return indexMin;
    }

    public void adjust_sPath() {
        int column = 1;
        while (column < nVerts) {
            if (vertexList[column].isInTree()) {
                column++;
                continue;
            }


            int currentToFringe = adjMat[currentVert][column];

            int startToFringe = startToCurrent + currentToFringe;

            int sPathDist = sPath[column].getDistance();

            if (startToFringe < sPathDist) {
                sPath[column].setParentVert(currentVert);
                sPath[column].setDistance(startToFringe);

            }
            column++;
        }
    }

    public void displayPaths() {
        for (int i = 0; i < nVerts; i++) {
            System.out.print(vertexList[i].getLabel() + "=");
            if (sPath[i].getDistance() == INFINITY)
                System.out.print("inf");
             else
                System.out.print(sPath[i].getDistance());

            char parent = vertexList[sPath[i].getParentVert()].getLabel();
            System.out.print("(" + parent + ")");
        }
        System.out.println("");
    }

}

















