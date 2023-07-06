package track11HashTable.pack1OpenAdressation.pack2SquareProbing;

import track11HashTable.Person;

public class SquareHashTable {

    private Person[] people;
    private Person emptyPerson;
    private int capacity;
    private int size;

    public SquareHashTable(int capacity) {
        this.capacity = capacity;
        people = new Person[capacity];
        emptyPerson = new Person(null, -1);
    }

    public void insert(String name, int phoneNumber) {
        Person person = new Person(name, phoneNumber);
        int position = hashFunction(name);
        int step  = 1;
        while (true) {
            if(people[position] == null || people[position].getName() == null) {
                people[position] = person;
                break;
            }
            position += (step * step);
            position %= capacity;
            step++;
        }
        size++;
    }

    public Person find(String name) {
        int position = hashFunction(name);
        int step  = 1;
        while (true) {
            if(people[position] != null && people[position].getName() != null && people[position].getName().equals(name)) {
                return people[position];
            }
            if(people[position] == null) {
                return null;
            }
            position += (step * step);
            position %= capacity;
            step++;
        }
    }

    public void delete(String name) {
        int position = hashFunction(name);
        int step  = 1;
        while (true) {
            if(people[position] != null && people[position].getName() != null && people[position].getName().equals(name)) {
                people[position] = emptyPerson;
                break;
            }
            position += (step * step);
            position %= capacity;
            step++;
        }
    }

    private int hashFunction(String name){
        int hash = 0;
        for (int i = 0; i < name.length(); i++) {
            hash += name.charAt(i) + Math.pow(i + 1, 2);
        }
        hash = hash % capacity;
        return hash;
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
