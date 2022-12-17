package Shildt_Lesson.src.Lesson.Chapter_1;
// стр 53
// Демонстрация применения инструкции if
 class IfDemo {
    public static void main(String[] args) {
        int a, b, c; 

        a=2;
        b =3;

        if( a < b) System.out.println("a меньше b");

        /*
        * if (условие) оператор;
        * */

        //Следующая строка никогда не будет выведена

        if(a == b) System.out.println("Вы не должны увидеть этот текст");

        System.out.println();

        c = a - b; // переменная "c" содержит значение -1

        System.out.println("с содержит -1");
        if(c>=0) System.out.println("c - не отрицательное число");
        if(c<0) System.out.println("с - отрицательное число");

        System.out.println();

        c = b - a; // переменная "c" теперь содержит значение 1

        System.out.println("c содержит 1");
        if(c >= 0) System.out.println("c - не отрицательное число");
        if(c < 0) System.out.println("c -  отрицательное число");
    }
}
