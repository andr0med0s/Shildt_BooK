package Shildt_Lesson.src.Lesson.Chapter_2;
//стр 86 Java Полное руководство 12-е издание
public class CharDemo {
    // Демонстрация использования типа данных char.
    public static void main(String[] args) {
        char chl, ch2;
        chl = 88; //код для Х
        ch2 = 'Y';
        System.out.print("chl и ch2 : ");
        System.out.println(chl + " " + ch2);
    }
}

/*
Хотя тип char предназначен для хранения символов Unicode, его также
можно применять как целочисленный тип, с которым допускается выполнять
арифметические операции. Скажем, вы можете сложить два символа вместе
либо инкрементировать значение символьной переменной.
 */
