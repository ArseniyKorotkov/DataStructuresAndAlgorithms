package track12Heap.pack1HeapWithArray;

import java.util.ArrayList;
import java.util.List;

public class Heap {

    private List<Long> list = new ArrayList<>();

    public void add(long value) {
        list.add(value);

        upFrom(list.size() - 1);
    }

    public Long peek() {
        if (!isEmpty())
            return list.get(0);
        else
            return null;
    }

    public Long pop() {
        Long pop;
        if (!isEmpty()) {
            pop = list.get(0);
        } else {
            pop = null;
        }

        list.set(0, list.get(list.size() - 1));
        list.remove(list.size() - 1);
        if(!isEmpty()) {
            downFrom(0);
        }

        return pop;
    }

    private void upFrom(int position) {

        long spare = list.get(position);

        while (spare > list.get((position - 1) / 2) && position != 0) {
            list.set(position, list.get((position - 1) / 2));
            position = (position - 1) / 2;
        }

        list.set(position, spare);
    }

    private void downFrom(int position) {
        long spare = list.get(position);
        while ((position * 2 + 1) <= (list.size() - 1)) {
            if (position * 2 + 2 >= list.size() || list.get(position * 2 + 1) > list.get(position * 2 + 2)) {
                if (list.get(position * 2 + 1) > spare) {
                    list.set(position, list.get(position * 2 + 1));
                    position = position * 2 + 1;
                } else {
                    list.set(position, spare);
                    break;
                }
            } else {
                if (list.get(position * 2 + 2) > spare) {
                    list.set(position, list.get(position * 2 + 2));
                    position = position * 2 + 2;
                } else {
                    list.set(position, spare);
                    break;
                }
            }
        }
        list.set(position, spare);
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void showList() {
        for (Long value : list) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
