package Shildt_Lesson.src.Lesson.Chapter_4;


//стр 144
/*
Программа, в которой используется класс Vehicle.
* */
class Vehicle {   //Объявление класса создает новый тип данных. В данном случае этот тип
    // называется Vehicle.
    int passengers; // количество пассажиров
    int fuelcap; // емкость топливного бака
    int mpg; // потребление топлива в милях на галлон

    //   void range(){ не возвращает вызывающей части  программы никаких данных.
//        System.out.println("Дальность - " +  fuelcap * mpg + " миль.");
    //   }
    int range() {
        return mpg * fuelcap;
    }

    //Расчет количества топлива, необходимого транспортному
    // средству для преодоления заданного растояния
    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }
}

// В этом классе объявляется объект типа Vehicle
class VehicleDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();    // создание объекта minivan
        // типа Vehicle
        //каждый объект типа Vehicle будет содержать свои копии переменных passengers, fuelcap и mpg.
        int range;

        // Присваивание значений  полям в объекте minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        /*
        имя переменной указывается после имени объекта и отделяется от него точкой:

        объект. член

        В этой форме объект указывается слева, а член класса — справа от точки.
         */

        //Расчет дальности поездки с полным баком горючего
        range = minivan.fuelcap * minivan.mpg;
        System.out.println("Мини-фургон может перевезти " + minivan.passengers + " пассажиров на растояние " + range + " миль");
    }
}


/*
Вообще говоря, точечной нотацией можно пользоваться для обращения как
к переменным экземпляра, так и к методам.
 */

// стр 145

/* В этой программе создаются два объекта класса Vehicle*/

class TwoVehicles {
    public static void main(String[] args) {

        Vehicle minivan = new Vehicle();     // !!!  переменные  minivan и sportcar
        Vehicle sportcar = new Vehicle();   //      ссылаются на разные объекты

        int range1, range2; // переменные для хранения значений дальности

        // Присваивание значений полям объекта minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        //Присваивание значений полям объекта sportcar
        sportcar.passengers = 2;
        sportcar.fuelcap = 14;
        sportcar.mpg = 12;

        //Расчет дальности поездки с полным баком горючего
        range1 = minivan.fuelcap * minivan.mpg;
        range2 = sportcar.fuelcap * sportcar.mpg;

        System.out.println("Мини-фургон может перевезти " + minivan.passengers + " пассажиров на расстояние " + range1 + " миль.");
        System.out.println("Спортивный автомобиль может перевезти " + sportcar.passengers + " пассажиров на расстояние " + range2 + " миль.");


    }
}

class AddMeth {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportcar = new Vehicle();

        int range1, range2;

        //Присваивание значений полям объекта minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        //Присваивание значений полям объекта sportcar
        sportcar.passengers = 2;
        sportcar.fuelcap = 14;
        sportcar.mpg = 12;

        System.out.print("Мини-фургон может перевезти " +
                minivan.passengers + " пассажиров.");

        minivan.range(); // отображение информации о дальности поздки мини-фургона

        System.out.print("Спортивный автомобиль может перевезти " +
                sportcar.passengers + " пассажиров.");

        sportcar.range(); // отображение информации о дальности поездки спортивного автомобиля
    }
}
/*
        Рассмотрим основные компоненты данной программы. Начнем с метода
        range (). Первая строка этого метода выглядит так:
        void range() {
        В этой строке объявляется метод range, для которого не предусмотрены
        параметры. В качестве типа, возвращаемого этим методом, указано ключевое
        слово void. Таким образом, метод range () не возвращает вызывающей части
        программы никаких данных.
 */
 /*
         А теперь рассмотрим подробнее следующую строку кода в методе main ():
        minivan.range();
        в которой вызывается метод range () для объекта minivan. Чтобы вызвать ме-
        тод для конкретного объекта, следует указать имя этого объекта перед именем
        метода, используя точечную нотацию. При вызове метода ему передается управ-
        ление потоком выполнения программы. Когда метод завершит свое действие,
        управление будет возвращено вызывающей части программы, и ее выполнение
        продолжится со строки кода, следующей за вызовом метода.
  */

class RetMeth {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportcar = new Vehicle();

        int range1, range2;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportcar.passengers = 2;
        sportcar.fuelcap = 14;
        sportcar.mpg = 12;

        range1 = minivan.range(); // присваивание переменной значения возвращаемого методом
        range2 = sportcar.range();// присваивание переменной значения возвращаемого методом

        System.out.println("Мини-фургон может перевезти " +
                minivan.passengers + " на расстояние " +
                range1 + " миль.");
        System.out.println("Спорткар может перевезти " +
                sportcar.passengers + " на расстояние " +
                range2 + " миль.");
    }
}

/*
Добавление параметризированного метода, в котором выполняется
расчет объема топлива, необходимого транспортному средству
для преодоления заданного расстояния.
 */

class CompFuel {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportcar = new Vehicle();
        double gallons;
        int dist = 252;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportcar.passengers = 2;
        sportcar.fuelcap = 14;
        sportcar.mpg = 12;

        gallons = minivan.fuelneeded(dist);

        System.out.println("Для преодоления " + dist +
                            " миль мини-фургону требуется " +
                            gallons + " галлонов топлива");

        gallons = sportcar.fuelneeded(dist);

        System.out.println("Для преодоления " + dist +
                " миль спорткару требуется " +
                gallons + " галлонов топлива");
    }
}