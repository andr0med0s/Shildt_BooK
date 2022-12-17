package Shildt_Lesson.src.Lesson.Chapter_1;
// стр 56
//Демонстрация применения блоков кода
 class BlockDemo {
    public static void main(String[] args) {
        double i, j, d;
        
        i = 5;
        j = 10;

        // Телом этой инструкции if является целый блок кода
        if(i != 0) {
            System.out.println("i не равен нулю");
            d = j / i;
            System.out.println("j / i равно " + d);
        }
    }
}
