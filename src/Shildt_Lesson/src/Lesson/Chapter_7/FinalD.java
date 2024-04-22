package Lesson.Chapter_7;


/**
 * Применение ключевого слова final к переменным экземпляра
 * 
 * Помимо рассмотренных ранее  примеров  использования,  ключевое  слово final 
 * можно применять и  к переменным  экземпляра.  Подобным  способом создаются
 *   именованные  константы.  Если  имени  переменной  предшествует спецификация  
 * final, то значение этой переменной не может быть изменено на протяжении всего 
 * времени выполнения программы. Очевидно, что подобным переменным нужно присваивать 
 * начальные значения.  В главе 6 был рассмотрен простой класс ErrorMsg для обработки
 *  ошибок.  В нем устанавливается соответствие между кодами ошибок и строками сообщений
 *  об ошибках. Ниже  приведен  усовершенствованный  вариант этого  класса,  в  котором
 * для создания именованных констант применяется спецификация final. Теперь, вместо того 
 * чтобы передавать методу getErrorMsg () числовое значение, например  2,  достаточно 
 * указать  при  его  вызове  именованную  целочисленную константу DISKERR
 */

 //Возврат объекта типа String
class ErrorMsg {
    // Коды ошибок
    final int OUTERR = 0; 
    final int INERR = 1; 
    final int DISKERR = 2; 
    final int INDEXERR = 3; 

    String msgs[] = {
        "Ошибка вывода",
        "Ошибка ввода",
        "Выход индекса за границы диапазона"
    };

    // Возврат сообщения об ошибке
    String getErrorMsg(int i) {
        if (i >=0 & i < msgs.length)
        return msgs[i];
        else
        return "Несуществующий код ошибки";
    }
}

public class FinalD {
    public static void main(String[] args) {
        ErrorMsg err = new ErrorMsg();

        System.out.println(err.getErrorMsg(err.OUTERR));
        System.out.println(err.getErrorMsg(err.DISKERR));
    }
}

/*
 * Обратите внимание  на то,  как используются  константы  в методе main ().
 *  Они являются членами класса ErrorMsg, и поэтому для доступа к ним требуется 
 * ссылка на объект этого класса. Разумеется, константы могут быть унаследованы 
 * подклассами и быть непосредственно доступными в них.Многие программисты используют
 *  имена констант типа final, состоящие полностью из прописных букв, как это сделано
 *  в предыдущем примере. Но данное  правило не является строгим и лишь отражает
 *  общепринятый стиль программирования.
 */

 /**
  * 
    Могут ли переменные типа final быть статическими? И можно ли использовать ключевое слово final
    при объявлении локальных переменных и параметров методов?
    
    ОТВЕТ. Да, можно. Объявив константу таким образом, вы сможете обращаться к ней по имени класса,
    не создавая конкретных объектов. Так, если при объявлении констант в классе ErrorMsg
    указать ключевое слово static, то вызов метода println ()  в методе main ()  может быть таким.

    System.out.println(err.getErrorMsg(ErrorMsg.OUTERR));
    System.out.println(err.getErrorMsg(ErrorMsg.DISKERR));
    
    Благодаря объявлению параметра как final предотвращается его изменение в методе. 
    А если объявить локальную переменную как final, то ей нельзя будет присвоить значение больше одного раза.

  */