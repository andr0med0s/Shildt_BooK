package Shildt_Lesson.src.Lesson.Chapter_3;
//стр 114
//--------------Цикл for-----------

/**
 * for {инициализация; условие; итерация)
 * {
 * последовательность инструкций;
 * }
 */

// Вывод квадратных корней чисел от 1 до 99
// вместе с ошибкой округления
public class SqrRoot {
    public static void main(String[] args) {
        double num, sroot, rerr;

        for (num = 1.0; num < 100.0; num++) {
            sroot = Math.sqrt(num);
            System.out.println("Корень квадратный из " + num + " равен " + sroot);

            // Вычисление ошибки округления
            rerr = num - (sroot * sroot);
            System.out.println("Ошибка округления: " + rerr);
            System.out.println();
        }
    }
}

//стр 146 Полное руководство
// Демонстрация работы цикла for.
class ForTick {
    public static void main(String[] args) {
//        int n;
//        for (n = 10; n > 0; n--)
        for (int n = 10; n > 0; n--)
            System.out.println("Импульс номер " + n);
    }
}

//Проверка, является ли число простым.
class FindPrime {
    public static void main(String[] args) {
        int num;
        boolean isPrime;

        num = 14;

        if (num < 2) isPrime = false;
        else isPrime = true;

        for (int i = 2; i <= num / i; i++) {
            if ((num % i) == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime) System.out.println("является простым");
        else System.out.println("не является простым");
    }
}
