// /*Глава 8. Пакеты и интерфейсы 315

//  * Простой пример применения пакета
//  * С учетом всего вышесказанного напишем небольшую программу,
//  * использующую пакет, а затем запустим ее на выполнение. 
//  * Эта программа предназначена для создания 
//  * простой базы данных книг. Классы этой программы будут
//  * содержаться в пакете booкраск.
//  * 
//  */
// // Простая программа, демонстрирующая применение пакетов
// package Lesson.Chapter_8.bookpack; // Этот файл является частьюпакета bookpack

//  class Book { // Таким образом, класс Book является частью пакета bookpack

//     private  String title;
//     private String author;
//     private int pubDate;

//    Book(String t, String a, int d) {
//     title = t;
//     author = a;
//     pubDate = d;
//   }

//    void show() {
//     System.out.println(title);
//     System.out.println(author);
//     System.out.println(pubDate);
//     System.out.println();
//   }
// }
// /**
//  * BookDemo
// */ 
// class BookDemo {  //Этот класс также входит в пакет bookpack

//     public static void main(String[] args) {
//         Book books[] = new Book[5];

//         books[0] = new Book("Java: руководство для начинающих, 7-е издание", "Герберт Шилдт", 2018);
//         books[1] = new Book("Java: полное руководство, 10-е издание", "Герберт Шилдт", 2018);
//         books[2] = new Book("Искусство программирование на Java", "Герберт Шилдт", 2005);
//         books[3] = new Book("Красный шторм поднимается", "Том Клэнси", 2006);
//         books[4] = new Book("В дороге", "Джек Керуак", 2012);

//         for(int i=0; i<books.length; i++)books[i].show();
//     }
// }


// Простая программа, демонстрирующая применение пакетов
package Lesson.Chapter_8.bookpack; // Этот файл является частью пакета bookpack

public class Book { //  Теперь  конструктор стал открытым

// При объявлении этих переменных использован
// модификатор доступа protected
  protected String title;
  protected String author;
  protected int pubDate;

  protected Book(String t, String a, int d) {
    title = t;
    author = a;
    pubDate = d;
  }

  public void show() { // Теперь метод стал открытым
    System.out.println(title);
    System.out.println(author);
    System.out.println(pubDate);
    System.out.println();
  }
}

class BookDemo {  //Этот класс также входит в пакет bookpack

    public static void main(String[] args) {
        Book books[] = new Book[5];

        books[0] = new Book("Java: руководство для начинающих, 7-е издание", "Герберт Шилдт", 2018);
        books[1] = new Book("Java: полное руководство, 10-е издание", "Герберт Шилдт", 2018);
        books[2] = new Book("Искусство программирование на Java", "Герберт Шилдт", 2005);
        books[3] = new Book("Красный шторм поднимается", "Том Клэнси", 2006);
        books[4] = new Book("В дороге", "Джек Керуак", 2012);

        for(int i=0; i<books.length; i++)books[i].show();
    }
}


