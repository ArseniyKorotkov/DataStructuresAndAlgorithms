package track3SimpleSorts.part5Projects.p1;

import java.util.Date;

public class BubbleSortApp {

    public static void main(String[] args) {
        int maxSize = 100; // Размер массива
        ArrayBub arr; // Ссылка на массив
        arr = new ArrayBub(maxSize); // Создание массива
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


        arr.display(); // Вывод элементов
        Date date = new Date();
        arr.bubbleSort(); // Пузырьковая сортировка элементов
        Date date1 = new Date();
        arr.display(); // Повторный вывод
        System.out.println(date1.getTime() - date.getTime());
    } //
}
