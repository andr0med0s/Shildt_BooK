package Lesson.Chapter_8;
// стр 327
public class SeriesDemo {
    public static void main(String[] args) {
        ByTwos ob = new ByTwos();

        for(int i=0; i<5; i++)
            System.out.println("Cледующее значение: " + ob.getNext());
        System.out.println("\nСброс");
        ob.reset();

        for(int i=0; i<5; i++)
            System.out.println("Cледующее значение: " + ob.getNext());
        
        System.out.println("\nНачальное значение: 100");
        ob.setStart(100);

        for(int i=0; i<5; i++)
            System.out.println("Cледующее значение: " + ob.getNext());
    }
}

/*
 * Класс, реализующий интерфейс, может содержать дополнительные перемен­
ные и методы, что вполне допустимо. Более того, именно так в большинстве
случаев и поступают те, кто программирует на Java. Например, в приведенную
ниже версию класса ByTwos добавлен метод getPrevious (), возвращающий
предыдущее числовое значение
 */