package track2Array.part2LowArray;

public class LowArrayApp {

    public static void main(String[] args) {

        LowArray arr = new LowArray(100);
        int nElems = 0; // Количество элементов
        int j; // Счетчик цикла
        long searchKey; // Ключи искомого элемента
//--------------------------------------------------------------
        arr.setElem(0, 77); // Вставка 10 элементов
        arr.setElem(1, 99);
        arr.setElem(2, 44);
        arr.setElem(3, 55);
        arr.setElem(4, 22);
        arr.setElem(5, 88);
        arr.setElem(6, 11);
        arr.setElem(7, 00);
        arr.setElem(8, 66);
        arr.setElem(9, 33);
        nElems = 10; // Массив содержит 10 элементов
//--------------------------------------------------------------
        for (j = 0; j < nElems; j++) // Вывод элементов
            System.out.print(arr.getElem(j) + " ");
        System.out.println("");
//--------------------------------------------------------------
        searchKey = 66; // Поиск элемента с ключом 66
        for (j = 0; j < nElems; j++) // Для каждого элемента
            if (arr.getElem(j) == searchKey) // Значение найдено?
                break; // Да - выход из цикла
        if (j == nElems) // Достигнут последний элемент?
            System.out.println("Can't find " + searchKey); // Да
        else
            System.out.println("Found " + searchKey); // Нет
//--------------------------------------------------------------
        searchKey = 55; // Удаление элемента с ключом 55
        for (j = 0; j < nElems; j++) // Поиск удаляемого элемента
            if (arr.getElem(j) == searchKey)
                break;
        for (int k = j; k < nElems - 1; k++) // Сдвиг последующих элементов
            arr.setElem(k, arr.getElem(k + 1));
        nElems--; // Уменьшение размера
//--------------------------------------------------------------
        for (j = 0; j < nElems; j++) // Вывод элементов
            System.out.print(arr.getElem(j) + " ");
        System.out.println("");
    }
}
