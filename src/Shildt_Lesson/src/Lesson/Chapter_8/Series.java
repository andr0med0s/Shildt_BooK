package Lesson.Chapter_8;

// Реализация интерфейса Series
public interface Series  {
    int getNext();  // возврат следующего по порядку числа
    void reset();   //  сброс
    void setStart(int х);  // установка начального значения
}

/* 
class ByTwos implements Series { // Реализация интерфейса Series
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

    public void setStart(int x){
        start = x;
        val = x;
    }
}
*/

// Реализация интерфейса Series и добавление метода getPrevious()
class ByTwos  implements Series  {
    int start;
    int val;
    int prev;

    ByTwos()  {
        start = 0;
        val = 0;
        prev = -2;
    }

    public int getNext()  {
        prev = val;
        val += 2;
        return val;
    }

    public void reset ()  {
        start = 0;
        val = 0;
        prev = -2;
    }

    public void setStart(int x)  {
        start = x;
        val = x;
        prev = x - 2;
    }

    int getPrevious(){ // добавление метода, который не определен в интерфейсе
        return prev;
    }
}

class SeriesDemo  {
    public static void main(String args[])  {
        ByTwos ob = new ByTwos();

        for(int i=0;  i < 5;  i++)
        System.out.println("Следующее значение:  "  +ob.getNext());
        System.out.println("\nC6poc");
        ob.reset ();

        for(int i=0;  i < 5;  i++)
        System.out.println("Следующее значение:  "  +ob.getNext());
        System.out.println("\nНачальное значение:  100");
        ob.setStart(100) ;

        for(int i=0;  i < 5;  i++)
        System.out.println("Следующее значение:  "  +ob.getNext());
    }
}