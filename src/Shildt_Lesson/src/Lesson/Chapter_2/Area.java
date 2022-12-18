package Shildt_Lesson.src.Lesson.Chapter_2;

//стр 85 Java Полное руководство 12-е издание
//Вычислить плошадь круга.
public class Area {
    public static void main(String[] args) {
        double pi, r, a;

        r = 10.8; // радиус круга
        pi = 3.1416;
        a = pi * r * r; //площадь

        System.out.println("Площадь круга равна  " + a);
    }
}
