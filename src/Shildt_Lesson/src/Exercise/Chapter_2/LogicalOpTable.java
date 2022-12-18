package Shildt_Lesson.src.Exercise.Chapter_2;
//стр 93
// Упражнение 2.2
// Отображение таблицы истинности для логических операций
//public class LogicalOpTable {
//    public static void main(String[] args) {
//        boolean p, q;
//
//        System.out.println("\sP\t\t\sQ\t\t\sAND\t\sOR\t\t\sXOR\t\sNOT");
//
//        p = true; q = true;
//        System.out.print(p + "\t" + q + "\t");
//        System.out.print((p&q) + "\t" + (p|q) + "\t");
//        System.out.println((p^q) + "\t" +(!p));
//
//        p = true; q = false;
//        System.out.print(p + "\t" + q + "\t");
//        System.out.print((p&q) + "\t" + (p|q) + "\t");
//        System.out.println((p^q) + "\t" +(!p));
//
//        p = false; q = true;
//        System.out.print(p + "\t" + q + "\t");
//        System.out.print((p&q) + "\t" + (p|q) + "\t");
//        System.out.println((p^q) + "\t" +(!p));
//
//        p = false; q = false;
//        System.out.print(p + "\t" + q + "\t");
//        System.out.print((p&q) + "\t" + (p|q) + "\t");
//        System.out.println((p^q) + "\t" +(!p));
//    }
//}


/*
 * Видоизмененное упражнение 2.2 для практики
 * Отображение таблицы истинности для логических операций
 */
 class LogicalOpTableHomeWork {
    public static void main(String[] args) {
        boolean p, q;

        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

//---------- First string

        p = true;
        q = true;

        System.out.print("st1"+ p + "\t" + "st2" + q + "\t");

        if (p & q) {
            System.out.print("st"+"1\t");
        } else {
            System.out.print("st"+"0\t");
        }

        if (p | q) {
            System.out.print("st"+"1\t");
        } else {
            System.out.print("st"+"0\t");
        }

        if (p ^ q) {
            System.out.print("st"+"1\t");
        } else {
            System.out.print("st"+"0\t");
        }

        if (!p) {
            System.out.println("st"+"1\t");
        } else {
            System.out.println("st"+"0\t");
        }

//---------- Second column
        p = true;
        q = false;

        System.out.print(p + "\t" + q + "\t");

        if (p & q) {
            System.out.print("1\t");
        } else {
            System.out.print("0\t");
        }

        if (p | q) {
            System.out.print("1\t");
        } else {
            System.out.print("0\t");
        }

        if (p ^ q) {
            System.out.print("1\t");
        } else {
            System.out.print("0\t");
        }

        if (!p) {
            System.out.println("1\t");
        } else {
            System.out.println("0\t");
        }

//----------Third column
        p = false;
        q = true;

        System.out.print(p + "\t" + q + "\t");

        if (p & q) {
            System.out.print("1\t");
        } else {
            System.out.print("0\t");
        }

        if (p | q) {
            System.out.print("1\t");
        } else {
            System.out.print("0\t");
        }

        if (p ^ q) {
            System.out.print("1\t");
        } else {
            System.out.print("0\t");
        }

        if (!p) {
            System.out.println("1\t");
        } else {
            System.out.println("0\t");
        }

        // Fourth column
        p = false;
        q = false;

        System.out.print(p + "\t" + q + "\t");

        if (p & q) {
            System.out.print("1\t");
        } else {
            System.out.print("0\t");
        }

        if (p | q) {
            System.out.print("1\t");
        } else {
            System.out.print("0\t");
        }

        if (p ^ q) {
            System.out.print("1\t");
        } else {
            System.out.print("0\t");
        }

        if (!p) {
            System.out.println("1\t");
        } else {
            System.out.println("0\t");
        }
    }
}
