package Lesson.Chapter_3;
//стр 116
// Пропуск отдельных состовляющих в определении цикла for
public class Empty {
    public static void main(String[] args) {
        int i;

        for(i = 0; i < 10;){ // отсутсвует итерационное выражение
            System.out.println("Проход #" + i);
            i++; // инкрементирование переменной цикла

        }
    }
}
