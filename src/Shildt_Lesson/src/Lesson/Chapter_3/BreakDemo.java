package Shildt_Lesson.src.Lesson.Chapter_3;
//126

// Применение инструкции break для выхода из цикла
 class BreakDemo {
    public static void main(String[] args) {
        int num;

        num = 100;

        // Выполнение цикла до тех пор, пока квадрат значения переменной i меньше значения переменной num
        for(int i=0; i<num; i++) {
            if(i*i >= num) break; // прекращение выполнения цикла, если i*i >=100
            System.out.print(i + "  ");
        }
        System.out.println("Цикл завершен.");
    }
}
