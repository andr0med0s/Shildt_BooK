package Shildt_Lesson.src.Lesson.Chapter_3;
//стр 127
// Чтение вводимых данных до тех пор, пока не будет получена буква q
class Break2 {
    public static void main(String[] args)
            throws java.io.IOException {

        char ch;

        for (;;) { // Бесконечный цикл, завершаемый инструкцией break
            ch = (char) System.in.read(); // получение символа с клавиатуры
            if (ch == 'q')
                break; // Бесконечный цикл, завершаемый инструкцией break
        }
        System.out.println("Вы нажали клавишу q!");
    }
}
