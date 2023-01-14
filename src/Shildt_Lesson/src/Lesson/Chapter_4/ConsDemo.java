package Shildt_Lesson.src.Lesson.Chapter_4;

// Простой конструктор
// стр 164


/*
        * Конструктор инициализирует объект при его создании. Имя конструкто-
        ра совпадает с именем класса, а с точки зрения синтаксиса он подобен методу.
        Но у конструкторов нет возвращаемого типа, указываемого явно. Как правило,
        конструкторы используются для задания первоначальных значений переменных
        экземпляра, определенных в классе, или же для выполнения любых других уста-
        новочных процедур, которые требуются для создания полностью сформирован-
        ного объекта.
        Конструкторы имеются у всех классов, независимо от того, определите вы их
        или нет, поскольку Java автоматически предоставляет конструктор, используе-
        мый по умолчанию и инициализирующий все переменные экземпляра их зна-
        чениями, заданными по умолчанию. Для большинства типов данных значением
        по умолчанию является нулевое, для типа bool — логическое значение false,
        а для ссылочных типов — пустое значение null. Но как только вы определи-
        те свой собственный конструктор, конструктор по умолчанию предоставляться
        не будет.
* */
class MyClass {
    int x;

    MyClass() { // < ---- Конструктор класса MyClass
        x = 10;
    }

    MyClass(int i){
        x = i;
    }
}


class ConsDemo {
    public static void main(String[] args) {
        MyClass t1 = new MyClass();  // * для объекта t1 оператором new вызывается конструктор MyClass()
                                   // без параметров в котором переменной t1.x присваивается значение 10

        MyClass t2 = new MyClass(); // *для объекта t2 вызывается конструктор MyClass() без параметров
                                        // в котором переменной t2.x присваивается значение 10

        System.out.println(t1.x + " " + t2.x);
    }
}

// Параметризированный конструктор
// стр 165

class  ParmConsDemo {
    public static void main(String[] args) {
        MyClass t1 = new MyClass(10); // * значение 10 сначала передается параметру i данного конструктора
                                        // MyClass(int i), а затем присваивается переменной x. `x = i`
        MyClass t2 = new MyClass(88);

        System.out.println(t1.x + " " + t2.x);
    }
}