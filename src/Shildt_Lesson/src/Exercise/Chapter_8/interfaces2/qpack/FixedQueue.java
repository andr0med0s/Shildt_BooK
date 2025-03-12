package Exercise.Chapter_8.interfaces2.qpack;

import Exercise.Chapter_8.interfaces2.ICharQ;

//  Класс,  реализующий очередь  фиксированного размера
//  для хранения символов
public class FixedQueue implements ICharQ {

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
  
  public char reset(){
    putloc = getloc = 0;
    System.out.println(" - Очередь сброшена");
    return (char)  0;
  }


}
/*
 * Эта реализация интерфейса ICharQ выполнена на основе уже знакомого вам класса Queue, разработанного в главе 5
 */





/**
 * В данной реализации при попытке поместить в заполненную очередь еще один элемент создается новый массив, размеры которого в два раза превышают размеры исходного, текущее содержимое очереди копируется в новый массив, а ссылка на него помещается в переменную q
 */


