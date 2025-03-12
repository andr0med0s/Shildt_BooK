package Exercise.Chapter_8.interfaces2;
/* 
// Демонстрация трех реализаций интерфейса ICharQ
class IQDemo {

    public static void main(String args[]) {
      FixedQueue q1 = new FixedQueue(10);
      DynQueue q2 = new DynQueue(5);
      CircularQueue q3 = new CircularQueue(10);
      DynCircularQueue q4 = new DynCircularQueue(5);
      // CopyQueue q5 = new CopyQueue(20);
    
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
      System.out.print("Содержимое дополнения кольцевой очереди:  ");
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
  
      // //reset   
      // iQ.reset();
      
      //-------------динакольцевая--------------//
      iQ = q4;
      // Помещение ряда символов в динакольцевую очередь
      for (i = 0; i < 10; i++)
        iQ.put((char) ('Z' - i));
  
      // Отображение содержимого очереди
      System.out.print("Содержимое динакольцевой очереди: ");
      for (i = 0; i < 10; i++) {
        ch = iQ.get();
        System.out.print(ch);
      }
      System.out.println();
  
      // Помещение дополнительных символов в кольцевую очередь
      for (i = 0; i < 10; i++)
      iQ.put((char) ('A' + i));

      // Отображение дополнительного содержимого очереди
      System.out.print("Содержимое дополнения динакольцевой очереди:  ");
      for (i = 0; i < 10; i++) {
        ch = iQ.get();
        System.out.print(ch);
      }

      System.out.println();

      System.out.println(
        "\nСохранение и использование данных" + "  динакольцевой очереди."
      );

      // Помещение символов в динакольцевую очередь с последующим их извлечением
      for (i = 0; i < 10; i++) {
        iQ.put((char) ('Z' - i));
        ch = iQ.get();
        System.out.print(ch);
      }
      for (i = 0; i < 10; i++) {
        iQ.put((char) ('A' + i));
        ch = iQ.get();
        System.out.print(ch);
      }
  
      System.out.println();
      
      iQ = q1;
      iQ.reset();
      // Помещение ряда символов в очередь фиксированного размера
      for (i = 0; i < 10; i++) 
      iQ.put((char) ('A' + i));

      iQ = q3;
      //Помещение ряда символов в динамическую очередь
      // for (i = 0; i < 10; i++)
      //   iQ.put((char) ('A' + i));
      
      ICharQ.copyQueue(q1, q3);

    }
  
    
  }
  
*/