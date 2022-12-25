package Shildt_Lesson.src.Lesson.Chapter_3;
//стр 132
// Применение инструкции continue
 class ContDemo {
    public static void main(String[] args) {
        int i;

        // Вывод четных чисел в пределах от 0 до 100
        for(i = 0; i<=100; i++) {
            if((i%2) !=0) continue; // завершение шага итеррации цикла
            System.out.println(i);
        }
    }
}
