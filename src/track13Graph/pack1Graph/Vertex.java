package track13Graph.pack1Graph;

public class Vertex {

    private char label;
    private boolean wasVisited;

    public Vertex(char label) {
        this.label = label;
    }

    public char getLabel() {
        return label;
    }

    public boolean isWasVisited() {
        return wasVisited;
    }

    public void setWasVisited(boolean wasVisited) {
        this.wasVisited = wasVisited;
    }
}
