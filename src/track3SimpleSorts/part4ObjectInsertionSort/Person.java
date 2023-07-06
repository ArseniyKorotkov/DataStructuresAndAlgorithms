package track3SimpleSorts.part4ObjectInsertionSort;

import java.util.Locale;

public class Person implements Comparable<Person> {
    private String lastName;
    private String firstName;
    private int age;

    //-----------------------------------------------------------
    public Person(String last, String first, int a) {
        // Конструктор
        lastName = last;
        firstName = first;
        age = a;
    }

    //-----------------------------------------------------------
    public void displayPerson() {
        System.out.print(" Last name: " + lastName);
        System.out.print(", First name: " + firstName);
        System.out.println(", Age: " + age);
    }

    //-----------------------------------------------------------
    public String getLast() { // Получение фамилии
        return lastName;
    }


    @Override
    public int compareTo(Person o) {
        char[] a = this.getLast().toLowerCase(Locale.ROOT).toCharArray();
        char[] b = o.getLast().toLowerCase(Locale.ROOT).toCharArray();
        int check = Math.min(a.length, b.length);
        for (int i = 0; i < check; i++)
            if (a[i] > b[i]) {
                return 1;
            } else if(a[i] < b[i]) {
                return -1;
            }

        return a.length - b.length;
    }
}
