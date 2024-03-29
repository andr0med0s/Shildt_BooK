package Exercise.Chapter_6;
//стр 251 ------Упражнение 6.3--------Быстрая сортировка---------

/*
* В данном упражнении будет создана программа для сортировки
*  символьного массива, но демонстрируемый подход может быть
*  применен к сортировке любых объектов.
*
       Быстрая сортировка опирается на принцип разделения. Сначала из массива
    выбирается один опорный элемент (так называемый компаранд), и массив
    делится на две части. Элементы, меньшие опорного, помещаются в одну часть
    массива, а большие или равные опорному — в другую часть. Затем процесс
    рекурсивно повторяется для каждой оставшейся части до тех пор, пока массив
     не окажется отсортированным.
* */

/*
// Упражнение 6.3. Простая версия класса Quicksort,
// реализующего быструю сортировку
* */
class Quicksort {

    // Вызов фактического метода быстрой сортировки
    static void qsort(char[] items) {
        qs(items, 0, items.length - 1);
    }
    // Рекурсивная версия метода быстрой сортировки символов
    private static void qs(char[] items, int left, int right)
    {
        int i, j;
        char x, y;
        i = left; j = right;
        x = items[(left+right)/2];
        do {
            while((items[i] < x) && (i < right)) i++;
            while((x < items[j]) && (j > left)) j-- ;

            if(i <= j) {
                y = items[i];
                items[i] = items[j];
                items[j] = y;
                i++; j -- ;
            }
        } while(i <= j);

        if(left < j) qs(items, left, j);
        if(i < right) qs(items, i, right);
    }
}
 class QSDemo {
     public static void main(String[] args) {
         char[] a  = { 'd', 'x', 'a', 'r', 'p', 'j', 'i' };
         int i;
         System.out.print("Исходный массив: ");
         for(i=0; i < a.length; i++)
             System.out.print(a[i]);
         System.out.println() ;
// Сортировка массива
         Quicksort.qsort(a) ;
         System.out.print("Отсортированный массив: ");
         for(i=0; i < a.length; i++)
             System.out.print(a[i]) ;
         }
}
