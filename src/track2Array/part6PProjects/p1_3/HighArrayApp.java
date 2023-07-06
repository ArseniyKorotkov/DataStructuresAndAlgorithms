package track2Array.part6PProjects.p1_3;

public class HighArrayApp {
    public static void main(String[] args) {
        int maxSize = 100; // Размер массива

        HighArray arr; // Ссылка на массив
        arr = new HighArray(maxSize); // Создание массива
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


        HighArray sortArr = new HighArray(100);
        int iteration = arr.size();
        for (int i = 0; i < iteration; i++) {
            sortArr.insert(arr.getMax());
            arr.removeMax();
        }
        arr.display();
        sortArr.display();

    }
}
