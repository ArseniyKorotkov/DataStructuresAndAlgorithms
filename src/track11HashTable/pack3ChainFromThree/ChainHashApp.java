package track11HashTable.pack3ChainFromThree;

import track11HashTable.Person;

public class ChainHashApp {

    public static void main(String[] args) {

        ChainHash hash = new ChainHash(1);

        hash.insert("Anna", 23);
        hash.insert("Roman", 32);
        hash.insert("Petr", 44);
        hash.insert("Ivan", 18);
        hash.insert("Sveta", 35);

        hash.showTable();

        hash.insert("Kiril", 22);
        hash.insert("Maria", 31);

        hash.showTable();

        hash.insert("Mark", 88);
        hash.insert("Valeria", 11);

        hash.showTable();

        Person person = hash.find("Roman");
        System.out.println(person.getName() + " " + person.getPhoneNumber());

    }
}
