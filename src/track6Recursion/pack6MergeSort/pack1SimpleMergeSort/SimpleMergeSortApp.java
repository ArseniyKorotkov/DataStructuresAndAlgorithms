package track6Recursion.pack6MergeSort.pack1SimpleMergeSort;

public class SimpleMergeSortApp {
    private static final int[] A = new int[5];
    private static final int[] B = new int[15];
    private static final int[] C = new int[A.length + B.length];

    public static void main(String[] args) {


        arraysInit();
        merge();

        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i] + " ");
        }
        System.out.println();
    }

    private static void arraysInit() {
        for (int i = 0; i < A.length; i++) {
            A[i] = (i + 1) * 5;
        }
        for (int i = 0; i < B.length; i++) {
            B[i] = (i + 1) * 2;
        }
    }

    private static void merge() {
        int sizeA = 0;
        int sizeB = 0;
        int i;
        for (i = 0; i < C.length; i++) {
            if (A[sizeA] < B[sizeB]) {
                C[i] = A[sizeA++];
            } else if (A[sizeA] > B[sizeB]) {
                C[i] = B[sizeB++];
            } else {
                C[i] = A[sizeA++];
                i++;
                C[i] = B[sizeB++];
            }
            if (sizeA == A.length || sizeB == B.length) {
                break;
            }
        }

        i++;

        if (sizeA == A.length) {
            for ( ; i < C.length; i++) {
                C[i] = B[sizeB++];
            }
        } else {
            for ( ; i < C.length; i++) {
                C[i] = A[sizeA++];
            }
        }

    }
}
