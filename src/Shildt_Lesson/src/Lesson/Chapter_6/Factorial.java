package Shildt_Lesson.src.Lesson.Chapter_6;

//стр 245 руководство для начинающих
//как в полном, но
// добавлен итеративный метод


// стр 194 Полное руководство
/*
* рекурсия - процесс определения чего-либо в
терминах самого себя. Что касается программирования на Java, то рекурсия
является характерной чертой, позволяющей методу вызывать самого себя.
Метод, который вызывает сам себя, называется рекурсивным.
* */
class Factorial {
    //Рекурсивный метод
    int fact(int n) {
        int result;

        if (n == 1) return 1;
        result = fact(n - 1) * n;
        return result;
        /*
         * Когда fact() вызывается с аргументом 1, функция возвращает 1;
         * в противном случае возвращается произведение fact(n-1 )*n.
         * Для вычисления такого выражения вызывается fact() с параметром
         * n-1. Процесс повторяется до тех пор, пока значение n не станет
         * равным 1 и не начнется возврат из вызовов метода.
         *
         * Чтобы лучше понять, как функционирует метод fact(), рассмотрим
         * небольшой пример. При вычислении факториала 3 первый вызов
         * fact() приводит ко второму вызову с аргументом 2, а тот в свою
         * очередь - к третьему вызову fact() с аргументом 1. Третий вызов
         *  возвратит значение 1, которое затем умножается на 2 (значение n
         *  во втором вызове). Результат (равный 2) затем возвращается в
         * исходный вызов fact() и умножается на 3 (первоначальное значение
         *  n), что дает ответ 6.
         * */
    }

    // Вариант программы, вычисляющий факториал
// итеративным способом
    int factI(int n) {
        int t, result;
        result = 1;
        for (t = 1; t <= n; t++) result *= t;
        return result;
    }
}

class Recursion {
    public static void main(String[] args) {
        Factorial f = new Factorial();

        System.out.println("Вычисление рекурсивным методом");
        System.out.println("Факториал 3 равен " + f.fact(3));
        System.out.println("Факториал 4 равен " + f.fact(4));
        System.out.println("Факториал 5 равен " + f.fact(5));

        System.out.println("Вычисление итеративным методом");
        System.out.println("Факториал 3 равен " + f.factI(3));
        System.out.println("Факториал 4 равен " + f.factI(4));
        System.out.println("Факториал 5 равен " + f.factI(5));
    }
}
/*
* Когда метод вызывает сам себя, новые локальные переменные и параме-
тры размещаются в стеке, а код метода выполняется с этими новыми пере-
менными с самого начала. При возврате из каждого рекурсивного вызова ста-
рые локальные переменные и параметры удаляются из стека, и выполнение
возобновляется в точке вызова внутри метода. Можно сказать, что рекур-
сивные методы работают в стиле "раздвижения" и "складывания" подзорной
трубы.
* */

/* стр 196 полное руководство
 * Вот еще один пример рекурсии. Рекурсивный метод printArray() выводит
 * первые i элементов в массиве values.
 * */
// Еще один пример использования рекурсии
class RecTest {
    int[] values;

    RecTest(int i) {
        values = new int[i];
    }

    //Рекурсивно отобразить элементы массива.
    void printArray(int i) {
        if (i == 0) return;
        else printArray(i - 1);
        System.out.println("[" + (i - 1) + "] " + values[i - 1]);
    }
}

class Recursion2 {
    public static void main(String[] args) {
        RecTest ob = new RecTest(10);
        int i;

        for (i = 0; i < 10; i++) ob.values[i] = i;
        ob.printArray(10);
    }
}