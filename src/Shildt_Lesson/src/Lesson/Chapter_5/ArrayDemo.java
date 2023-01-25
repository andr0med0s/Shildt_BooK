package Shildt_Lesson.src.Lesson.Chapter_5;
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
