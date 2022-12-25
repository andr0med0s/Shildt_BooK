package Shildt_Lesson.src.Lesson.Chapter_3;
// стр 119
// Объявление переменной цикла в самом цикле for
public class ForVar {
    public static void main(String[] args) {
        int sum = 0;
        int fact = 1;

        // Вычисление факториала чисел от 1 до 5
        for(int i = 1; i <= 5; i++) { // Переменная объявляется в самом цикле for
            sum += i; // переменная i доступна во всем цикле
            fact *= i;
        }

        // однако здесь переменная i недоступна

        System.out.println("Сумма: " + sum);
        System.out.println("Факториал: " + fact);
    }
}
/**        Объявляя переменную в цикле for, не следует забывать о том, что область
        действия этой переменной ограничивается определением цикла for. Это озна-
        чает, что за пределами цикла действие данной переменной прекращается. Так, в
        приведенном выше примере переменная i оказывается недоступной за предела-
        ми цикла for. Для того чтобы использовать переменную цикла в каком-нибудь
        другом месте программы, ее нельзя объявлять в цикле for.

 */ 