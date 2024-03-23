package Lesson.Chapter_5;
// стр 258 руководство для начинающих

//Переменное число аргументов

// Метод vaTest () с переменным числом аргументов
//static void vaTest(int...v){   // объявление метода со списком аргументов переменной длины
//
//        System.out.println("Число аргументов: " + v.length);
//        System.out.printIn("Содержимое: ");
//
//        for(int i=0;i<v.length;i++)
//            System.out.println(" arg "+i+": "+v[i]);
//        System.out.println();
//        }


// Демонстрация использования метода
// с переменным числом аргументов
class VarArgs {

    // Метод vaTest() допускает переменное число аргументов
    static void vaTest(int... v) {
        System.out.println("Количество аргументов: " + v.length);
        System.out.println("Содержимое: ");

        for (int i = 0; i < v.length; i++)
            System.out.println(" arg " + i + ": " + v[i]);

        System.out.println();
    }

    public static void main(String[] args) {
        // Метод vaTest () может вызываться с
        // переменным числом аргументов
        vaTest(10);// 1 аргумент

        vaTest(1, 2, 3);// 3 аргумента

        vaTest();// без аргументов

    }
}

/*
* Помимо списка параметров переменной длины, в объявлении метода могут
указываться и обычные параметры, но при одном условии: массив параметров
переменной длины должен быть указан последним.
* */

// Использование массива аргументов переменной длины
// наряду с обычными аргументами
class VarArgs2 {
    // Здесь msg - обычный параметр,
    //a v - массив параметров переменной длины
    static void vaTest(String msg, int... v) {    //◄ ------ "Обычный" параметр и параметр в
        // виде массива переменной длины
        System.out.println(msg + v.length);
        System.out.println("Содержимое: ");

        for (int i = 0; i < v.length; i++)
            System.out.println(" arg " + i + ": " + v[i]);

        System.out.println();
    }

    public static void main(String[] args) {
        vaTest("Один аргумент в массиве: ", 10);
        vaTest("Три аргумента в массиве: ", 1, 2, 3);
        vaTest("Отсутствуют аргументы в виде массива: ");
    }
}

/*
* Помните о том, что список параметров переменной длины должен указы-
ваться последним. Например, следующее объявление метода недопустимо.
*
int doIt(int а, int b, double c, int ... vals, boolean stopFlag) { // Ошибка!
*
В данном примере сделана попытка указать обычный параметр после списка параметров
* переменной длины.
*
Существует еще одно ограничение, которое следует соблюдать: список пара-
метров переменной длины можно указать в методе только один раз. Например,
приведенное ниже объявление метода недопустимо.
*
int dolt(int a, int b, double c, int ... vals, double ... morevals) { // Ошибка!
*
Ошибкой в данном случае является попытка указать два разных списка параметров
*  переменной длины.
* */

// стр 261 руководство для начинающих

// Перегрузка метода с переменным числом аргументов
class VarArgs3 {
    static void vaTest(int... v) {// ◄----1 Первая версия метода vaTest()
        System.out.println("vaTest(int ...): " + "Количество аргументов: " + v.length);
        System.out.println("Содержимое: ");

        for (int i = 0; i < v.length; i++)
            System.out.println(" arg " + i + ": " + v[i]);
        System.out.println();
    }

    static void vaTest(boolean... v) { // ◄---- Вторая версия метода vaTest()
        System.out.println("vaTest(boolean ...): " + "Количество аргументов: " + v.length);
        System.out.println("Содержимое: ");

        for (int i = 0; i < v.length; i++)
            System.out.println(" arg " + i + ": " + v[i]);
        System.out.println();
    }

    static void vaTest(String msg, int... v) { // ◄---- Третья версия метода vaTest()
        System.out.println("vaTest(String, int ...): " + msg + v.length);
        System.out.println("Содержимое: ");

        for (int i = 0; i < v.length; i++)
            System.out.println(" arg " + i + ": " + v[i]);
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(1, 2, 3);
        vaTest("Тестирование: ", 10, 20);
        vaTest(true, false, false);
    }
}

