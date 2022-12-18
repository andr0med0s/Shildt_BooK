package Shildt_Lesson.src.Lesson.Chapter_2;
// стр 80
//Демонстрация времени жизни переменной
public class VarInitDemo {
    public static void main(String[] args) {
        int x;

        for(x = 0; x < 3; x++) {
            int y = -1; // переменная y инициализируется при каждом входе в блок
            System.out.println("y: " + y); // всегда выводится значение -1

            y = 100;
            System.out.println("Измененное значение y: " + y);
        }
    }
}
/*
 на каждом шаге цикла for переменная у инициализируется значением
 -1. Затем ей присваивается значение 100, но по завершении блока кода
данного цикла оно теряется.
*/