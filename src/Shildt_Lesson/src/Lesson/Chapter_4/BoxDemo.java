package Shildt_Lesson.src.Lesson.Chapter_4;

// стр 165 Полное руководство
// Программа в которой используется класс Box
class Box {
    double width;
    double height;
    double depth;

    //// Отобразить объем коробки для class BoxDemo3
// void volume() {
//     System.out.print("Объем равен ");
//     System.out.println(width * height * depth);
//    }
    //Вычислить и возвратить объем
    double volume() {
        return width * height * depth;
    }
    /*
            Касательно возвращаемых значений важно понимать два момента.
        • Тип данных, возвращаемых методом, должен быть совместим с возвра-
        щаемым типом, который указан в методе. Например, если возвращае-
        мым типом какого-то метода является boolean, то возвратить целое
        число не удастся.
        • Тип переменной, которая получает значение, возвращаемое методом
        (vol в данном случае), тоже должен быть совместим с возвращаемым
        типом, указанным для метода
     */

    // Установить размеры коробки .
    void setDim (double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}

/*
В рассматриваемом случае новый тип данных называется Вох.
Имя класса будет использоваться для объявления объектов типа Вох.
Важно помнить, что объявление класса создает только шаблон, но не фактический объект.
 */

// В этом классе объявляется объект типа Box
class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box(); // создать объект Вох по имени mybox
        //После выполнения этого оператора mybox будет ссылаться на экземпляр Вох.
        double vol;

        // Присвоить значения переменным экземпляра mybox
        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;

        //Вычислить объем коробки
        vol = mybox.width * mybox.height * mybox.depth;
        System.out.println("Объем равен: " + vol);
    }
}

class BoxDemo2 {
    public static void main(String[] args) {
        Box myboxl = new Box();
        Box mybox2 = new Box();
        double vol;

// Присвоить значения переменным экземпляра mybox1.
        myboxl.width = 10;
        myboxl.height = 20;
        myboxl.depth = 15;

        /* Присвоить переменным экземпляра mybox2 другие значения. */
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

// Вычислить объем первой коробки.
        vol = myboxl.width * myboxl.height * myboxl.depth;
        System.out.println("Oбъeм равен " + vol);

// Вычислить объем второй коробки.
        vol = mybox2.width * mybox2.height * mybox2.depth;
        System.out.println("Oбъeм равен " + vol);
    }
}

/*
каждый объект имеет собственные копии переменных экземпляра, т.е. если есть три  объекта Вох,
 то каждый из них имеет собственную копию depth, width и height.

Вы видите, что данные в mybox1 полностью независимы от данных, содер-
жащихся в mybox2 , а так же mybox
 */

class BoxDemo3 {   // В этой программе внутрь класса Вох добавляется метод стр 171
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        // Присвоить значения переменным экземпляра mybox1
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        //Присвоить переменным экземпляра mybox2 другие значения
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        //Отобразить объем первой коробки
        mybox1.volume();
//        System.out.println(mybox1.volume());
        //Отобразить объем второй коробки
        mybox2.volume();

        /*
                    когда доступ к переменной экземпляра осуществляется ко-
            дом, который не входит в состав класса, где определена данная переменная
            экземпляра, то его придется делать через объект с использованием операции
            точки. Тем не менее, когда к переменной экземпляра обращается код, кото-
            рый входит в состав того же класса, что и переменная экземпляра, то на пере-
            менную можно ссылаться напрямую. То же самое относится и к методам.
         */
    }
}

class BoxDemo4 {  // Теперь volume ( ) возвращает объем коробки
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        //Присвоить значения переменным экземпляра mybox1;
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        //Присвоить переменным экземпляра mybox2 другие значения
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        //Получить объем первой коробки
//        vol = mybox1.volume();
//        System.out.println("Объем равен " + vol);
        System.out.println("Oбъeм равен " + mybox1.volume());
    }
}

//доступ к переменным экземпляра должен осуществляться только через методы,
//определенные их классом.

class BoxDemo5 {  // В этой программе используется параметризованный метод.
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        //Инициализировать объекты коробок
        mybox1.setDim(10,20,15);
        mybox2.setDim(3,6,9);

       // Получить объем первой коробки
        vol = mybox1.volume();
        System.out.println("Объем равен " + vol);

        // Получить объем второй коробки
        vol = mybox2.volume();
        System.out.println("Объем равен " + vol);
    }
    // в хорошо спроектированных
    // программах на Java доступ к переменным экземпляра должен
    // осуществляться только через методы, определенные их классом.
    //для установки размеров каждого блока применяется метод
    //setDim ( ) .
}