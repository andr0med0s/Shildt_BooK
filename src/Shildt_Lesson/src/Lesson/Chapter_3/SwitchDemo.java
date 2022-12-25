package Shildt_Lesson.src.Lesson.Chapter_3;
// стр 108
//  Демонстрация использования инструкции switch
public class SwitchDemo {
    public static void main(String[] args) {
        int i;

        for(i=0; i<10; i++)
            switch(i){
                case 0:
                    System.out.println("i равно 0");
                    break;
                case 1:
                    System.out.println("i равно 1");
                    break;
                case 2:
                    System.out.println("i равно 2");
                    break;
                case 3:
                    System.out.println("i равно 3");
                    break;
                case 4:
                    System.out.println("i равно 4");
                    break;
                default:
                    System.out.println("i равно или больше 5");
            }
    }
}
/*
                switch (выражение) {
                case константа 1:
                последовательность инструкций
                break;
                case константа2:
                последовательность инструкций
                break;
                case константаЗ:
                последовательность инструкций
                break;
                .
                .
                .
                default:
                последовательность инструкций
                }
*/

/*В настоящее время выражение также может иметь тип String. Каждое
значение, указанное в операторах case, должно быть уникальным констант-
ным выражением (например, литеральным значением). Дублирование значе-
ний в операторах case не разрешено. Тип каждого значения должен быть со-
вместимым с типом выражения.
 */

// стр 136 Полное руководство Java 12-е издание
//Простой пример оператора switch.
class SampleSwitch{
    public static void main(String[] args) {
        for(int i=0; i<6; i++)
            switch (i){
            case 0:
                System.out.println("i равно нулю.");
                break;
                case 1:
                System.out.println("i равно одному.");
                    break;
                case 2:
                    System.out.println("i равно двум.");
                    break;
                case 3:
                System.out.println("i равно трем.");
                    break;
                default:
                    System.out.println("i больше трех.");
                    break;
        }
    }
}