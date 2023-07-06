package track11HashTable.pack3ChainFromThree;

import track11HashTable.Person;

public class ChainHash {

    private BinaryFindTree[] trees;
    private int capacity;
    private int size;

    public ChainHash(int capacity) {
        this.capacity = capacity;
        trees = new BinaryFindTree[capacity];
    }

    public void insert(String name, int phoneNumber) {
        Person person = new Person(name, phoneNumber);

        int position = hashFunction(name) % capacity;
        if (trees[position] == null) {
            trees[position] = new BinaryFindTree();
        }

        trees[position].insert(person);

        size++;
        if (trees[position].getInsideSize() > 3) {
            updateCapacity();
        }
    }

    public Person find(String name) {

        int position = hashFunction(name) % capacity;

        return trees[position].find(name);
    }

    private void updateCapacity() {
        BinaryFindTree[] spare = trees;
        capacity *= 2;
        trees = new BinaryFindTree[capacity];
        size = 0;
        for (BinaryFindTree tree : spare) {

            Person[] people = tree.getAllPersons();
            for(Person person : people) {
                insert(person.getName(), person.getPhoneNumber());
            }
        }
    }

    protected static int hashFunction(String name) {
        int hash = 0;
        for (int i = 0; i < name.length(); i++) {
            hash += name.charAt(i) * (i + 1);
        }
        return hash;
    }

    public void showTable() {
        for(BinaryFindTree tree : trees) {
            if(tree != null) {
                tree.showThree();
                System.out.println("-----");
            }
        }
        System.out.println("++++++++++++++++++++++++++++++++");
    }

    public int getSize() {
        return size;
    }
}
