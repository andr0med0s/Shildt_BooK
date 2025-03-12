package Exercise.Chapter_8.interfaces;

//стр 332 Упражнение 8.1
// Интерфейс для очереди символов
public interface ICharQ  {
    // Помещение символа в очередь
    void put(char ch);
    // Извлечение символа из очереди
    char get ();

    
    
    // Reset
    char reset();

   
    // static void copyQueue(ICharQ q1, ICharQ b) {

    //     // char ch;
    //     // char ch2;
        
    //     // int i2;

    //     // for(i2=0; i2 < 15; i2++) {            // постепенно, поодному
    //     //     ch = q1.get();                 //  5 раз вытаскивать с полной очереди q1
    //     //     System.out.print(ch);      //  и
    //     //     b.put(ch);  
    //     //                         //  5 раз вставлять в пустую очередь q2
    //     //     System.out.print("DynQueue b HAVE"+ ch2);
    //     // }
    // }
}
/*
 * этот интерфейс чрезвычайно прост: в нем объявлены только
два метода, которые должны быть определены в любом классе, реализую­
щем интерфейс ICharQ.
*/

