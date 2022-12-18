package Shildt_Lesson.src.Lesson.Chapter_2;

// стр 77
// Демонстрация динамической инициализации
public class DynInit {
    public static void main(String[] args) {
        double radius = 4, height = 5;

        // Переменная volume инициализируется динамически во время выполнения программы
        double volume = 3.1416 * radius * radius * height;

        System.out.println("Объем: " + volume);
    }
}
// стр 92 Полное руководство 12-е издание
// Демонстрация использования динамической инициализации.
/*
class DynInit {
    public static void main(String[] args) {
        double а = 3.0, Ь = 4.0;
// Переменная с инициализируется динамически.
        double с = Math.sqrt(а * а + Ь * Ь);
        System.out.println("Длина гипотенузы равна " + с);
    }
}
 */