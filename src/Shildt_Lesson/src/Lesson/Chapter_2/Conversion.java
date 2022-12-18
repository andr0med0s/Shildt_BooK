package Shildt_Lesson.src.Lesson.Chapter_2;
// стр 97 Полное руководство 12-е издание
// демонстрация приведений
public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;

        System.out.println("\nПреобразование int в byte.");
        b = (byte) i;
        System.out.println("i и b: " + i + " " + b);

        System.out.println("\nПреобразование double в int.");
        i = (int) d;
        System.out.println("d и i: " + d + " " + i);

        System.out.println("\nПреобразование double в byte.");
        b = (byte) d;
        System.out.println("d и b: " + d + " " + b);
    }
}
/*
Давайте обсудим каждое преобразование. Когда значение 257 приводит-
ся к типу byte, результатом будет остаток от деления 2 57 на 256 (диапазон
byte), который в данном случае равен 1. Когда значение переменной d пре-
образуется в тип int, его дробная часть утрачивается. Когда значение пере-
менной d преобразуется в тип byte, его дробная часть теряется, а значение
уменьшается по модулю 256, что в этом случае дает 67.
 */