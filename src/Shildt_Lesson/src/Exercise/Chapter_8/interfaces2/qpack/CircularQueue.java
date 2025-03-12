package Exercise.Chapter_8.interfaces2.qpack;

import Exercise.Chapter_8.interfaces2.ICharQ;

//  Кольцевая очередь
public class CircularQueue implements ICharQ {

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