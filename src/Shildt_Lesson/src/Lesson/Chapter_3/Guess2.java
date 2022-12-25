package Shildt_Lesson.src.Lesson.Chapter_3;
//стр 104
//Игра в угадывание букв, вторая версия
/*
        if (условие) инструкция;
        else инструкция;
*/ 
public class Guess2 {
    
    public static void main(String[] args) 
        throws java.io.IOException {

            char ch, answer = 'K' ;

            System.out.println("Задумана буква из диапазона A-Z.");
            System.out.println("Попытайтесь ее угадать: ");

            ch = (char) System.in.read(); // чтение символа с клавиатуры
            if(ch == answer) System.out.println("** Правильно! **");
            else System.out.println("...Извините, вы не угадали.");
        }
}
