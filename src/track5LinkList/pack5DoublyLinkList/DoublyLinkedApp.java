package track5LinkList.pack5DoublyLinkList;

public class DoublyLinkedApp {

    public static void main(String[] args) {
        DoublyLinked theList = new DoublyLinked();
        theList.addLeft(22); // Вставка в начале
        theList.addLeft(44);
        theList.addLeft(66);
        theList.addRight(11); // Вставка в конце
        theList.addRight(33);
        theList.addRight(55);
        theList.showList(); // Вывод в прямом направлении
        theList.showListReverse(); // Вывод в обратном направлении
        theList.removeFirst(); // Удаление первого элемента
        theList.removeLast(); // Удаление последнего элемента
        theList.remove(11); // Удаление элемента с ключом 11
        theList.showList(); // Вывод в прямом направлении
        theList.addAfter(22, 77); // Вставка 77 после 22
        theList.addAfter(33, 88); // Вставка 88 после 33
        theList.showList(); // Вывод в прямом направлении
    }
}
