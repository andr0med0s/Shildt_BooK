package Lesson.Chapter_2;
//стр 95
// Неожиданный результат повышения типов!
public class PromDemo {
    public static void main(String[] args) {
        byte b;
        int i;

        b = 10;
        i = b * b; // приведение типов не требуется, так как тип уже повышен до int

        b = 10;
        b = (byte) (b * b); // нужно приведение типов! Здесь для присваивания значения int
                            // переменной типа byte требуется привидение типов!

        System.out.println("i и b: " + i + " " + b);
    }
}
/*
Например, в следующем фрагменте кода требуется обратное при-
ведение к типу char, поскольку операнды ch1 и ch2 в выражении повышаются
до типа int.
char ch1 = 'a', ch2 = 'b';
ch1 = (char) (ch1 + ch2);
Без приведения типов результат сложения операндов ch1 и ch2 будет иметь
тип int, поэтому его нельзя присвоить переменной типа char.
 */