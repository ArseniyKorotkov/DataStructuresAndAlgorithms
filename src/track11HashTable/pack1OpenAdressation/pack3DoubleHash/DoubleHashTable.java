package track11HashTable.pack1OpenAdressation.pack3DoubleHash;

import track11HashTable.Person;

public class DoubleHashTable {

    private final Person[] people;
    private final Person emptyPerson;
    private int capacity;
    private int size;

    public DoubleHashTable(int capacity) {
        if(capacity < 2) capacity = 7;
        this.capacity = capacity;
        people = new Person[capacity];
        emptyPerson = new Person(null, -1);
    }

    public void insert(String name, int phoneNumber) {
        int hash = hashFunction(name);
        int position = hash % capacity;
        int step = hashFunction(hash);
        while (true) {
            if(people[position] == null || people[position].getName() == null) {
                people[position] = new Person(name, phoneNumber);
                break;
            }
            position += step;
            position %= capacity;
        }
    }

    public Person find(String name) {
        int hash = hashFunction(name);
        int position = hash % capacity;
        int step = hashFunction(hash);
        while (true) {
            if(people[position] != null && people[position].getName() != null && people[position].getName().equals(name)) {
                return people[position];
            }
            if(people[position] == null) {
                return null;
            }
            position += step;
            position %= capacity;

        }
    }

    public void delete(String name) {
        int hash = hashFunction(name);
        int position = hash % capacity;
        int step = hashFunction(hash);
        while (true) {
            if(people[position] != null && people[position].getName() != null && people[position].getName().equals(name)) {
                people[position] = emptyPerson;
                break;
            }
            position += step;
            position %= capacity;

        }
    }



    private int hashFunction(String name){
        int hash = 0;
        for (int i = 0; i < name.length(); i++) {
            hash += name.charAt(i) + Math.pow(i + 1, 2);
        }
        return hash;
    }

    private int hashFunction(int hash) {
        return (capacity - 1) - (hash % (capacity - 1));
    }

    public void showHashTable() {
        for (Person person : people) {
            if (person == null) {
                System.out.print("null  ");
            } else {
                System.out.print(person.getPhoneNumber() + "  ");
            }
        }
        System.out.println();
    }

    public int getSize() {
        return size;
    }
}
