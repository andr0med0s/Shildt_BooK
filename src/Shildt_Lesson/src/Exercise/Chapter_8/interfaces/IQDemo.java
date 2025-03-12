package Exercise.Chapter_8.interfaces;

// стр 332 
//  Класс,  реализующий очередь  фиксированного размера
//  для хранения символов
class FixedQueue implements ICharQ {

  private char q[]; // массив для хранения элементов очереди
  private int putloc, getloc; // индексы вставляемых и извлекаемых элементов

  //создание пустой очереди заданного размера
  public FixedQueue(int size) {
    q = new char[size]; //выделение памяти для очереди
    putloc = getloc = 0;
  }

  //Помещение символа в очередь
  public void put(char ch) {
    if (putloc == q.length) {
      System.out.println(" - Очередь заполнена");
      return;
    }

    q[putloc++] = ch;
  }

  // Извлечение символа из очереди
  public char get() {
    if (getloc == putloc) {
      System.out.println("  - Очередь  пуста");
      return (char) 0;
    }
    return q[getloc++];
  }
  
  @Override
  public char reset() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'reset'");
  }

  
}
/*
 * Эта реализация интерфейса ICharQ выполнена на основе уже знакомого вам класса Queue, разработанного в главе 5
 */

//  Кольцевая очередь
class CircularQueue implements ICharQ {

  private char q[]; // массив для хранения элементов  очереди
  private int putloc, getloc; // индексы вставляемых и извлекаемых элементов

  // Создание пустой очереди заданного размера
  public CircularQueue(int size) {
    q = new char[size + 1]; //  выделение памяти для очереди
    putloc = getloc = 0;
  }

  //  Помещение символа в  очередь
  public void put(char ch) {
    // Очередь  считается полной,  если индекс putloc на единицу
    // меньше индекса getloc или если индекс putloc указывает
    //  на конец массива,  а индекс getloc -  на его начало
    if (putloc+1 == getloc |
    ((putloc == q.length - 1) & (getloc == 0))) {
      System.out.println("  - Очередь  заполнена");
      return;
    }
    q[putloc++] = ch;
    if (putloc == q.length) putloc = 0; //  перейти в начало массива
  }

  //  Извлечение  символа из очереди
  public char get() {
    if (getloc == putloc) {
      System.out.println(" - Очередь  пуста");
      return (char)  0;
    }
    char ch = q[getloc++];
    if (getloc == q.length) getloc = 0; //  вернуться в начало очереди
    return ch;
  }

  //reset
  public char reset(){
    putloc = getloc = 0;
    System.out.println(" - Очередь сброшена");
    return (char)  0;
  }

}
/**
 * В кольцевой очереди повторно используются элементы массива, освобожденные  при  извлечении  символов.  Поэтому в  нее  можно помещать неограниченное число элементов (при условии, что элементы, помещенные в очередь ранее, будут вовремя удалены).  Отслеживание границ массива выполняется очень просто (достаточно обнулить индекс  по достижении верхней границы), хотя условие достижения этих границ может на первый взгляд показаться не совсем понятным. Кольцевая очередь переполняется не тогда, когда достигается верхняя граница массива, а тогда, когда число элементов, ожидающих извлечения из очереди, становится слишком большим.  Поэтому в методе put ()  проверяется ряд условий с целью определить момент переполнения очереди.  Как следует из комментариев к коду, очередь считается  заполненной,  если  индекс putloc  будет на единицу меньше индекса getloc или если индекс putloc указывает на конец массива, а индекс getloc — на его начало. Как и прежде, очередь считается пустой, если индексы getloc и putloc равны. С целью упрощения соответствующих проверок размер создаваемого массива на единицу превышает размер очереди.
 */

// Динамическая очередь
class DynQueue implements ICharQ {

  private char q[]; // массив для хранения элементов очереди
  private int putloc, getloc; // индексы вставляемых и извлекаемых элементов

  // Создание пустой очереди заданного размера
  public DynQueue(int size) {
    q = new char[size]; // выделение памяти для очереди
    putloc = getloc = 0;
  }

  // Помещение символа в очередь
  public void put(char ch) {
    if (putloc == q.length) {
      // Увеличение размера очереди
      char t[] = new char[q.length * 2];

      // Копирование элементов в новую очередь
      for (int i = 0; i < q.length; i++) t[i] = q[i];
      q = t;
    }
    q[putloc++] = ch;
  }

  // Извлечение символа из очереди
  public char get() {
    if (getloc == putloc) {
      System.out.println("  - Очередь пуста");
      return (char) 0;
    }
    return q[getloc++];
  }

  @Override
  public char reset() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'reset'");
  }

}

/**
 * В данной реализации при попытке поместить в заполненную очередь еще один элемент создается новый массив, размеры которого в два раза превышают размеры исходного, текущее содержимое очереди копируется в новый массив, а ссылка на него помещается в переменную q
 */

 // Демонстрация трех реализаций интерфейса ICharQ
class IQDemo {

  public static void main(String args[]) {
    FixedQueue q1 = new FixedQueue(10);
    DynQueue q2 = new DynQueue(5);
    CircularQueue q3 = new CircularQueue(10);
  
    ICharQ iQ;

    char ch;
    int i;

    //------------------------------фиксированная--------------------------------
    iQ = q1;
    // Помещение ряда символов в очередь фиксированного размера
    for (i = 0; i < 10; i++) 
      iQ.put((char) ('A' + i));

    // Отображение содержимого очереди
    System.out.print("Содержимое фиксированной очереди:  ");
    for (i = 0; i < 10; i++) {
      ch = iQ.get();
      System.out.print(ch);
    }
    System.out.println();

    //-------------------------динамическая-------------------------------------
    iQ = q2;
    // Помещение ряда символов в динамическую очередь
    for (i = 0; i < 10; i++)
      iQ.put((char) ('Z' - i));

    // Отображение содержимого очереди
    System.out.print("Содержимое динамической очереди: ");
    for (i = 0; i < 10; i++) {
      ch = iQ.get();
      System.out.print(ch);
    }
    System.out.println();

    //-------------------------кольцевая-------------------------------------
    iQ = q3;
    // Помещение ряда символов в кольцевую очередь
    for (i = 0; i <10; i++)
      iQ.put((char) ('A' + i));

    // Отображение содержимого очереди
    System.out.print("Содержимое кольцевой очереди: ");
    for (i = 0; i < 10; i++) {
      ch = iQ.get();
      System.out.print(ch);
    }
    System.out.println();

    // Помещение дополнительных символов в кольцевую очередь
    for (i = 10; i < 20; i++)
      iQ.put((char) ('A' + i));
    // Отображение содержимого очереди
    System.out.print("Содержимое кольцевой очереди:  ");
    for (i = 0; i < 10; i++) {
      ch = iQ.get();
      System.out.print(ch);
    }
    System.out.println(
      "\nСохранение и использование данных" + "  кольцевой очереди."
    );
    // Помещение символов в кольцевую очередь с последующим их извлечением
    for (i = 0; i < 20; i++) {
      iQ.put((char) ('A' + i));
      ch = iQ.get();
      System.out.print(ch);
    }

    System.out.println();

    //reset   
    iQ.reset();

  }

}
