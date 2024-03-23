package Lesson.Chapter_6;
// стр 239
//Перегрузка конструкторов

//Демонстрация перегрузки конструктора
class MyClass1 {
    int x;

    MyClass1() {
        System.out.println("Внутри MyClass(). ");
        x = 0;
    }

    MyClass1(int i) {
        System.out.println("Внутри MyClass(int). ");
        x = i;
    }

    MyClass1(double d) {
        System.out.println("Внутри MyClass(double). ");
        x = (int) d;
    }

    MyClass1(int i, int j) {
        System.out.println("Внутри MyClass(int, int). ");
        x = i * j;
    }
}

class OverloadConsDemo {
    public static void main(String[] args) {
        MyClass1 tl = new MyClass1();
        MyClass1 t2 = new MyClass1(88);
        MyClass1 t3 = new MyClass1(17.23);
        MyClass1 t4 = new MyClass1(2, 4);

        System.out.println("tl.x: " + tl.x);
        System.out.println("t2.x : " + t2.x);
        System.out.println("t3.x : " + t3.x);
        System.out.println("t4.x: " + t4.x);
    }
}
/*
* Конкретный вариант конструктора выбирается на основании
параметров, которые указываются при выполнении оператора new. Перегружая
конструктор класса, вы предоставляете пользователю созданного вами класса
свободу в выборе способа конструирования объекта.
*
* Перегрузка конструкторов чаще всего используется для того, чтобы дать
* возможность инициализировать один объект на основании другого объекта.
* */

// Инициализация одного объекта посредством другого стр 241

class Summation {
    int sum;

    //Создание объекта на основе целочисленного значения
    Summation(int num) { //--Создание одного объекта на основании другого объекта
        sum = 0;
        for (int i = 1; i <= num; i++)
            sum += i;
    }

    //Создание одного объекта на основе другого
    Summation(Summation ob) {
        sum = ob.sum;
    }
}

class SumDemo {
    public static void main(String[] args) {
        Summation s1 = new Summation(5);
        Summation s2 = new Summation(s1);

        System.out.println("s1.sum: " + s1.sum);
        System.out.println("s2.sum: " + s2.sum);
    }
}

