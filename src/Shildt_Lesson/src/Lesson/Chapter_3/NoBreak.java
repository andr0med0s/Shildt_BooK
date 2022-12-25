package Shildt_Lesson.src.Lesson.Chapter_3;

//стр 109
// Демонстрация использования инструкции switch без break
public class NoBreak {
    public static void main(String[] args) {
        int i;

        for (i = 0; i <= 5; i++) {
            switch (i) {
                case 0:
                    System.out.println("i меньше 1"); // Проваливание потока выполнения сквозь ветви case
                case 1:
                    System.out.println("i меньше 2"); // Проваливание потока выполнения сквозь ветви case
                case 2:
                    System.out.println("i меньше 3"); // Проваливание потока выполнения сквозь ветви case
                case 3:
                    System.out.println("i меньше 4"); // Проваливание потока выполнения сквозь ветви case
                case 4:
                    System.out.println("i меньше 5"); // Проваливание потока выполнения сквозь ветви case
            }
        }
    }
    // switch(i) {
    //     case 1:
    //     case 2:
    //     case 3: System.out.println("i равно 1 , 2 или 3");
    //     break;
    //     case 4: System.out.println("i равно 4м);
    //     break;
    //     }
}

// switch(i) {
//     case 1:
//     case 2:
//     case 3: System.out.println("i равно 1 , 2 или 3");
//     break;
//     case 4: System.out.println("i равно 4м);
//     break;
//     }


// switch(chi) {
//     case 'А':
//     System.out.println("Это ветвь внешней инструкции switch”);
//     switch(ch2) {
//     case 'A':
//     System.out.println("Это ветвь внутренней
//     инструкции switch");
//     break;
//     case 'В ': // ...
//     }
//     // конец внутренней инструкции switch
//     break;
//     case 'В ': // ...

// стр 137  Полное руководство Java 12-е издание
// В операторе switch операторы break необязательны
class MissingBreak {
    public static void main(String[] args) {
        for (int i = 0; i < 12; i++)
            switch (i) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("i меньше 5.");
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.println("i меньше 10.");
                    break;
                default:
                    System.out.println("i больше или равно 10.");
            }
    }
}

// Усовершенствованная версия программы, определяющей принадлежность
// месяца к времени года.
class Switch {
    public static void main(String[] args) {
        int month = 4; //апрель
        String season;
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "зима";
                break;
            case 3:
            case 4:
            case 5:
                season = "весна";
                break;
            case 6:
            case 7:
            case 8:
                season = "лето";
                break;
            case 9:
            case 10:
            case 11:
                season = "осень";
                break;
            default:
                season = "несуществующий месяц";
        }
        System.out.println("апрель - это " + season + " .");


    }
}

// Применение строки для управления оператором switch .
class StringSwitch{
    public static void main(String[] args) {
        String str = "two";

        switch (str){
            case"one":
                System.out.println("один");
                break;
            case"two":
                System.out.println("два");
                break;
            case"three":
                System.out.println("три");
                break;
            default:
                System.out.println("совпадений нет");
                break;
        }
    }
}
/*
Строка, содержащаяся в str ("two" в рассматриваемой программе), про-
веряется на предмет соответствия константам в case. Когда совпадение най-
дено (во втором операторе case), выполняется кодовая последовательность,
связанная с данным case.
 */

/*
Подводя итоги, важно отметить три особенности оператора switch.

• Оператор switch отличается от if тем, что он может проверять только
на предмет равенства, тогда как оператор if способен оценивать логи-
ческое выражение любого вида. То есть switch ищет только совпадение
значения выражения с одной из констант в операторах case.

• Никакие две константы case в одном switch не могут иметь одина-
ковые значения. Разумеется, один оператор switch и включающий его
внешний switch могут иметь общие константы case.

• Оператор switch обычно более эффективен, чем набор вложенных опе-
раторов if.
 */