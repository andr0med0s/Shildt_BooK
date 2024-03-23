package Exercise.Chapter_5;
// стр 215

/*
* В данном упражнении вам предстоит создать класс
 ShowBits, который позволит отображать произвольное
целочисленное значение в двоичном виде. Этот класс может вам очень приго-
диться при разработке некоторых программ. Так, если требуется отладить код
драйвера устройства, возможность контролировать поток данных в двоичном
виде будет весьма кстати
*/

/*
Упражнение 5.3
Создание класса для отображения значений в двоичном виде
*/
class ShowBits {
    int numbits;

    ShowBits(int n) {   //Конструктор класса ShowBits позволяет создавать объекты, отображающие
        numbits = n;    // заданное число битов. Число битов, которые должны отображаться,
                        // сохраняется в переменной экземпляра numbits.
    }

    void show(long val) { //Для вывода двоичных значений
        long mask = 1;

        // Сдвиг значения 1 влево на нужную позицию
        mask <<= numbits - 1;

        int spacer = 0;
        for (; mask != 0; mask >>>= 1) {
            if ((val & mask) != 0) {
                System.out.print("1");
            } else {
                System.out.print("0");
            }
            spacer++;
            if ((spacer % 8) == 0) {
                System.out.print(" ");
                spacer = 0;
            }
        }
        System.out.println();
    }
    /*
        Обратите внимание на то, что данному методу передается один параметр
        типа long. Но это вовсе не означает, что при вызове ему нужно всегда
        передавать значение типа long. Правила автоматического преобразова-
        ния типов в Java допускают передавать методу show () любое целочислен-
        ное значение
    * */
}

// Демонстрация использования класса ShowBits
class ShowBitsDemo {
    public static void main(String[] args) {
        ShowBits b = new ShowBits(8);
        ShowBits i = new ShowBits(32);
        ShowBits li = new ShowBits(64);

        System.out.println("123 в двоичном представлении: ");
        b.show(123);

        System.out.println("\n87987 в двоичном представлении: ");
        i.show(87987);

        System.out.println("\n237658768 в двоичном представлении: ");
        li.show(237658768);

        // Можно также отобразить младшие
        // разряды любого целого числа
        System.out.println("\nМладшие 8 битов числа 87987 в двоичном представлении: ");
        b.show(87987);
    }
}