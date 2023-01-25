package Shildt_Lesson.src.Lesson.Chapter_5;
// Выделение памяти по второму индексу массива вручную

/*
* Допустим, требуется написать программу, в процессе выполнения которой будет
сохраняться число пассажиров, перевезенных автобусом-экспрессом в аэропорт.
Если автобус делает по десять рейсов в будние дни и по два рейса в субботу и
воскресенье, то массив r id e r s можно объявить так, как показано в приведен-
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
