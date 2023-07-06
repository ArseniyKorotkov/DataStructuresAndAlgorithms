package track11HashTable.pack3ChainFromThree;

import static track11HashTable.pack3ChainFromThree.ChainHash.hashFunction;
import track11HashTable.Person;
import java.util.NoSuchElementException;


public class BinaryFindTree {

    private Node rootNode;
    private int size;
    private int insideSize;
    private Node[] array;

    public void insert(Person person) {
        int checkInsideSize = 1;
        Node newNode = new Node(person);
        if (isEmpty()) {
            rootNode = newNode;
            insideSize++;
        } else {
            Node current = rootNode;
            while (true) {
                checkInsideSize++;
                if (hashFunction(current.getPerson().getName()) > hashFunction(person.getName())) {
                    if (current.getLeftChild() == null) {
                        current.setLeftChild(newNode);
                        break;
                    } else {
                        current = current.getLeftChild();
                    }
                } else {
                    if (current.getRightChild() == null) {
                        current.setRightChild(newNode);
                        break;
                    } else {
                        current = current.getRightChild();
                    }
                }
            }
            if (checkInsideSize > insideSize) {
                insideSize = checkInsideSize;
            }
        }

        size++;
    }

    public Person find(String name) {
        int placeNumber = hashFunction(name);
        Node current = rootNode;
        while (!current.getPerson().getName().equals(name)) {

            if (hashFunction(current.getPerson().getName()) > placeNumber) {
                current = current.getLeftChild();
            } else {
                current = current.getRightChild();
            }
            if (current == null) {
                throw new NoSuchElementException();
            }

        }
        return current.getPerson();
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void showThree() {
        Node[] showArray = generateArray();

        int oldI = 0;
        int spaceWithElements = showArray.length / 2;
        for (int i = 0; i < showArray.length; i++) {

            for (int j = 0; j < spaceWithElements; j++) {
                System.out.print("   ");
            }

            if (showArray[i] == null) {
                System.out.print(" - ");
            } else {
                System.out.print(" " + showArray[i].getPerson().getName() + " " + hashFunction(showArray[i].getPerson().getName()) + " ");
            }

            for (int j = 0; j < spaceWithElements + 1; j++) {
                System.out.print("   ");
            }

            if (i == oldI * 2 + 2 || i == 0) {
                if (i != 0) {
                    oldI = i;
                }
                System.out.println();
                spaceWithElements = spaceWithElements / 2;
            }


        }
    }

    private Node[] generateArray() {

        array = new Node[countAllSlots()];

        addNoteArray(rootNode, 1);

        return array;
    }

    protected Person[] getAllPersons() {

        Node[] nodes = generateArray();

        Person[] people = new Person[size];
        int i = 0;

        for(Node node : nodes) {
            if(node != null) {
                people[i] = node.getPerson();
                i++;
            }
        }

        return people;
    }

    private void addNoteArray(Node parentNode, int numberPlace) {
        if (parentNode == null) {
            return;
        }
        array[numberPlace - 1] = parentNode;
        addNoteArray(parentNode.getLeftChild(), numberPlace * 2);
        addNoteArray(parentNode.getRightChild(), (numberPlace * 2) + 1);
    }

    private int countAllSlots() {
        int slotCounter = 0;
        int stringSlotCounter = 1;
        for (int i = 0; i < insideSize; i++) {
            slotCounter = slotCounter + stringSlotCounter;
            stringSlotCounter *= 2;
        }
        return slotCounter;
    }

    public int getInsideSize() {
        return insideSize;
    }

}
