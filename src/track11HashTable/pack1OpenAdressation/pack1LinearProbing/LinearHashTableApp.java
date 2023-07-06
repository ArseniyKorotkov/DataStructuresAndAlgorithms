package track11HashTable.pack1OpenAdressation.pack1LinearProbing;

public class LinearHashTableApp {

    public static void main(String[] args) {
        LinearHashTable table = new LinearHashTable(4);

        table.insert("Alex", 7);
        table.insert("Anna", 4);
        table.insert("Arseni", 2);
        table.insert("Tatsiana", 3);
        table.insert("Inna", 1);
        table.insert("Pol", 9);
        table.insert("Katarina", 8);
        table.insert("Irina", 6);
        table.insert("Roman", 5);

        table.delete("Irina");

        System.out.println("Alex number is " + table.find("Alex").getPhoneNumber());
        System.out.println("Roman number is " + table.find("Roman").getPhoneNumber());
        System.out.println("size is " + table.size());
        System.out.println("capacity is " + table.capacity());

        table.showHashTable();

    }
}
