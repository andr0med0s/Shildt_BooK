package Shildt_Lesson.src.Lesson.Chapter_5;
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
