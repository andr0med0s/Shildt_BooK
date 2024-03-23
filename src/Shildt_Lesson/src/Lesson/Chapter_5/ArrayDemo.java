package Lesson.Chapter_5;
//Демонстрация одномерного массива
//стр 175
class ArrayDemo {
    public static void main(String[] args) {
        int[] sample = new int[10];
        int i;

        for(i = 0; i < 10; i++){ //  <---- Индексация массивов начинается с нуля
            sample[i] = i;
        }
        for(i = 0; i < 10; i++){ //  <---- Индексация массивов начинается с нуля
            System.out.println("Элемент [" + i + "]: " + sample[i]);
        }
    }
}

// Поиск минимального и максимального значений в массиве
//стр 176
class MinMax {
    public static void main(String[] args) {
        int[] nums = new int[10];
        int min, max;

        nums[0] = 99;
        nums[1] = -10;
        nums[2] = 10123;
        nums[3] = 18;
        nums[4] = -978;
        nums[5] = 5623;
        nums[6] = 463;
        nums[7] = -9;
        nums[8] = 287;
        nums[9] = 49;

        min = max = nums[0];
        for (int i = 1; i < 10; i++) {
            if (nums[i] < min) min = nums[i];
            if (nums[i] > max) max = nums[i];
        }
        System.out.println("min и max: " + min + " " + max);
    }
}
//Применение инициализаторов массива стр 176

class MInMax2 {
    public static void main(String[] args) {
        int[] nums = {99, -10, 100123, 18, -978,
                5623, 463, -9, 287, 49};
        int min, max;

        min = max = nums[0];
        for (int i = 1; i < 10; i++) {
            if (nums[i] < min) min = nums[i];
            if (nums[i] > max) max = nums[i];
        }
        System.out.println("min и max: " + min + " " + max);
    }
}

//Намеренный выход за пределы массива

class ArrayErr {
    public static void main(String args[]) {
        int[] sample = new int[10];
        int i;
// Имитация выхода индекса за пределы массива
        for (i = 0; i < 100; i = i + 1)
            sample[i] = i;
    }
}


//Демонстрация использования двумерного массива
// стр 180
class TwoD {
    public static void main(String[] args) {
        int t, i;
        int[][] table = new int[3][4];

        for (t = 0; t < 3; ++t) {
            for (i = 0; i < 4; ++i) {
                table[t][i] = (t * 4) + i + 1;
                System.out.print(table[t][i] + " ");
            }
            System.out.println();
        }
    }
}

// Выделение памяти по второму индексу массива вручную стр 180

/*
* Допустим, требуется написать программу, в процессе выполнения которой будет
сохраняться число пассажиров, перевезенных автобусом-экспрессом в аэропорт.
Если автобус делает по десять рейсов в будние дни и по два рейса в субботу и
воскресенье, то массив riders можно объявить так, как показано в приведен-
ном ниже фрагменте кода.
* */
class Ragged {
    public static void main(String[] args) {
        int[][] riders = new int[7][];
        riders[0] = new int[10]; // для первых
        riders[1] = new int[10]; // пяти элементов длина
        riders[2] = new int[10]; // массива по второму
        riders[3] = new int[10]; // индексу
        riders[4] = new int[10]; // равна 10
        riders[5] = new int[2]; // для остальных двух элементов длина
        riders[6] = new int[2]; // массива по второму индексу равна 2

        int i, j;

        //Формирование произвольных данных
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 10; j++) {
                riders[i][j] = i + j + 10;
            }
        }
        for (i = 5; i < 7; i++) {
            for (j = 0; j < 2; j++) {
                riders[i][j] = i + j + 10;
            }
        }
        System.out.println("Количество пассажиров, перевезенных " +
                "каждым рейсом, в буднии дни недели: ");
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 10; j++) {
                System.out.print(riders[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Количество пассажиров, перевезенных " +
                "каждым рейсом, в выходные дни: ");
        for (i = 5; i < 7; i++) {
            for (j = 0; j < 2; j++) {
                System.out.print(riders[i][j] + " ");
            }
            System.out.println();
        }
    }
}


// Инициализация двумерного массива стр 183
class Squares {
    public static void main(String[] args) {
        int[][] sqrs = {
                {1, 1}, // у каждой строки свой набор инициализаторов
                {2, 4},
                {3, 9},
                {4, 16},
                {5, 25},
                {6, 36},
                {7, 49},
                {8, 64},
                {9, 81},
                {10, 100},
        };
        int i, j;

        for (i = 0; i < 10; i++) {
            for (j = 0; j < 2; j++) {
                System.out.print(sqrs[i][j] + " ");
            }
            System.out.println();
        }
    }
}


// Присваивание ссылок на массивы

//стр 184

