package Lesson.Chapter_2;
// стр 68
/*
Определение длины гипотенузы исходя из длины катетов,
по теореме Пифагора
*/
public class Hypot {
    public static void main(String[] args) {
        double x, y, z;

        x = 3;
        y = 4;
        z =  Math.sqrt(x*x + y*y);
        /*
        Обратите внимание на вызов метода sqrt().
        Перед именем метода указывается имя класса,
        членом которого он является,
        */

        System.out.println("Длина гипотенузы: " + z);
    }
}
