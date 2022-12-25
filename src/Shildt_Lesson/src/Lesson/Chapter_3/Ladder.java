package Shildt_Lesson.src.Lesson.Chapter_3;

// стр 105
//  Демонстрация использования многоступенчатой конструкции if-else-if
public class Ladder {
    public static void main(String[] args) {
        int x;

        for (x = 0; x < 6; x++) {
            if (x == 1)
                System.out.println("x равно 1");
            else if (x == 2)
                System.out.println("x равно 2");
            else if (x == 3)
                System.out.println("x равно 3");
            else if (x == 4)
                System.out.println("x равно 4");
            else
                //  Условие, выполняемое по умолчанию
                System.out.println("Значение x находится вне диапазона 1-4"); // оператор, заданный по умолчанию
        }
        /*
                    устанавливаемая по умолчанию ветвь else выполняется лишь
            в том случае, если проверка условий каждого из предыдущих предложений i f
            дает ложный результат
        */
    }
}

// стр 135 Полное руководство Java 12-е издание
//Демонстрация операторов if-else-if
class IfElse {
    public static void main(String[] args) {
        int month = 4; // апрель
        String season;

        if (month == 12 || month == 1 || month == 2)
            season = "Зима";
        else if (month == 3 || month == 4 || month == 5)
            season = "Весна";
        else if (month == 6 || month == 7 || month == 8)
            season = "Лето";
        else if (month == 9 || month == 10 || month == 11)
            season = "Осень";
        else
            season = "Не существующий месяц";
        System.out.println("Апрель - это " + season + " .");
    }
}
