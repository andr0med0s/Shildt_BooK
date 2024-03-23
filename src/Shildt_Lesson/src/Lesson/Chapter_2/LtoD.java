package Lesson.Chapter_2;
// стр 90
// Демонстрация автоматического преобразования типа long
// в тип double
public class LtoD {
    public static void main(String[] args) {
        long L;
        double D;

        L = 100123285L;
        D = L; // автоматическое преобразование типа long в тип doube

       // L = D; // Ошибка!!! тип double не преобразуется автоматически в тип long

        System.out.println("L и D: " + L + " " + D);

    }
}