/* стр 263 руководство для начинающих

* Переменное число аргументов и неоднозначность
*
* Перегрузка методов, имеющих список параметров переменной длины, может
приводить к возникновению непредвиденных ошибок. Причиной их появления
является неоднозначность, которая может возникать при вызове перегруженно­
го метода с переменным числом аргументов. В качестве примера рассмотрим
следующую программу.
* */
// Перегрузка метода с переменным числом аргументов
// и неоднозначность в выборе перегруженной версии.
//
// В этой программе имеется ошибка, и
// поэтому она не будет компилироваться,

class VarArgs4 {
    // Использование списка аргументов переменной длины типа int
    static void vaTest(int... v) { //◄------ Аргументы переменной длины типа int
        //...
    }

    // Использование списка аргументов переменной длины типа boolean
    static void vaTest(boolean... v) {
        //...
    }

    public static void main(String args[]) {
        vaTest(1, 2, 3); // OK
        vaTest(true, false, false); // OK
        // vaTest(); // Ошибка: неоднозначность вызова! <-------------Неопределенность!
    }
}
/*
* Вспомните, что переменное количество аргументов допускает и пол-
ное их отсутствие, так что в этом отношении все нормально. Однако приве-
денный выше вызов не может быть однозначно интерпретирован, посколь-
ку ему соответствуют обе перегруженные версии метода: vaTest (int... ) и
vaTest(boolean ...).
* */

// стр 211 Полное руководство
// Использование массива для передачи методу произвольного числа аргументов.
// Это подход в старом стиле к аргументам переменной длины.
class PassArray {
    static void vaTest(int[] v) {
        System.out.print("Количество аргументов : " + v.length + " Содержимое : ");
        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        // Обратите внимание на то , как должен создаваться
        // массив для хранения аргументов.
        int[] n1 = {10};
        int[] n2 = {1, 2, 3};
        int[] nЗ = {};
        vaTest(n1);  //1 аргумент
        vaTest(n2);  //З аргумента
        vaTest(nЗ);  //без аргументов
    }
}

// Демонстрация использования аргументов переменной длины .
class VarArgs1_2 {
    // vaTest ( ) now uses а vararg.
    static void vaTest(int... v) {
        System.out.print("Koличecтвo аргументов : " + v.length + " Содержимое : ");
        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        // Обратите внимание, что теперь метод vaTest()
        // можно вызывать с переменным числом аргументов.
        // int[] n1 = {10};      //1 аргумент
        // int[] n2 = {1, 2, 3}; //3 аргумента
        // int[] nЗ = {};        //без аргументов
    }
}

// Использование аргумента переменной длины со стандартными аргументами .
class VarArgs2_2 {
    //Здесь msg является нормальным параметром, а v - параметром переменной длины
    static void vaTest(String msg, int... v) {
        System.out.print(msg + v.length + " Содержимое : ");
        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest("Один аргумент переменной длины: ", 10);
        vaTest("Три аргумента переменной длины: ", 1, 2, 3);
        vaTest("Без аргументов переменной длины: ");
    }
}

// стр 213 Полное руководство
// Аргументы переменной длины и перегрузка.
class VarArgs3_2 {

    static void vaTest(int... v) {
        System.out.print("vaTest ( int ...): " +
                "Количество аргументов: " + v.length +
                " Содержимое: ");
        for (int x : v)
            System.out.print(x + " ");

        System.out.println();
    }

    static void vaTest(boolean... v) {
        System.out.print("vaTest (boolean . . . ) " +
                "Количество аргументов : " + v.length + " Содержимое : ");

        for (boolean x : v)
            System.out.print(x + " ");
        System.out.println();
    }


    static void vaTest(String msg, int... v) {
        System.out.print("vaTest (String, int ... ): " +
                msg + v.length +
                " Содержимое: ");
        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(1, 2, 3);
        vaTest("Тестирование: ", 10, 20);
        vaTest(true, false, false);
    }
}

// Аргументы переменной длины, перегрузка и неоднозначность.
//
// Эта программа содержит ошибку и не скомпилируется!
class VarArgs4_2 {
    static void vaTest(int... v) {
        System.out.print("vaTest (int ... ): " +
                "Количество аргументов: " + v.length +
                " Содержимое: ");
        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    static void vaTest(boolean... v) {
        System.out.print("vaTest (boolean ... ) " +
                "Количество аргументов : " + v.length +
                " Содержимое : ");
        for (boolean x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(1, 2, 3);//Нормально
        vaTest(true, false, false);//Нормально
        //vaTest();// Ошибка : Неоднозначность !
    }
}