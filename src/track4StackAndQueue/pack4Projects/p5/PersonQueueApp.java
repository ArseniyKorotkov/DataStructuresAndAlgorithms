package track4StackAndQueue.pack4Projects.p5;

public class PersonQueueApp {

    public static void main(String[] args) {
        Store store = new Store();
        for (int i = 0; i < 100; i++) {
            store.welcome(new Person());
        }
        store.showSizes();
    }
}
