package Exercise.Chapter_8.interfaces2;
// Интерфейс для очереди символов
public interface ICharQ  {
    // Помещение символа в очередь
    void put(char ch);
    // Извлечение символа из очереди
    char get ();
    // Reset
    char reset();

    static void copyQueue(ICharQ q1, ICharQ q3) {


        

    }

}
/*
 * этот интерфейс чрезвычайно прост: в нем объявлены только
два метода, которые должны быть определены в любом классе, реализую­
щем интерфейс ICharQ.
*/

