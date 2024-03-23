package Lesson.Chapter_3;
// стр 127
class Break3 {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            System.out.println("Счетчик внешнего цикла: " + i);
            System.out.print("  Счетчик внутреннего цикла: ");

            int t = 0;
            while(t < 100) {
                if(t == 10) break; // прерывание цикла, если t = 10
                System.out.print(t + " ");
                t++;
            }
            System.out.println();
        }
        System.out.println("Циклы завершины.");
    }
}
/*
инструкция break, выполняющая выход из инструкции switch, оказывает воздействие только на эту инструкцию, но не на охватывающие ее циклы.
*/ 
