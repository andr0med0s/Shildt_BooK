package Shildt_Lesson.src.Exercise.Chapter_6;

// Класс, реализующий стек для хранения символов
class Stack {
    private char stck[]; // массив для хранения элементов стека
    private int tos;     // вершина стека

    // Создать пустой стек заданного размера
    Stack(int size) {
        stck = new char[size]; // выделить память для стека
        tos = 0;
    }

    // Создать один стек на основе другого стека
    Stack(Stack ob) {
        tos = ob.tos;
        stck = new char[ob.stck.length];
// Скопировать элементы
        for (int i = 0; i < tos; i++)
            stck[i] = ob.stck[i];
    }

    // Создать стек с начальными значениями
    Stack(char a[]) {
        stck = new char[a.length];
        for (int i = 0; i < a.length; i++) {
            push(a[i]);
        }
    }

    // Поместить символ в стек
    void push(char ch) {
        if (tos == stck.length) {
            System.out.println(" -- Стек заполнен");
            return;
        }
        stck[tos] = ch;
        tos++;
    }

    // Извлечь символ из стека
    char pop() {
        if (tos == 0) {
            System.out.println(" -- Стек пуст");
            return (char) 0;
        }
        tos--;
        return stck[tos];
    }
}

// Демонстрация использования класса Stack
public class SDemo {
    public static void main(String args[]) {
// создать пустой стек на 10 элементов
        Stack stk1 = new Stack(10);

        char name[] = {'T', 'o', 'm' };

// создать стек из массива
        Stack stk2 = new Stack(name);
        char ch;
        int i;

// поместить символы в стек stk1
        for (i = 0; i < 10; i++)
            stk1.push((char) ('A' + i));

// создать один стек из другого стека
        Stack stk3 = new Stack(stk1);

// отобразить стеки
        System.out.print("Содержимое stkl: ");
        for (i = 0; i < 10; i++) {
            ch = stk1.pop();
            System.out.print(ch);
        }

        System.out.println("\n");

        System.out.print("Содержимое stk2: ");
        for (i = 0; i < 3; i++) {
            ch = stk2.pop();
        System.out.print(ch);
        }

        System.out.println("\n");

        System.out.print("Содержимое stk3: ");
        for (i = 0; i < 10; i++) {
            ch = stk3.pop();
            System.out.print(ch);
        }
    }
}
