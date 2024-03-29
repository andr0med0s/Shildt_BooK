package Lesson.Chapter_6;

// стр 228
//методам можно передавать объекты
class Block { //класс Block, предназначенный для хранения размеров
    // параллелепипеда в трех измерениях
    int a, b, c;
    int volume;

    Block(int i, int j, int k) {
        a = i;
        b = j;
        c = k;
        volume = a * b * c;
    }

    // Возврат логического значения true, если
    // параметр ob определяет тот же параллелепипед
    boolean sameBlock(Block ob) { //----использование объектного типа в качестве параметра
        if ((ob.a == a) & (ob.b == b) & (ob.c == c)) return true;
        else return false;
    }

    // Возврат логического значения true, если
    // параметр ob определяет параллелепипед того же объема
    boolean sameVolume(Block ob) { //----использование объектного типа в качестве параметра
        if (ob.volume == volume) return true;
        else return false;
    }

}

class PassOb {
    public static void main(String[] args) {
        Block ob1 = new Block(10, 2, 5);
        Block ob2 = new Block(10, 2, 5);
        Block ob3 = new Block(4, 5, 5);
        System.out.println("ob1 имеет те же размеры, что и оЬ2: " +
                ob1.sameBlock(ob2));//---Передача объекта

        System.out.println("ob1 имеет те же размеры, что и оЬЗ: " +
                ob1.sameBlock(ob3));//---Передача объекта

        System.out.println("ob1 имеет тот же объем, что и оЬЗ: " +
                ob1.sameVolume(ob3));//---Передача объекта
    }
}

/*
* В методах sameBlock() и sameVolume() объект Block, переданный им в
качестве параметра, сравнивается с текущим объектом. Метод sameBlock()
возвращает логическое значение true только в том случае, если все три размера
обоих параллелепипедов совпадают. В методе же sameVolume() сравниваются
лишь объемы двух параллелепипедов. Но в обоих случаях параметр ob имеет
тип Block. Несмотря на то что Block — это класс, параметры данного типа ис-
пользуются точно так же, как и параметры встроенных в Java типов данных.
* */

////////////----------///////////////////

//Способы передачи аргументов методу стр 229

/*
* В некоторых случаях последствия передачи объекта по ссылке будут
* отличаться от тех результатов, к которым приводит передача
* значения обычного типа.
*
* -----------------
*
* Первый из них — это вызов по значению.
*  В таком случае в формальный параметр метода копируется значение аргумента.
*  Следовательно, изменения, вносимые в параметр метода, никоим образом
*  не сказываются на состоянии аргумента, используемого при вызове.
*
* Вторым способом передачи аргумента является вызов по ссылке.
* В таком случае параметру метода передается не значение аргумента, а ссылка на него.
* В методе данная ссылка используется для доступа к конкретному аргументу,
* указанному при вызове. Это означает, что изменения, вносимые в параметр,
* будут оказывать влияние на аргумент, используемый при вызове метода.
*
* !!! Несмотря на то что в Java передача аргументов осуществляется в соответствии
*  с механизмом вызова по значению, результирующий эффект будет разным для простых
*  и ссылочных типов.!!!
*
* Если методу передается простой тип, например int или double, то он передается
* по значению. При этом создается копия аргумента, а то, что происходит
  с параметром, принимающим аргумент, не распространяется за пределы метода.
*  */

// Простые типы данных передаются методам по значению стр 230
class Test1 {
    // Этот метод не может изменить значения аргументов,
    // передаваемых ему при вызове
    void noChange(int i, int j) {
        i = i + j;
        j = -j;
    }
}

class CallByValue {
    public static void main(String[] args) {
        Test1 ob = new Test1();
        int a = 15, b = 20;

        System.out.println("а и b перед вызовом: " + a + " " + b);

        ob.noChange(a, b);
/* действия, выполняемые в теле метода noChange(), никак не
   влияют на значения переменных а и b в вызывающем методе. */
        System.out.println("а и b после вызова: " + a + " " + b);
    }
}


/*
*  Если же методу передается объект, то ситуация коренным образом меняет-
   ся, поскольку объекты передаются неявно, по ссылке.
   * --------------------------*
*  Вспомните, что создание переменной, для которой в качестве типа указан класс,
*  означает создание ссылки на объект этого класса, и именно эта ссылка передается
*  по значению в формальный параметр при передаче ее методу Отсюда следует,
*  что и передаваемый аргумент, и параметр метода, как содержащие одну и ту же ссылку,
*  будут ссылаться на один и тот же объект. Таким образом, любые изменения объекта
*  в методе будут вызывать соответствующие изменения в объекте, используемом в
   качестве аргумента.
* */

