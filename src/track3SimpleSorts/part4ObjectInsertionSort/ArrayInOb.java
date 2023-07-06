package track3SimpleSorts.part4ObjectInsertionSort;

public class ArrayInOb {

    private Person[] people;
    private int size;

    public ArrayInOb(int max) {
        people = new Person[max];
    }

    public Person get(int index) {
        return people[index];
    }

    public void insert(String lName, String fName, int age) {
        people[size++] = new Person(lName, fName, age);
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            people[i].displayPerson();
        }
    }

    public void insertionSort() {
        Person spare;
        for (int i = 1; i < size; i++) {
            if (people[i].compareTo(people[i - 1]) < 0) {
                spare = people[i];
                int j;
                for (j = i; j > 0; j--) {
                    if (spare.compareTo(people[j - 1]) >= 0) {
                        break;
                    }
//                    if (spare.getLast().compareTo(people[j - 1].getLast()) > 0) {
//                        break;
//                    }
                    people[j] = people[j - 1];
                }
                people[j] = spare;
            }
        }
    }
}
