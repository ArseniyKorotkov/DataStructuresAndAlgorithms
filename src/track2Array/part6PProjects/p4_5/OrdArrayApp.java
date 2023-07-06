package track2Array.part6PProjects.p4_5;

public class OrdArrayApp {
    public static void main(String[] args) {
        int maxSize = 100; // Размер массива

        OrdArray arr; // Ссылка на массив
        arr = new OrdArray(maxSize); // Создание массива
        arr.insert(77); // Вставка 10 элементов
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(0);
        arr.insert(66);
        arr.insert(33);

        OrdArray arr2; // Ссылка на массив
        arr2 = new OrdArray(maxSize); // Создание массива
        arr2.insert(77); // Вставка 10 элементов
        arr2.insert(99);
        arr2.insert(44);
        arr2.insert(55);
        arr2.insert(22);
        arr2.insert(88);
        arr2.insert(11);
        arr2.insert(10);
        arr2.insert(0);
        arr2.insert(66);
        arr2.insert(33);

        OrdArray o3 = new OrdArray(100);




        arr.display(); // Вывод элементов
        int searchKey = 4; // Поиск элемента
        if (arr.find(searchKey))
            System.out.println("Found " + searchKey);
        else
            System.out.println("Can't find " + searchKey);
        arr.delete(0); // Удаление трех элементов
        arr.delete(55);
        arr.delete(99);
        arr.delete(98);
        o3.marge(arr, arr2);
        arr.display(); // Повторный вывод
        arr2.display();
        o3.display();
    }
}
