package track6Recursion.pack6MergeSort.pack2MergeSort;

import java.util.ArrayList;

public class MergeSort {

    private ArrayList<LinkedQueue> queues = new ArrayList<>();


    public long[] mergeSort(long[] array) {
        long[] answer;
        LinkedQueue queue = arrayToQueue(array);


        while (!queue.isEmpty()) {
            LinkedQueue linkedQueue = new LinkedQueue();
            linkedQueue.add(queue.pop());
            queues.add(linkedQueue);
        }

        int from1 = 0;
        int from2 = from1 + 1;
        int to = 0;
        int size = queues.size();
        while (size > 1) {
            queues.set(to, simpleMergeSort(queues.get(from1), queues.get(from2)));


            from1 += 2;
            from2 += 2;
            to++;

            if (from2 == size) {
                from2 = 0;
                to = 0;

            }

            if(from1 == size || from2 == 2) {
                from1 = 0;
                from2 = 1;
                to = 0;
                size = (size / 2) + (size % 2);
            }
        }

        answer = queueToArray(queues.get(0));


        return answer;
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
