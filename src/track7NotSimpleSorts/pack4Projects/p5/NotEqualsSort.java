package track7NotSimpleSorts.pack4Projects.p5;

import java.util.ArrayList;

public class NotEqualsSort {

    private ArrayList<Queue> queues;
    private long[] array;
    private boolean isLastIteration;


    public void doSort(long[] arr, int notation) {
        this.array = arr;
        queuesInit(notation);

        int digit = 1;

        while (true) {
            partitionOfIndex(digit);

            digit++;

            showAllList();
            System.out.println("--------------------------------");

            if (isLastIteration) {
                break;
            }

            assemblyToArray();
        }
    }

    private void queuesInit(int numberSize) {
        queues = new ArrayList<>();

        for (int i = 0; i < numberSize; i++) {
            queues.add(new Queue());
        }
    }

    private void partitionOfIndex(int index) {
        isLastIteration = true;
        for (long l : array) {
            String number = String.valueOf(l);
            int position;
            if (number.length() - index < 0) {
                position = 0;
            } else {
                isLastIteration = false;
                position = Integer.parseInt(String.valueOf(number.charAt(number.length() - index)));
            }
            queues.get(position).insert(l);
        }
    }

    private void assemblyToArray() {
        array = new long[array.length];
        int pos = 0;
        for (Queue queue : queues) {
            while (!queue.isEmpty()) {
                array[pos] = queue.pop();
                pos++;
            }
        }
    }

    private void showAllList() {
        for (Queue queue : queues) {
            queue.showAllElements();
            System.out.println();
        }
    }

    public void showResult() {
        if (array == null) {
            System.out.println("Array is Empty");
        } else {
            queues.get(0).showAllElements();
        }
    }
}
