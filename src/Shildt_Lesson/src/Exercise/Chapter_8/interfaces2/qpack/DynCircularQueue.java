package Exercise.Chapter_8.interfaces2.qpack;

import Exercise.Chapter_8.interfaces2.ICharQ;

public class DynCircularQueue implements ICharQ{

    private char q[]; // массив для хранения элементов очереди
    private int putloc, getloc; // индексы вставляемых и извлекаемых элементов
  
    // Создание пустой очереди заданного размера
    public DynCircularQueue(int size) {
      q = new char[size +1]; // выделение памяти для очереди
      putloc = getloc = 0;
    }

    @Override
    public void put(char ch) {
        if (putloc+1 == getloc |
        ((putloc == q.length - 1) & (getloc == 0))) {
            // System.out.println("  - Очередь  заполнена");
            // return;
            // Увеличение размера очереди
            char t[] = new char[(q.length * 2)-1];
  
            // Копирование элементов в новую очередь
            for (int i = 0; i < q.length; i++) t[i] = q[i];
            q = t;
        }
        q[putloc++] = ch;
        if (putloc == q.length) putloc = 0; //  перейти в начало массива
    }

    @Override
    public char get() {
        if (getloc == putloc) {
          System.out.println(" - Очередь  пуста");
          return (char)  0;
        }
        char ch = q[getloc++];
        if (getloc == q.length) getloc = 0; //  вернуться в начало очереди
        return ch;
      }

    @Override
      public char reset(){
        putloc = getloc = 0;
        System.out.println(" - Очередь сброшена");
        return (char)  0;
      }
}
      




