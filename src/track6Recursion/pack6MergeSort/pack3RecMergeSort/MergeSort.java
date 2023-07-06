package track6Recursion.pack6MergeSort.pack3RecMergeSort;

public class MergeSort {


    public long[] recMergeSort(long[] array) {
        LinkedQueue queue1;
        LinkedQueue queue2;
        if(array.length == 1) {
            return array;
        } else {
            queue1 = new LinkedQueue();
            queue2 = new LinkedQueue();

            int start = 0;
            int end = array.length;
            int mid = (start + end) / 2;



            for (int i = start; i < mid; i++) {
                queue1.add(array[i]);
            }
            for (int i = mid; i < end; i++) {
                queue2.add(array[i]);
            }
        }

        return queueToArray(simpleMergeSort(arrayToQueue(recMergeSort(queueToArray(queue1))), arrayToQueue(recMergeSort(queueToArray(queue2)))));

    }


    public LinkedQueue simpleMergeSort(LinkedQueue A, LinkedQueue B) {
        LinkedQueue queue = new LinkedQueue();
        while (!A.isEmpty() || !B.isEmpty()) {
            if (A.isEmpty()) {
                queue.add(B.pop());
                continue;
            }

            if (B.isEmpty()) {
                queue.add(A.pop());
                continue;
            }
            if (A.peek() > B.peek() || A.peek() == B.peek()) {
                queue.add(B.pop());
            } else if (A.peek() < B.peek()) {
                queue.add(A.pop());
            }
        }
        return queue;
    }

    private LinkedQueue arrayToQueue(long[] array) {
        LinkedQueue linkedQueue = new LinkedQueue();
        for (int i = 0; i < array.length; i++) {
            linkedQueue.add(array[i]);
        }
        return linkedQueue;

    }

    private long[] queueToArray(LinkedQueue queue) {
        long[] array = new long[queue.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = queue.pop();
        }
        return array;
    }
}
