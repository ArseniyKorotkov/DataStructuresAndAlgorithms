package track11HashTable.pack1OpenAdressation.pack1LinearProbing;

import track11HashTable.Person;

import java.util.ArrayList;
import java.util.List;

public class LinearHashTable {

    private Person[] people;
    private int capacity;
    private int size;

    public LinearHashTable(int capacity) {
        if (capacity < 1) {
            capacity = 1;
        } else {
            capacity = nextPrimeNumber(capacity);
        }
        this.capacity = capacity;
        this.people = new Person[this.capacity];
    }

    public LinearHashTable() {
        capacity = 7;
        this.people = new Person[this.capacity];
    }

    public void insert(String name, int number) {
        Person person = new Person(name, number);
        int position = hashFunction(name);
        while (true) {
            if (people[position % capacity] == null || people[position % capacity].getName() == null) {
                people[position % capacity] = person;
                break;
            }
            position++;
        }
        size++;
        if (size > capacity * 2 / 3) {
            rehash();
        }
    }

    public Person find(String name) {
        Person returnPerson = null;
        int position = hashFunction(name);
        while (people[position % capacity] != null) {
            if (people[position % capacity].getName() != null && people[position % capacity].getName().equals(name)) {
                returnPerson = people[position % capacity];
                break;
            }
            position++;
        }
        return returnPerson;
    }

    public void delete(String name) {
        int position = hashFunction(name);
        while (people[position % capacity] != null) {
            if (people[position % capacity].getName() != null && people[position % capacity].getName().equals(name)) {
                people[position % capacity] = new Person(null, -1);
                break;
            }
            position++;
        }
    }

    private int hashFunction(String name) {
        int hash = 0;
        int bitDepth = countBitDepth();
        for (int j = 0; j < name.length(); ) {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < bitDepth && j < name.length(); i++, j++) {
                builder.append((int) name.charAt(j));
            }
            hash = (hash + Integer.parseInt(builder.toString())) % capacity;
        }
        return hash;
    }

    private int countBitDepth() {
        int i;
        int bitDepth;
        for (i = capacity, bitDepth = 1; i / 10 >= 10; i /= 10, bitDepth++) ;
        return bitDepth;
    }

    private void rehash() {
        size = 0;

        if (needMoreCapacity()) {
            capacity = nextPrimeNumber(capacity);
        }
        Person[] spare = people;
        people = new Person[capacity];

        for (Person person : spare) {
            if (person != null && person.getName() != null) {
                insert(person.getName(), person.getPhoneNumber());
            }
        }
    }

    private int nextPrimeNumber(int capacity) {
        List<Integer> primeNumbers = new ArrayList<>();
        if (capacity == 1) return 2;
        if (capacity == 2) return 3;

        int spare = 3;

        primeNumbers.add(spare);

        do {
            boolean isPrime = true;
            spare += 2;
            for (Integer i : primeNumbers) {
                if (spare % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeNumbers.add(spare);
            }
        } while (primeNumbers.get(primeNumbers.size() - 1) <= capacity);

        return primeNumbers.get(primeNumbers.size() - 1);
    }

    private boolean needMoreCapacity() {
        int deleteCounter = 0;
        for (Person person : people) {
            if (person != null && person.getName() == null) {
                deleteCounter++;
            }
        }
        return deleteCounter <= capacity / 2;
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

    public int size() {
        return size;
    }

    public int capacity() {
        return capacity;
    }
}
