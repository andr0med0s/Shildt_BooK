package Lesson.Chapter_2;
//стр 99

//Правила повышения типов

//byte,short,char ---> int
//ели один операнд типа long, то все выражение повышается до long
//ели один операнд типа float, то все выражение повышается до float
//ели один операнд типа double, то все выражение повышается до double

public class Promote {
    public static void main(String[] args) {
        byte b = 42;
        char с = 'a';
        short s = 1024;
        int i = 50_000;
        float f = 5.67f;
        double d = .1234;
        double result = (f * b) + (i / с) - (d * s);
        // ---float * byte-->float    //---int / char -->int   //double * short -->double
        //float + int ---> float     // float - double ---> double
        System.out.println(( f * b) + " + " + (i/с) +" - " + (d * s));
        System.out.println("result = " + result);
    }
}

/*
В первом подвыражении, f * Ь, тип переменной Ь повышается float и ре-
зультатом подвыражения будет значение float. В подвыражении i / с тип
переменной с повышается до int и результатом подвыражения будет зна-
чение int. В подвыражении d * s тип переменной s повышается до double
и результатом подвыражения будет значение double. Наконец, принимаются
во внимание три промежуточных значения: float, int и double. Результат
сложения значений float и int имеет тип float. Тип результата вычитания
последнего промежуточного значения double из результирующего значения
float повышается до double, который и будет типом окончательного резуль-
тата выражения.
 */
