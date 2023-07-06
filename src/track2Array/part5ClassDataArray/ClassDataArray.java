package track2Array.part5ClassDataArray;

import java.util.Optional;

public class ClassDataArray {

    private Person[] people;
    private int size;

    public ClassDataArray(int max) {
        people = new Person[max];
    }

    public void add(Person p) {
        if(size < people.length)
        people[size] = p;
        size++;
    }

    public Optional<Person> get(int index) {
        Optional<Person> person = Optional.empty();
        if(index < size) {
            person = Optional.of(people[index]);
        }

        return person;
    }

    public void insert(String fName, String lName, int age) {
        if(size < people.length)
        people[size] = new Person(fName, lName, age);
        size++;
    }

    public int find(String lName) {
        for (int i = 0; i < size; i++) {
            if(lName.equals(people[i].getLast())) {
                return i;
            }
        }
        return -1;
    }

    public boolean delete(String lName) {
        int index = find(lName);
        if(index == -1) {
            return false;
        } else {
            for (int i = index; i < size - 1; i++) {
                people[i] = people[i + 1];
            }
            size--;
            return true;
        }
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            people[i].displayPerson();
        }
    }
}
