package Shildt_Lesson.src.Lesson.Chapter_2;
//стр 70

//С символьными переменными можно обращаться
// как с целочисленными
public class CharArthDemo {
    public static void main(String[] args) {
        char ch;
        
        ch = 'X';
        System.out.println("ch содержит " + ch);

        ch++; // инкрементировать переменную ch
        System.out.println("теперь ch содержит " + ch);

        ch = 90; // присвоить переменной ср значение 'Z'  //--- переменной типа char можно
                                                          // присвоить целочисленное значение
        System.out.println("теперь ch содержит " + ch);
    }
}