class AssignARef {
    public static void main(String[] args) {
        int i;

        int nums1[] = new int[10];
        int nums2[] = new int[10];

        for (i = 0; i < 10; i++) {
            nums1[i] = i;
        }
        for (i = 0; i < 10; i++) {
            nums2[i] = -i;
        }
        System.out.print("Массив nums1: ");
        for (i = 0; i < 10; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.println();

        System.out.print("Массив nums2: ");
        for (i = 0; i < 10; i++) {
            System.out.print(nums2[i] + " ");
        }
        System.out.println();

        nums2 = nums1;

        System.out.print("Массив nums2 после присваивания: ");
        for (i = 0; i < 10; i++)
            System.out.print(nums2[i] + " ");
        System.out.println();

        // Выполнение операций над массивом numsl
        // через переменную nums2
        nums2[3] = 99;

        System.out.print("Массив nums1 после изменения через nums2: ");
        for (i = 0; i < 10; i++)
            System.out.print(nums1[i] + " ");
        System.out.println();
    }
}

/*
* Нетрудно заметить, что в результате присваивания ссылки на массив nums1
переменной nums2 обе переменные будут ссылаться на один и тот же массив.
* */


// Демонстрация использования переменной экземпляра length стр 185

/*
* В связи с тем что массивы реализованы в виде объектов, у каждого массива
имеется переменная экземпляра length. Значением этой переменной является
число элементов, которые может содержать массив. (Иными словами, в пере-
менной length содержится информация о размере массива.) Ниже приведен
пример программы, демонстрирующий данное свойство массивов.
* */
class LengthDemo {
    public static void main(String[] args) {
        int[] list = new int[10];
        int[] nums = {1, 2, 3};
        int[][] table = { // таблица со строками переменной длины
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };
        System.out.println("Размер list: " + list.length);
        System.out.println("Размер nums: " + nums.length);
        System.out.println("Размер table: " + table.length); //определяем число массивов
        System.out.println("Размер table[0]: " + table[0].length);
        System.out.println("Размер table[1]: " + table[1].length);
        System.out.println("Размер table[2]: " + table[2].length);
        System.out.println() ;

        // Использовать переменную length для инициализации списка
        for(int i = 0; i < list.length; i++ ){
            list[i] = i * i;
        }
        System.out.print("Содержимое списка: ");
        for(int i = 0; i < list.length; i ++){
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
}

// Пример использования переменной length для копирования массивов стр 187
class АСору {
    public static void main(String[] args) {
        int i;
        int[] nums1 = new int[10];
        int[] nums2 = new int[10];

        for(i = 0; i < nums1.length; i++){
            nums1[i] = i;
        }

        //Копирование массива nums1 в массив nums2
        if(nums2.length >= nums1.length){
            for(i = 0; i < nums2.length; i++){
                nums2[i] = nums1[i];
            }
        }
        for(i = 0; i < nums2.length; i++){
            System.out.println(nums2[i] + " ");
        }
    }
}

/*
* В данном примере переменная экземпляра length помогает решить две
важные задачи. Во-первых, она позволяет убедиться в том, что размера целе-
вого массива достаточно для хранения содержимого исходного массива. И во-
вторых, с ее помощью формируется условие завершения цикла, в котором вы-
полняется копирование массива.
* */



// Демонстрация использования одномерного массива .
//Полное руководство 12-е стр 101
class Array {
    public static void main (String [ ] args ) {
        int[] month_days;
        month_days = new int[12];
        month_days[0] = 31;
        month_days[1] = 28;
        month_days[2] = 31;
        month_days[3] = 30;
        month_days[4] = 31;
        month_days[5] = 30;
        month_days[6] = 31;
        month_days[7] = 31;
        month_days[8] = 30;
        month_days[9] = 31;
        month_days[10] = 30;
        month_days[11] = 31;
        System.out.println("B апреле " + month_days[3] + " дней. ");
    }
}

// Улучшенная версия предыдущей программы. стр 102
class AutoArray {
    public static void main (String [ ] args) {
        int[] month_days = {31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31};
        System.out.println("B апреле " + month_days[3] + " дней. ");
    }
}

// Вычисление среднего для массива значений. стр 102
class Average {
    public static void main (String [ ] args ) {
        double[] nums = {10.1, 11.2, 12.3, 13.4, 14.5};
        double result = 0; int i;
        for (i=0; i<5; i++) {
            result = result + nums[i];
        }
        System.out.println("Cpeднee значение : " + result/5);
    }
}

// стр 103 Демонстрация использования многомерного массива
class TwoDArray {
    public static void main(String[] args) {
        int[][] twoD = new int[4][5];
        int i, j, k = 0;
        for(i = 0; i<4; i++){
            for(j = 0; j<5; j++) {
                twoD [i][j] = k;
                k++;
            }
        }
        for (i=0; i<4; i++){
            for(j=0; j<5; j++){
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }
    }
}

//стр 104 Ручное размещение массивов разных размеров во втором изменении
class TwoDAgain{
    public static void main(String[] args) {
        int[][] twoD = new int[4][];
        twoD[0] = new int[1];
        twoD[1] = new int[2];
        twoD[2] = new int[3];
        twoD[3] = new int[4];

        int i, j, k = 0;
        for(i = 0; i<4; i++){
            for(j = 0; j< i + 1; j++) {
                twoD [i][j] = k;
                k++;
            }
        }
        for (i=0; i<4; i++){
            for(j=0; j<i + 1; j++){
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }
    }
}

//инициализация двумерного массива стр 105
class Matrix{
    public static void main(String[] args) {
        double[][] m = {
                {0*0, 1*0, 2*0, 3*0},
                {0*1, 1*1, 2*1, 3*1},
                {0*2, 1*2, 2*2, 3*2},
                {0*3, 1*3, 2*3, 3*3},
        };
        int i , j;
        for(i=0; i<4; i++){
            for(j=0; j<4; j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}

//Демонстрация использования трехмерного массива.
class ThreeDMatrix {
    public static void main(String[] args) {
        int[][][] threeD = new int[3][4][5];
        int i, j, k;

        for (i=0; i<3; i++){
            for (j=0; j<4; j++){
                for(k=0; k<5; k++){
                    threeD[i][j][k] = i * j * k;
                }
            }
        }
        for (i=0; i<3; i++){
            for (j=0; j<4; j++){
                for(k=0; k<5; k++){
                    System.out.print(threeD[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}