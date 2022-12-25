package Shildt_Lesson.src.Lesson.Chapter_3;
//стр 121
// Демонстрация использования цикла do-while
/*
do {
и н с т р у к ц и и ;
} while (у с л о в и е ) ;
*/ 
public class DWDemo {
    public static void main(String[] args)
        throws java.io.IOException {

        char ch;

        do{
            System.out.print("Нажмите нужную клавишу, а затем клавишу ENTER: ");
            ch = (char) System.in.read(); // чтение символа с клавиатуры
        } while(ch != 'q');
    }
}
