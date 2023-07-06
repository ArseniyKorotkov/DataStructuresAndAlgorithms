package track2Array.part4OrdArray;

public class OrdArrayApp {
    public static void main(String[] args) {
        int maxSize = 100; // Размер массива

        OrdArray arr; // Ссылка на массив
        arr = new OrdArray(maxSize); // Создание массива
//        arr.insert(77); // Вставка 10 элементов
//        arr.insert(99);
//        arr.insert(44);
//        arr.insert(55);
//        arr.insert(22);
//        arr.insert(88);
//        arr.insert(11);
//        arr.insert(0);
//        arr.insert(66);
//        arr.insert(33);

        arr.insert(1);
        arr.insert(2);
        arr.insert(3);


        arr.display(); // Вывод элементов
        int searchKey = 1; // Поиск элемента
        if (arr.find(searchKey))
            System.out.println("Found " + searchKey);
        else
            System.out.println("Can't find " + searchKey);
        arr.delete(0); // Удаление трех элементов
        arr.delete(55);
        arr.delete(99);
        arr.display(); // Повторный вывод
    }
}
