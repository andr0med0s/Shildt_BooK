 // Данный класс принадлежит пакету bookpackext

 // стр 320

package Lesson.Chapter_8.bookpackext;
// Использование класса Book из пакета bookpack
public class UseBook {
    public static void main(String[] args) {
        Lesson.Chapter_8.bookpack.Book books[] = new Lesson.Chapter_8.bookpack.Book[5]; // Перед именем класса Book указывается имя пакета bookpack
        books[0] = new Lesson.Chapter_8.bookpack.Book("Java: руководство для начинающих, 7-е издание", "Герберт Шилдт", 2018);
        books[1] = new Lesson.Chapter_8.bookpack.Book("Java: полное руководство, 10-е издание", "Герберт Шилдт", 2018);
        books[2] = new Lesson.Chapter_8.bookpack.Book("Искусство программирования на Java", "Герберт Шилдт", 2003);
        books[3] = new Lesson.Chapter_8.bookpack.Book("Красный шторм поднимается", "Том Клэнси", 2006);
        books[4] = new Lesson.Chapter_8.bookpack.Book("В дороге", "Джек Керуак", 2012);
    
        for(int i=0; i < books.length; i++) books[i].show();
    }
}

/*
 * Обратите внимание на то, что при каждом обращении к классу Book перед
ним указывается имя пакета bookpack. Если бы здесь не использовалось пол­
ное имя, то при компиляции класса UseBook класс Book не был бы найден.
 */