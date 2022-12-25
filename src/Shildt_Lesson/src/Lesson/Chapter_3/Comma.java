package Shildt_Lesson.src.Lesson.Chapter_3;
//стр 115
//  Применение запятых в определении цикла for
public class Comma {
    public static void main(String[] args) {
        int i, j;

        for(i = 0, j = 10; i < j; i++, j--) // Для управления этим циклом используется две переменные
            System.out.println("i и j: " + i + " " + j);
    }
}
/*
В данном примере запятыми разделяются два оператора инициализации и
еще два итерационных выражения. Когда цикл начинается, инициализируются
обе переменные, i и j . Всякий раз, когда цикл повторяется, переменная i ин-
крементируется, а переменная j декрементируется.
 */

//стр 147 Полное руководство

//Использование запятой
class Comma1{
    public static void main(String[] args) {
        int a, b;
        for(a=1 , b=4; a<b; a++, b--) {
            System.out.println("a =  " + a );
            System.out.println("b =  " + b );
        }
    }
}