// Объекты передаются методам по ссылке стр 231
class Test2 {
    int a, b;

    Test2(int i, int j) {
        a = i;
        b = j;
    }

    // Передача объекта методу. Теперь переменные ob.a и ob.b
    // объекта, используемого при вызове, также будут изменяться,
    void change(Test2 ob) {
        ob.a = ob.a + ob.b;
        ob.b = -ob.b;
    }
}

class CallByRef {
    public static void main(String[] args) {
        Test2 ob = new Test2(15, 20);

        System.out.println("ob.a и ob.b перед вызовом: " + ob.a + " " + ob.b);

        ob.change(ob);
/* в данном случае действия в методе change() оказывают влия-
   ние на объект, используемый в качестве аргумента этого метода.*/
        System.out.println("ob.a и ob.b после вызова: " + ob.a + " " + ob.b);
    }
}

/*
* в Java определен ряд классов,
служащих оболочкой для простых типов. Это классы Double, Float, Byte,
Short, Integer, Long и Character. Они не только позволяют передавать
простые типы по ссылке, но и содержат ряд методов для манипулирования
их значениями. Например, в классах — оболочках числовых типов содержат-
ся методы, преобразующие двоичные значения в символьную строку, а также
методы, выполняющие обратное преобразование.
* */

//стр 187 Полное руководство
// Перегрузка конструкторов
class Box1 {
    double width;
    double height;
    double depth;

    //Это конструктор для Box.
    Box1(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    //Вычислить и возвратить объем
    double volume() {
        return width * height * depth;
    }
}

/*
 * Здесь в классе Box определены три конструктора для инициализации
 * размеров объекта коробки различными способами
 * */
class Box2 {
    double width;
    double height;
    double depth;

    //Это конструктор для Box.
    Box2(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Конструктор, применяемый в случае, если размеры вообще не указаны .
    Box2() {
        width = -1;         // использовать - 1 для обозначения
        height = -1;      // неинициализированного
        depth = -1;       // объекта коробки
    }

    //Конструктор, используемый в случае создания объекта кубика
    Box2(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }

}
  //стр 188
class OverloadCons {
    public static void main(String[] args) {
// Создать объекты коробок с применением различных конструкторов.
        Box2 mybox1 = new Box2(10, 20, 15);
        Box2 mybox2 = new Box2();
        Box2 mycube = new Box2(7);
        double vol;
// Вычислить объем первой коробки.
        vol = mybox1.volume();
        System.out.println("Объем mybox1 равен " + vol);
// Вычислить объем второй коробки.
        vol = mybox2.volume();
        System.out.println("Oбъeм mybox2 равен " + vol);
// Вычислить объем кубика.
        vol = mycube.volume();
        System.out.println("Oбъeм mycube равен " + vol);
    }
}


//-------Использование объектов в качестве параметров
// -------Полное руководство стр 189

// Объекты можно передавать методам.
        class Test3 {
            int a, b;

            Test3(int i, int j) {
                a = i;
                b = j;
            }

            // Возвратить true, если объект о равен вызывающему объекту.
            boolean equalTo(Test3 o) {
                if (o.a == a && o.b == b) return true;
                else return false;
            }
        }

        class PassOb1 {
            public static void main(String[] args) {
                Test3 ob1 = new Test3(100, 22);
                Test3 ob2 = new Test3(100, 22);
                Test3 ob3 = new Test3(-1, -1);
                System.out.println("ob1 == ob2: " + ob1.equalTo(ob2));
                System.out.println("ob1 == ob3: " + ob1.equalTo(ob3));
            }
        }
/*
* Как видите, метод equalTo() внутри Test сравнивает два объекта на
предмет равенства и возвращает результат, т.е. он сравнивает вызывающий
объект с тем, который ему передается. Если они содержат одинаковые значе-
ния, тогда метод возвращает true. В противном случае возвращается false.
Обратите внимание, что параметр о в equalTo() указывает Test в качестве
своего типа. Хотя Test - тип класса, созданный программой, он использует
ся точно так же, как и встроенные типы Java.
* */

//-----------------
/*
* Одно из наиболее распространенных применений параметров объекта
связано с конструкторами. Часто требуется создать новый объект так, чтобы
он изначально был таким же, как какой-то существующий объект. Для это-
го необходимо определить конструктор, который принимает объект своего
класса в качестве параметра.
* */

// Здесь класс Вох позволяет один объект инициализировать другим. //стр 190
        class Box {
            double width;
            double height;
            double depth;

            //Обратите внимание на этот конструктор, который принимает объект типа Вох
            Box(Box ob) { // передать объект конструктору
                width = ob.width;
                height = ob.height;
                depth = ob.depth;
            }

