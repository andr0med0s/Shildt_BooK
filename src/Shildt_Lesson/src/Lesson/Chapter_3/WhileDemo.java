package Shildt_Lesson.src.Lesson.Chapter_3;
//стр 120
//  Демонстрация использования цикла while
public class WhileDemo {
    public static void main(String[] args) {
        char ch;

        // вывод букв английского алфавита, исползуя цикл while
        ch = 'a';
        while(ch <= 'z') {
            System.out.println(ch);
            ch++;
        }
    }
}
/*
Еще одной разновидностью циклов в Java является цикл while. Ниже при-
веден общий синтаксис этого цикла:
while (у с л о в и е ) б л о к ;
*/ 
/*
Как и в цикле for, в цикле while проверяется условное выражение, указы-
ваемое в самом начале цикла. Это означает, что код в теле цикла может вообще
не выполняться, а кроме того, избавляет от необходимости выполнять отдель-
ную проверку перед самим циклом.
 */

//стр 141 Полное руководство
//демонстрация работы цикла while
class While1{
    public static void main(String[] args) {
        int n = 10;

        while(n > 0){
            System.out.println("Импульс номер " + n);
            n--;
        }
    }
}