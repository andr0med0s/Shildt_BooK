package Shildt_Lesson.src.Lesson.Chapter_6;

/* стр 203 Полное руководство
// Демонстрация использования члена length в типе массива
* */
public class Length {
    public static void main(String[] args) {
        int[] a1 = new int[10];
        int[] a2 = {3, 5, 7, 1, 8, 99, 44, -10};
        int[] a3 = {4, 3, 2, 1};
        System.out.println("Длина a1 равна " + a1.length);
        System.out.println("Длинa а2 равна " + a2.length);
        System.out.println("Длина аЗ равна " + a3.length);
    }
}

// Усовершенствованный класс Stack, в котором
// используется член length в типе массива.
class Stack1 {
    private int[] stck;
    private int tos;

    // Разместить и инициализировать стек.
    Stack1(int size) {
        stck = new int[size];
        tos = -1;
    }

    //Поместить элемент в стек.
    void push(int item) {
        if (tos == stck.length - 1) // использовать член length
            System.out.println("Стек полон.");
        else
            stck[++tos] = item;
    }

    // Извлечь элемент из стека.
    int pop() {
        if (tos < 0) {
            System.out.println("Cтeк опустошен.");
            return 0;
        } else
            return stck[tos--];
    }
}

class TestStack2 {

    public static void main(String[] args) {
        Stack1 mystack1 = new Stack1(5);
        Stack1 mystack2 = new Stack1(8);
// Поместить несколько чисел в стеки.
        for (int i = 0; i < 5; i++) mystack1.push(i);
        for (int i = 0; i < 8; i++) mystack2.push(i);
// Извлечь эти числа из стеков.
        System.out.println("Cтeк в mystack1 : ");
        for (int i = 0; i < 5; i++)
            System.out.println(mystack1.pop());
        System.out.println("Cтeк в mystack2 : ");
        for (int i = 0; i < 8; i++)
            System.out.println(mystack2.pop());
    }
}
/*
* Обратите внимание, что в программе создаются два стека: один рассчитан
на хранение пяти, а другой - восьми элементов. Как видите, тот факт, что
массивы поддерживают собственную информацию о длине, упрощает создание
*  стеков любого размера
* */