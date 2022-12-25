package Shildt_Lesson.src.Lesson.Chapter_3;
//стр 103
//----------Условная инструкция if ------------
// Игра в угадывание букв

/*
        if (условие) инструкция или их последовательность;
        else инструкция их последовательность;
*/
//В качестве условия может использоваться любое выражение, которое воз-
//вращает значение типа Ьoolean.

public class Guess {
    public static void main(String[] args) 
        throws java.io.IOException {

            char ch, answer = 'K' ;

            System.out.println("Задумана буква из диапазона A-Z.");
            System.out.println("Попытайтесь ее угадать: ");

            ch = (char) System.in.read(); // чтение символа с клавиатуры
            if(ch == answer) System.out.println("** Правильно! **");
        }
   
}
