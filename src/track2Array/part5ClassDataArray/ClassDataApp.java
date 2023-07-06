package track2Array.part5ClassDataArray;

public class ClassDataApp {

    public static void main(String[] args) {
        int maxSize = 100; // Размер массива
        ClassDataArray arr; // Ссылка на массив
        arr = new ClassDataArray(maxSize); // Создание массива
// Вставка 10 элементов
        arr.insert("Evans", "Patty", 24);
        arr.insert("Smith", "Lorraine", 37);
        arr.insert("Yee", "Tom", 43);
        arr.insert("Adams", "Henry", 63);
        arr.insert("Hashimoto", "Sato", 21);
        arr.insert("Stimson", "Henry", 29);
        arr.insert("Velasquez", "Jose", 72);
        arr.insert("Lamarque", "Henry", 54);
        arr.insert("Vang", "Minh", 22);
        arr.insert("Creswell", "Lucinda", 18);
        arr.display(); // Вывод содержимого
        String searchKey = "Stimson"; // Поиск элемента
        int found;
        found=arr.find(searchKey);
        if (found != -1)
        {
            System.out.print("Found ");
            arr.get(found).ifPresent(Person::displayPerson);
        }
        else
            System.out.println("Can't find " + searchKey);
        System.out.println("Deleting Smith, Yee, and Creswell");
        arr.delete("Smith"); // Удаление трех элементов
        arr.delete("Yee");
        arr.delete("Creswell");
        arr.display(); // Повторный вывод содержимого
    }
}
