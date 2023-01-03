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

//160 Полное руководство
//Демонстрация работы continue
class Continue{
    public static void main(String[] args) {
        for(int i = 0; i<10 ; i++){
            System.out.print(i + " ");
            if(i%2==0) continue;
            System.out.println("");

        }
    }
}
/*
Операция % в коде используется для проверки значения i на предмет чет-
ности. Если значение i четное, тогда цикл продолжается без вывода символа
новой строки.
 */