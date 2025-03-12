package Lesson.Chapter_8;

// стр 326

// class ByTwos implements Series { // Реализация интерфейса Series
//     int start;
//     int val;

//     ByTwos() {
//         start = 0;
//         val = 0;
//     }

//     public int getNext() {
//         val += 2;
//         return val;
//     }

//     public void reset() {
//         start = 0;
//         val = 0;
//     }

//     public void setStart(int x){
//         start = x;
//         val = x;
//     }
// }

/*
 * Обратите внимание на то, что методы getNext ( ) , reset () и setStart ()
объявлены открытыми. Это нужно сделать непременно, поскольку любой метод
интерфейса неявно считается открытым для доступа. Ниже приведен пример
программы, демонстрирующий применение класса ByTwos. (SeriesDemo)
 */


 // стр 328
 // Реализация интерфейса Series и добавление метода getPrevious()
// class ByTwos  implements Series  {
//     int start;
//     int val;
//     int prev;

//     ByTwos()  {
//         start = 0;
//         val = 0;
//         prev = -2;
//     }

//     public int getNext()  {
//         prev = val;
//         val += 2;
//         return val;
//     }

//     public void reset ()  {
//         start = 0;
//         val = 0;
//         prev = -2;
//     }

//     public void setStart(int x)  {
//         start = x;
//         val = x;
//         prev = x - 2;
//     }

//     int getPrevious(){ // добавление метода, который не определен в интерфейсе
//         return prev;
//     }
// }

/*
 * стр 329
 * 
 * Обратите внимание на то, что для добавления метода getPrevious () при­
шлось изменить реализацию методов, объявленных в интерфейсе S e ries. Но
сам интерфейс не претерпел никаких изменений. Эти изменения не видны за
пределами класса и не влияют на его использование. В этом и состоит одно из
преимуществ интерфейсов.
 */

 //стр 331
 // Использование интерфейсных ссылок
 class ByTwos implements Series {

    int start;
    int val;
  
    ByTwos() {
      start = 0;
      val = 0;
    }
  
    public int getNext() {
      val += 2;
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