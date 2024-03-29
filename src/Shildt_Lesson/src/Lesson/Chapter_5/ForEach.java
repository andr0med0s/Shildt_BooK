package Lesson.Chapter_5;

// Использование цикла типа for-each
//стр 193
class ForEach {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        //Использование цикла типа for-each для
        // суммирования и отображения значений
        for(int x : nums) { // цикл типа for-each (для каждого int x массива nums)
            System.out.println("Значение: " + x);
            sum += x;
        }
        System.out.println("Сумма: " + sum);
    }

}


/* преждевременный выход из цикла используя онструкцию break
 // Суммирование первых 5 элементов массива
        for(int х : nums) {
            System.out.println("Значение: " + x);
            sum += x;
            if (x == 5) break; // прерывание цикла по достижении значения 5
        }
* */

// Циклы типа for-each предназначены только для чтения
class NoChange {
    public static void main(String args[]) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int x : nums) {
            System.out.print(x + " ");
            x = x * 10; // Эта операция не изменяет содержимое массива nums
        }
        System.out.println();
        for(int x : nums){
            System.out.print(x + " ");
        }
        System.out.println();
    }
}

//Циклическое обращение к элементам многомерных массивов
// стр 195
/*
* в Java многомерный массив представляет
собой массив массивов (например, двумерный массив — это массив, элементами
которого являются одномерные массивы). Эту особенность важно помнить, ор-
ганизуя циклическое обращение к многомерным массивам, поскольку на каждом
 шаге цикла извлекается очередной массив, а не отдельный элемент.

* Более того, итерационная переменная в расширенном цикле for должна иметь тип,
совместимый с типом извлекаемого массива. Так, при обращении к двумерному
 массиву итерационная переменная должна представлять собой ссылку на
одномерный массив.
*
* */


//Использование расширенного цикла for
//для обработки двумерного массива

class ForEach2 {
    public static void main(String[] args) {
        int sum = 0;
        int[][] nums = new int[3][5];

        // Ввод ряда значений в массив nums
        for(int i = 0; i < 3; i++){
            for(int j=0; j < 5; j++){
                nums[i][j] = (i+1)* (j + 1);
            }
        }

        //Использование цикла типа for-each для
        //суммирования и отображения значений
        for(int[] x : nums){  // обратите внимание на способ объявления переменной х
            for(int y : x){                                      //
                System.out.println("Значение: " + y);            //
                sum +=y;                                         //
            }                                                    //
        }                                                        //
        System.out.println("Сумма: " + sum);                     //
    }                                                            //
}                                                                //
  /*
                                   Заметьте, каким образом объявлена переменная х. Она представляет собой
                                ссылку на одномерный целочисленный массив. Это очень важно, поскольку
                                на каждом шаге цикла for из двумерного массива nums извлекается очередной
                                массив, начиная с nums[0]. А во внутреннем цикле for перебираются элементы
                                 полученного массива и отображаются их значения.
   */



// Поиск в массиве с использованием расширенного цикла for
// стр 196

/*
* В приведенном ниже примере программы расширенный цикл for
 применяется для поиска значения в неотсортированном массиве.
 Выполнение цикла прерывается, если искомый элемент найден.
* */

class Search {
    public static void main(String[] args) {
        int[] nums = {6, 8, 3, 7, 5, 6, 1, 4};
        int val = 5;
        boolean found = false;

        // Использование цикла типа for-each для поиска
        // значения переменной val в массиве nums
        for(int x : nums) {
            if(x == val){
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("Значение найдено!");
        }else {
            System.out.println("Значение НЕ найдено!");
        }
    }
}
/*
* Расширенным циклом for удобно также пользоваться для расчета
среднего значения, нахождения минимального и максимального элементов
множества, выявления дубликатов значений и т.п.
* */