package Exercise.Chapter_1;
//стр 58

/*
Упражнение 1.2
Эта программа отображает таблицу перевода галлонов в литры.

*/

class GalToLitTable {
    public static void main(String[] args) {
        double gallons, liters;
        int counter;

        counter = 0; //---счетчик строк инициализируется нулевым значением
        for (gallons = 1; gallons <= 30; gallons++) {
            liters = gallons * 3.7854; // преобразование в литры
            System.out.println(gallons + " галлонам соответствует " + liters + " литра.");
            counter++; // --- Увеличивать значение счетчика на 1 на каждой итерации цикла
            if (counter == 10) { // -- Если значение счетчика равно 10, вывести пустую строку
                System.out.println();
                counter = 0; // сбросить счетчик строк
            }

        }

    }
}
