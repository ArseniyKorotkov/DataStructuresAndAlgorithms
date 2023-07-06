package track4StackAndQueue.pack4Projects.p2;

public class DequeApp {

    public static void main(String[] args) {
        DequeX dequeX = new DequeX(5);

        dequeX.insertRight(6);
        dequeX.insertRight(7);
        dequeX.insertLeft(5);
        dequeX.insertLeft(4);
//        dequeX.insertRight(7);
//        dequeX.insertLeft(5);
//        dequeX.insertLeft(4);
//        dequeX.insertRight(3);
////        dequeX.insertLeft(3);
//        dequeX.insertLeft(2);
        dequeX.showDeque();
        dequeX.showArray();

        System.out.println("size = " + dequeX.dequeSize());
//        dequeX.removeLeft();
//        dequeX.removeRight();
//
//        dequeX.insertLeft(2);
//        dequeX.insertLeft(1);
//        dequeX.insertLeft(0);
//        dequeX.showArray();
//        dequeX.showDeque();
    }
}
