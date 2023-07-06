package track11HashTable.pack1OpenAdressation.pack2SquareProbing;

import track11HashTable.Person;

public class SquareHashTableApp {

    public static void main(String[] args) {
        SquareHashTable table = new SquareHashTable(7);

        table.insert("Anna", 23);
        table.insert("Roman", 32);
        table.insert("Petr", 44);
        table.insert("Ivan", 18);
        table.insert("Sveta", 35);

        table.showHashTable();

        Person petr = table.find("Petr");
        System.out.println(petr.getPhoneNumber());
        table.delete("Petr");
        table.showHashTable();
        System.out.println(table.find("Petr"));
        table.insert("Petr", 45);
        table.showHashTable();


    }
}
