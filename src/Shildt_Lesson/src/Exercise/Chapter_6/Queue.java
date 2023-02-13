package Shildt_Lesson.src.Exercise.Chapter_6;

class Queue{
    private char[] q; // массив типа char для хранения элементов очереди
    private int putloc, getloc; //индексы для вставки и извлечения элементов из очереди

    Queue(int size){         // Конструктор класса Queue создает очередь заданного размера.
        q = new char[size]; //выделение памяти для очереди
        putloc = getloc = 0;
    }

    // Помещение символа в очередь
    void put(char ch) {
        if (putloc == q.length-1) {
            System.out.println(" - Очередь заполнена");
            return;
        }
        q[putloc++] = ch;
    }
        /* ↑
        Прежде всего в теле данного метода проверяется, не переполнена ли оче-
        редь. Если значение переменной putloc соответствует последней по-
        зиции в массиве q, то места для размещения новых элементов в очереди
        нет. В противном случае переменная putloc инкрементируется, и новый
        элемент располагается в указанном месте массива. Следовательно, пере-
        менная putloc всегда содержит индекс элемента, помещенного в очередь
        последним.
         */

    // Извлечение символа из очереди
    char get() {
        if(getloc == putloc) {
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }
        return q[getloc++];
    }
        /* ↑
        Сначала в данном методе проверяется, пуста ли очередь. Если значения ин-
        дексов в переменных getloc и putloc совпадают, то в очереди нет ни од-
        ного элемента. Именно поэтому в конструкторе Queue переменные getloc
        и putloc инициализируются нулевыми значениями. Если очередь не пуста,
        то переменная getloc инкрементируется, и из нее извлекается очередной
        элемент. Следовательно, переменная getloc содержит индекс последнего
        извлеченного элемента.
        */
}

// Демонстрация использования класса Queue
class QDemo {
    public static void main(String[] args) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i;
        System.out.println("Использование очереди bigQ для сохранения алфавита");

        // Помещение буквенных символов в очередь bigQ
        for(i=0; i < 26; i++) {
            bigQ.put((char) ('A' + i));
        }

        // Извлечение и отображение буквенных символов из очереди bigQ
        System.out.print("Содержимое очереди bigQ: ");
        for(i=0; i < 26; i++) {
            ch = bigQ.get();
            if (ch != (char) 0) System.out.print(ch);
        }

        System.out.println("\n");

        System.out.println("Использование очереди smallQ для генерации ошибок");

        // Использование очереди smallQ для генерации ошибок
        for(i=0; i < 5; i++) {
            System.out.print("Попытка сохранения " + (char) ('Z' - i) ) ;
            smallQ.put((char) ('Z' - i) ) ;
            System.out.println() ;
        }
        System.out.println() ;

        // Дополнительные ошибки при обращении к очереди smallQ
        System.out.print("Содержимое очереди smallQ: ");
        for(i=0; i < 5; i++) {
            ch = smallQ.get();
            if(ch != (char) 0) System.out.print(ch);
        }
    }
}
