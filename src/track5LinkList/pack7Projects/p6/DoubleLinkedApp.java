package track5LinkList.pack7Projects.p6;

public class DoubleLinkedApp {

    public static void main(String[] args) {
        DoubleLinkedArray array = new DoubleLinkedArray();

        array.createSlot(4, 6, 9);
        array.createSlot(4, 4, 7);
        array.createSlot(4, 5, 8);

        array.createSlot(3, 6, 6);
        array.createSlot(3, 4, 4);
        array.createSlot(3, 5, 5);


        System.out.println(array.current().getElement());
        System.out.print(array.current().getNextLinked().getElement() + " ");
        System.out.println(array.current().getNextLinked().getNextLink().getElement());

        System.out.println();

        array.DoubleShow();
    }
}
