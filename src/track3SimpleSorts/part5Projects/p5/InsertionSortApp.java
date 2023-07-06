package track3SimpleSorts.part5Projects.p5;


public class InsertionSortApp {
    public static void main(String[] args) {
        int maxSize = 100; // Размер массива
        ArrayIns arr; // Ссылка на массив
        arr = new ArrayIns(maxSize); // Создание массива
        for (long i = 200; i > 50; i -= 3) {
            arr.insert(i);
        }


//        for (long i = 200; i > 170; i -= 3) {
//            arr.insert(i);
//        }
//
//        for (long i = 0; i < 80; i += 2) {
//            arr.insert(i);
//        }
        arr.display(); // Вывод элементов
        arr.insertionSort(); // Сортировка методом выбора
        arr.display();
        System.out.println(arr.size());
    }
}
