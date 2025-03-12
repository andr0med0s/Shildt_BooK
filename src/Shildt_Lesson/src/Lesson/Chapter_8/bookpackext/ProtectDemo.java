// Пример использования модификатора protected
//стр 321


/*
321 Java: руководство для начинающих, 7-е издание

 * После этого создадим подкласс ExtBook класса Book, а также класс РгоtectDemo,
в котором будет использоваться класс ExtBook. В классе ExtBook содержится поле,
предназначенное для хранения названия издательства, а также несколько методов 
доступа. Оба класса принадлежат к пакету bookpackext.
Их исходный код приведен ниже
*/

package Lesson.Chapter_8.bookpackext;

class ExtBook extends Lesson.Chapter_8.bookpack.Book {
    private String publisher;

    public ExtBook(String t, String a, int d, String p) {
        super(t, a, d);
        publisher = p;
    }

    public void show() {
        super.show();
        System.out.println(publisher);
        System.out.println() ;
    }

    public String getPublisher() { return publisher; }
    public void setPublisher(String p) { publisher = p; }

    // Следующие инструкции допустимы, поскольку подклассы имеют
    // право доступа к членам класса, объявленным защищенными

    public String getTitle() { return title; }
    public void setTitle (String t) { title = t; }
    public String getAuthor () { return author; } 
    public void setAuthor (String a) { author = a; }
    public int getPubDate() { return pubDate; }      // Доступ r челенам класса Book
    public void setPubDate(int d) { pubDate = d; }   // разрешен для подклассов
}

public class ProtectDemo {
    public static void main(String args[]) {
        ExtBook books[] = new ExtBook[5];

        books[0] = new ExtBook("Java: руководство для начинающих, 7-е издание", "Герберт Шилдт", 2018, "Вильямс");
        books[1] = new ExtBook("Java: полное руководство, 10-е издание", "Герберт Шилдт", 2018, "Вильямс"); 
        books[2] = new ExtBook("Искусство программирования на Java", "Герберт Шилдт", 2003, "Диалектика");
        books[3] = new ExtBook("Красный шторм поднимается", "Том Клэнси", 2006, "Эксмо");
        books[4] = new ExtBook("В дороге", "Джек Керуак", 2012, "Азбука");

        for(int i=0; i < books.length; i++) books[i].show();

        // Поиск книг по автору
        System.out.println("Все книги Герберта Шилдта.");
        for(int i=0; i < books.length; i++)
            if(books[i].getAuthor() == "Герберт Шилдт")
                System.out.println(books[i].getTitle() ) ;
        //books[0].title = "test title"; // Ошибка: доступ запрещен!
        //Доступ к защищенным полям класса Book возможен только из его подклассов
    }
}

//стр 322

/*
 * 
 * Обратите внимание на код класса ExtBook. В связи с тем что класс ExtBook
является подклассом, производным от класса Book, он имеет доступ к защи­
щенным членам класса Book. Это правило действует, несмотря на то что класс
ExtBook находится в другом пакете. Следовательно, он может обращаться не­
посредственно к переменным экземпляра title, author и pubDate, что и
было использовано при написании методов доступа. В то же время доступ к
этим переменным экземпляра из класса ProtectDemo запрещен, поскольку
класс ProtectDemo не является подклассом, производным от класса Book. Так,
если удалить комментарии в приведенной ниже строке кода, то программа не
будет скомпилирована.
// books[0].title = "test title"; // Ошибка: доступ запрещен!
 */