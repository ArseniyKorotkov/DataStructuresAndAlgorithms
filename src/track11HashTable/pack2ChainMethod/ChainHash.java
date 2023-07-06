package track11HashTable.pack2ChainMethod;

import track11HashTable.Person;

public class ChainHash {

    private Link[] links;
    private int capacity;
    private int size;

    public ChainHash(int capacity) {
        this.capacity = capacity;
        links = new Link[capacity];
    }

    public void insert(String name, int phoneNumber) {
        int chainLength = 1;
        int position = hashFunction(name) % capacity;
        Link link = new Link(new Person(name, phoneNumber));
        if (links[position] == null) {
            links[position] = link;
        } else {
            Link current = links[position];
            while (current.getNextLink() != null) {
                chainLength++;
                current = current.getNextLink();
            }
            current.setNextLink(link);
        }
        size++;
        if (chainLength > 4) {
            updateCapacity();
        }
    }

    public Person find(String name) {

        int position = hashFunction(name) % capacity;

        Link current = links[position];

        while (current != null) {
            if (current.getValue() != null && current.getValue().getName().equals(name)) {
                return current.getValue();
            }
            current = current.getNextLink();
        }
        return null;
    }

    public boolean delete(String name) {

        int position = hashFunction(name) % capacity;

        Link current = links[position];
        Link currentParent = null;

        while (current != null) {
            if (current.getValue() != null && current.getValue().getName().equals(name)) {
                if (currentParent == null) {
                    links[position] = current.getNextLink();
                } else {
                    currentParent.setNextLink(current.getNextLink());
                }
                size--;
                return true;
            }
            currentParent = current;
            current = current.getNextLink();
        }

        return false;
    }

    private void updateCapacity() {
        Link[] spare = links;
        capacity *= 2;
        links = new Link[capacity];
        size = 0;
        for (Link link : spare) {

            while (link != null) {
                Person person = link.getValue();
                String name = person.getName();
                int phoneNumber = person.getPhoneNumber();
                this.insert(name, phoneNumber);
                link = link.getNextLink();
            }
        }
    }

    public void showTable() {
        for (Link link : links) {

            if (link == null) {
                System.out.print("null ");
            }

            while (link != null) {
                System.out.print(link.getValue().getPhoneNumber() + " ");
                link = link.getNextLink();
            }

            System.out.println();
        }
        System.out.println();
    }

    private int hashFunction(String name) {
        int hash = 0;
        for (int i = 0; i < name.length(); i++) {
            hash += name.charAt(i) * (i + 1);
        }
        return hash;
    }

    public int getSize() {
        return size;
    }
}