            //конструктор, используемый в случае указания всех размеров
            Box(double w, double h, double d) {
                width = w;
                height = h;
                depth = d;
            }

            //конструктор, применяемый в случае, если размеры вообще не указаны
            Box() {
                width = -1;  // использовать -1 для обозначения
                height = -1; // неинициализированного объекта
                depth = -1;  // коробки
            }

            //конструктор, используемый в случае создания объекта кубика
            Box(double len) {
                width = height = depth = len;
            }

            //Вычислить и возвратить объем
            double volume() {
                return width * height * depth;
            }
        }

        class OverloadsCons2 {
            public static void main(String[] args) {
                //Создать объекты коробок с применением различных конструкторов
                Box mybox1 = new Box(10, 20, 15);
                Box mybox2 = new Box();
                Box mycube = new Box(7);
                Box myclone = new Box(mybox1); // создать копию объекта mybox1
                double vol;
                //Вычислить объем первой коробки
                vol = mybox1.volume();
                System.out.println("Объем mybox1 равен: " + vol);

                //Вычислить объем второй коробки
                vol = mybox2.volume();
                System.out.println("Объем mybox2 равен: " + vol);

                //Вычислить объем кубика
                vol = mycube.volume();
                System.out.println("Объем mycube равен: " + vol);

                //Вычислить объем копии
                vol = myclone.volume();
                System.out.println("Объем myclone равен: " + vol);
            }
        }
//---------------стр 191 Java Полное руководство
        /*
         * Cуществуют два способа, которыми можно передавать аргумент подпрограмме.
         *
         * Первый способ - вызов по значению, при котором в формальный параметр
         * подпрограммы копируется значение аргумента, поэтому изменения, вносимые
         * в параметр подпрограммы, не влияют на аргумент.
         * Второй способ - вызов по ссылке. При таком подходе в параметр передается
         * ссылка на аргумент (а не его значение). Внутри подпрограммы эта ссылка
         * используется для доступа к фактическому аргументу, указанному в вызове,
         * т.е. изменения, вносимые в параметр, повлияют на аргумент, который
         * применялся при вызове подпрограммы.
         * */

        /*
         * для передачи всех аргументов используется вызов по значению,
         * точный результат зависит от того, какой тип передается -
         * примитивный или ссылочный.
         * */
 /*
 * Когда методу передается примитивный тип, то происходит передача по
значению. Таким образом, создается копия аргумента, и все то, что делается
с параметром, получающим аргумент, не имеет никакого эффекта вне метода.
 * */

// Примитивные типы передаются по значению.
        class Test4 {
            void meth(int i, int j) {
                i *= 2;
                j /= 2;
            }
        }
        class CallByValue1 {
            public static void main(String[] args) {
                Test4 ob = new Test4();

                int a = 15, b = 20;

                System.out.println("a и b перед вызовом: " + a + " " + b);
                ob.meth(a, b);
                System.out.println("a и b после вызова: " + a + " " + b);
            }
        } // операции, выполняемые внутри meth(), не влияют на значения а и Ь, используемые в вызове;

/*
*  Когда методу передается объект, ситуация кардинально меняется, потому
   что объекты передаются посредством того, что фактически называется вызовом
*  по ссылке.
*  Имейте в виду, что при создании переменной типа класса создается
*  только ссылка на объект. Таким образом, когда такая ссылка передается
*  методу, то параметр, который ее получает, будет ссылаться на тот же
   объект, на который ссылается аргумент.
*  Фактически это означает, что объекты действуют так, будто они передаются методам
*  с помощью вызова по ссылке.
*  Изменения объекта внутри метода влияют на объект, указанный в качестве аргумента.
* */

// Объекты передаются через ссылки на них
        class Test5 {
            int a, b;

            Test5(int i, int j) {
                a = i;
                b = j;
            }

            //передать объект
            void meth(Test5 o) {
                o.a *= 2;
                o.b /= 2;
            }
        }
        class PassObjRef {
            public static void main(String[] args) {
                Test5 ob = new Test5(15, 20);

                System.out.println("ob.a и ob.b перед вызовом: " + ob.a + " " + ob.b);
                ob.meth(ob);
                System.out.println("ob.a и ob.b после вызова: " + ob.a + " " + ob.b);
            }
        } //в данном случае действия внутри meth() воздействуют на объект, используемый в качестве аргумента.

//!!!!!!!!!!!!!
/*
* Помните!
* При передаче методу ссылки на объект сама ссылка передается с применением вызова по
  значению. Но поскольку передаваемое значение относится к объекту, копия этого значения
  по-прежнему будет ссылаться на тот же объект, что и соответствующий аргумент.
* */