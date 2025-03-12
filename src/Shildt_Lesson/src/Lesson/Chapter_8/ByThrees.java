package Lesson.Chapter_8;

/* стр 329
 * Как пояснялось ранее, интерфейс может быть реализован каким угодно количеством классов.  В 
качестве примера ниже приведен код класса ByThrees,формирующего последовательный ряд числовых 
значений, каждое из которых на три больше предыдущего.
 */

// Еще одна реализация интерфейса Series
/*
class ByThrees implements Series  {   // ◄------Другая реализация интерфейса Series
    int start;
    int val;

    ByThrees()  {
        start = 0;
        val = 0;
    }
    
    public int getNext()  {
        val += 3;
        return val;
    }

    public void reset ()  {
        start = 0;
        val = 0;
    }

    public void setStart(int х)  {
        start = х;
        val = х;
    }
}
*/
/* стр 330

 * Следует также иметь в виду, что если в определении класса имеется ключевое слово implements, но он 
не реализует все методы указанного интерфейса, то этот класс должен быть объявлен абстрактным 
(abstract). Объект такого класса создать нельзя, но можно использовать его в качестве суперкласса, 
а завершить реализацию методов интерфейса — в его подклассах

 */

//стр 331

// Использование интерфейсных ссылок

class ByThrees implements Series {

    int start;
    int val;
  
    ByThrees() {
      start = 0;
      val = 0;
    }
  
    public int getNext() {
      val += 3;
      return val;
    }
  
    public void reset() {
      start = 0;
      val = 0;
    }
  
    public void setStart(int x) {
      start = x;
      val = x;
    }
  }

  // стр 331