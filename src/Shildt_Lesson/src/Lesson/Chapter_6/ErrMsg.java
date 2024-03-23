package Lesson.Chapter_6;

//Возврат объектов методами стр 232

//Метод может возвращать данные любого типа, включая и типы классов.

// Возврат объекта типа String
class ErrorMsg {
    String[] msgs = {
            "Ошибка вывода",
            "Ошибка ввода",
            "Отсутствует место на диске",
            "Выход индекса за границы диапазона"
    };
    // Возврат сообщения об ошибке
    String getErrorMsg (int i) { //◄ -------------Возврат объекта типа String
        if (i >= 0 & i < msgs.length)
            return msgs[i];
        else
            return "Несуществующий код ошибки";
    }
}

class ErrMsg {
    public static void main(String[] args) {
        ErrorMsg err = new ErrorMsg();
        System.out.println(err.getErrorMsg(2));
        System.out.println(err.getErrorMsg(19));
    }
}

// Возврат объекта, определяемого разработчиком программы
class Err {
    String msg;// сообщение об ошибке
    int severity; // уровень серьезности ошибки
    Err(String m, int s) {
        msg = m;
        severity = s;
    }
}
class ErrorInfo {
    String[] msgs = {
            "Ошибка вывода",
            "Ошибка ввода",
            "Отсутствует место на диске",
            "Выход индекса за границы диапазона"
    };
    int[] howbad = { 3, 3, 2, 4 };

    Err getErrorInfo (int i) { //◄------Возврат объекта типа Err
        if (i >= 0 & i < msgs.length)
            return new Err(msgs[i], howbad[i]);
        else
            return new Err("Несуществующий код ошибки", 0);
    }/*
        При каждом вызове метода getErrorlnfo() создается новый объект типа
        Err, и ссылка на него возвращается вызывающему методу. Затем этот объект
        используется методом main () для отображения степени серьезности ошибки и
        текстового сообщения.
    */
}
class ErrInfo {
    public static void main(String args[]) {
        ErrorInfo err = new ErrorInfo();
        Err e;
        e = err.getErrorInfo(2);
        System.out.println(e.msg + " уровень: " + e.severity);
        e = err.getErrorInfo(19);
        System.out.println(e.msg + " уровень: " + e.severity);
    }
}
/*
* Объект, возвращенный методом, существует до тех пор, пока на него имеется
хотя бы одна ссылка. Если ссылки на объект отсутствуют, он уничтожается под-
системой сборки мусора. Поэтому при выполнении программы не может воз-
никнуть ситуация, когда объект удаляется лишь потому, что метод, в котором
он был создан, завершился.
*
* */

// Возвращение объекта. стр 193 Полное руководство
class Test6 {
    int a;

    Test6(int i) {
        a = i;
    }

    Test6 incByTen(){
        Test6 temp = new Test6(a + 10);
        return  temp;
    }//каждый раз, когда вызывается incrByTen() , создается новый
   // объект, а вызывающей процедуре возвращается ссылка на него.

    /*
    * поскольку все объекты динамически размещаются с помощью операции new,
    вам не нужно беспокоиться о том, что объект выйдет за пределы области
    видимости, т.к. метод, в котором он был создан, завершается.
    * Объект будет продолжать существовать до тех пор, пока в программе
    * где-то есть ссылка на него. Когда ссылки на него исчезнут,
    * занимаемая объектом память освободится при очередной сборке мусора.
   */
}
class RetOb {
    public static void main(String[] args) {
        Test6 ob1 = new Test6(2);
        Test6 ob2;

        ob2 = ob1.incByTen();
        System.out.println("ob1.a " + ob1.a);
        System.out.println("ob2.a " + ob2.a);

        ob2 = ob2.incByTen();
        System.out.println("ob2.a после второго увеличения: " + ob2.a);
    }
}