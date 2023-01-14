package Shildt_Lesson.src.Lesson.Chapter_4;

//стр 168
/*
* При вызове метода ему
автоматически передается ссылка на вызывающий объект, которая обозначается
ключевым словом this. Следовательно, ключевое слово this обозначает именно
тот объект, по ссылке на который действует вызываемый метод. Поясним назна-
чение ключевого слова this на примере программы, в которой создается класс
Pwr, предназначенный для вычисления целочисленной степени заданного числа.
* */
class Pwr {
    double b;
    int e;
    double val;

//   --- стр 170 ---    добавление ключевого слова this не дает никаких преимуществ
//        Pwr (double base, int exp) {
//        b = base;
//        e = exp;
////        this.b = base; добавление ключевого слова this не дает никаких преимуществ
////        this.e = exp;
//
//        val = 1;
////        this.val = 1;
//        if (exp == 0) return;
//        for (; exp > 0; exp--) val = val * base;
////        for ( ; exp > 0 ; exp--) this.val = this.val * base;
//    }

    /*
    * В данной версии конструктора класса Pwr имена параметров совпадают с
именами переменных экземпляра, скрывая их. А ключевое слово this исполь-
зуется здесь для того, чтобы “открыть” переменные экземпляра.
    * */

    Pwr(double b, int e) {
        this.b = b; // this.b `<---- Ссылка на переменную экземпляра, а не на параметр `= b;
        this.e = e;

        val = 1;
        if(e==0) return;
        for(; e > 0; e--) val = val * b;
    }

    double get_pwr() {
        return val;
//        return this.val;
    }
}

class DemoPwr {
    public static void main(String[] args) {
        Pwr x = new Pwr(4.0, 2);
        Pwr y = new Pwr(2.5, 1);
        Pwr z = new Pwr(5.7, 0);

        System.out.println(x.b + " в степени " + x.e +
                " равно " + x.get_pwr());
        System.out.println(y.b + " в степени " + y.e +
                " равно " + y.get_pwr());
        System.out.println(z.b + " в степени " + z.e +
                " равно " + z.get_pwr());

    }
}
