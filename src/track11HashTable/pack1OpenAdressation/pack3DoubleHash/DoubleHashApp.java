package track11HashTable.pack1OpenAdressation.pack3DoubleHash;

import track11HashTable.Person;

public class DoubleHashApp {

    public static void main(String[] args) {
        DoubleHashTable table = new DoubleHashTable(16);

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

        table.insert("Petr", 45);
        table.showHashTable();

        System.out.println();

        Person petr2 = table.find("Petr");
        System.out.println(petr2.getPhoneNumber() + "==45");

        Person ivan = table.find("Ivan");
        System.out.println(ivan.getPhoneNumber() + "==18");

        Person sveta = table.find("Sveta");
        System.out.println(sveta.getPhoneNumber() + "==35");
    }
}
