package track2Array.part6PProjects.p4_5;

import java.util.NoSuchElementException;

public class OrdArray {

    private final long[] a;
    private int size;

    public OrdArray(int max) {
        a = new long[max];
    }

    public long get(int index) {
        if(index < size) {
            return a[index];
        }
        throw new NoSuchElementException();

    }


    public void insert(long element) {
        if (size != a.length) {
            int s = 0;
            int f = size - 1;
            int elPoint;
            while (true) {
                if (size == 0) {
                    a[0] = element;
                    size++;
                    System.out.println("add " + element);
                    break;
                }
                elPoint = (s + f) / 2;
                if (a[elPoint] == element) {
                    System.out.println("don`t can add " + element);
                    break;
                } else if (element < a[elPoint]) {
                    f = elPoint - 1;
                } else {
                    s = elPoint + 1;
                }


                if (s > f) {
                    int n = 0;
                    if (element > a[elPoint]) {
                        n = 1;
                    }
                    for (int i = size; i > elPoint + n; i--) {
                        a[i] = a[i - 1];
                    }
                    a[elPoint + n] = element;
                    size++;
                    System.out.println("add " + element);
                    break;
                }
            }
        }
    }

    public boolean find(long element) {
        boolean b = false;
        int s = 0;
        int f = size - 1;
        int curIn;
        while (true) {
            curIn = ((s + f) / 2);
            if (a[curIn] == element) {
                b = true;
                break;
            } else if (element < a[curIn]) {
                f = curIn - 1;
            } else {
                s = curIn + 1;
            }

            if (s > f) {
                break;
            }
        }
        return b;
    }

    public void delete(long element) {
        int s = 0;
        int f = size - 1;
        int poz;

        while (true) {
            poz = (s + f) / 2;
            if (a[poz] == element) {
                for (int i = poz; i < size - 1; i++) {
                    a[i] = a[i + 1];
                }
                size--;
                break;
            } else if (element < a[poz]) {
                f = poz - 1;
            } else {
                s = poz + 1;
            }

            if (s > f) {
                System.out.println("don`t find " + element);
                break;
            }
        }
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    
    public OrdArray marge(OrdArray arrayA, OrdArray arrayB) {
        int sizeC = arrayA.size() + arrayB.size();
        OrdArray arrayC = new OrdArray(sizeC);
        for (int i = 0; i < arrayA.size(); i++) {
            arrayC.insert(arrayA.get(i));
        }
        for (int i = 0; i < arrayB.size(); i++) {
            arrayC.insert(arrayB.get(i));
        }
        return arrayC;
    }

    public int size() {
        return size;
    }
}
