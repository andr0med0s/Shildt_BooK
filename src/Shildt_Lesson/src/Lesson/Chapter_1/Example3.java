package Shildt_Lesson.src.Lesson.Chapter_1;
// стр 50
// Демонстрация различий между типами int и double
public class Example3 {
    public static void main(String[] args) {
        int var; // объявление целочисленной переменной
        double x; // объявление переменной с плавающей запятой

        var = 10; // присваивание переменной var значений 10

        x = 10.0; // присваивание переменной x значений 10.0

        System.out.println("Начальное значение переменной var: " + var);
        System.out.println("Начальное значение переменной x: " + x);
        System.out.println();

        // Деление значение обеих переменных на 4
        var = var / 4;
        x = x / 4;

        System.out.println("Значение переменной var после деления: " + var);
        System.out.println("Значение переменной x после деления: " + x );
    }
    
}
