package Lesson.Chapter_7;

// стр 295
/*
 * Поддержка полиморфизма
 * в переопределяемых методах
 *
 * Несмотря на то что приведенные выше примеры позволили продемонстрировать специфику использования переопределенных методов, этого недостаточно для того,  чтобы  можно было в  полной  мере  оценить,  какие  широкие возможности  обеспечиваются данным  механизмом. Действительно,  если бы переопределение методов представляло собой не более чем некий свод соглашений относительно использования пространств имен, то все, о чем говорилось выше, можно было бы считать хотя и заслуживающей интереса, но малополезной  с точки зрения практики  особенностью языка программирования. Однако это далеко не так.  Механизм переопределения методов лежит в основе одного из наиболее эффективных языковых средств Java — динамической диспетчеризации методов, обеспечивающей возможность поиска подходящей версии переопределенного метода во время выполнения программы (а не во время ее компиляции).
 *
 * Вспомним очень важный принцип: ссылочная переменная суперкласса может ссылаться на объект подкласса. В Java этот принцип используется для вызова переопределяемых методов во время выполнения.  Если вызов переопределенного метода осуществляется с использованием ссылки на суперкласс, то исполняющая среда Java выбирает нужную версию метода на основании типа объекта, на который эта ссылка указывает в момент вызова. Ссылкам на различные типы объектов будут соответствовать вызовы различных версий переопределенного метода. Иными словами, на этапе выполнения программы версияпереопределенного метода  выбирается  в зависимости  от  типа  объекта  ссылки(а не типа ссылочной переменной). Следовательно, если суперкласс содержит метод,  переопределенный  в подклассе, то будет вызываться  метод,  соответствующий тому объекту, на который указывает ссылочная переменная суперкласса.
 *
 * Ниже приведен простой пример, демонстрирующий использование динамической диспетчеризации вызовов методов.
 */

// Демонстрация динамической диспетчеризации методов
class Sup {

  void who() {
    System.out.println("who () в Sup");
  }
}

class Sub1 extends Sup {

  void who() {
    System.out.println("who () в Sub1");
  }
}

class Sub2 extends Sup {

  void who() {
    System.out.println("who () в Sub2");
  }
}

public class DynDispDemo {

  public static void main(String[] args) {
    Sup superOb = new Sup();
    Sub1 subOb1 = new Sub1();
    Sub2 subOb2 = new Sub2();

    Sup supRef;

    supRef = superOb;
    supRef.who(); //---------
    /*
    В каждом из этих вызовов
    выбор версии метода who()
    осуществляется по типу объекта,
    на который указывает ссылка 
    во время выполнения
    */
    supRef = subOb1;     
    supRef.who();//----------
  /*
    В каждом из этих вызовов
    выбор версии метода who()
    осуществляется по типу объекта,
    на который указывает ссылка 
    во время выполнения
    */
    supRef = subOb2;
    supRef.who();//----------
      /*
    В каждом из этих вызовов
    выбор версии метода who()
    осуществляется по типу объекта,
    на который указывает ссылка 
    во время выполнения
    */
  }
}

/*
 * В данном примере программы определяются суперкласс Sup и два его подкласса: Subl и Sub2.
 *  В классе Sup объявляется метод who (),  переопределяемый в подклассах, а в методе main ()
 *  создаются объекты типа Sup, Subl и Sub2.Там же объявляется переменная supRef, ссылающаяся 
 * на объект типа Sup. Затем переменной supRef в методе main () поочередно присваиваются ссылки 
 * на объекты разного типа, и далее эти ссылки используются для вызова метода who (). 
 * Как следует из результата выполнения данной программы, вызываемая версия метода who ()  
 * определяется типом объекта, на который указывает переменная supRef в момент вызова, 
 * а не типом самой переменной.
 */

/*
 * 
 * Для чего нужны переопределяемые методы
 * Как упоминалось выше, переопределяемые методы обеспечивают поддержку полиморфизма времени выполнения.
 *  Большое значение полиморфизма в объектно-ориентированных программах обусловлено тем, что благодаря 
 * ему можно объявлять в суперклассе методы, общие для всех его подклассов, а в самих подклассах определять 
 * конкретные реализации всех этих методов или некоторых из них. Переопределение методов — один из способов,
 *  которыми в Java реализуется принцип полиморфизма “один интерфейс — множество методов”.
 * Залогом успешного применения полиморфизма является, в частности, понимание того, что суперклассы и подклассы
 *  образуют иерархию по степени увеличения специализации.  При продуманной организации суперкласса
 *  он предоставляет своему подклассу все элементы, которыми тот может пользоваться непосредственно. 
 *  В нем также определяются те методы, которые должны быть по-своему реализованы в производных классах. 
 * Таким образом, подклассы получают достаточную свободу в определении собственных методов, 
 * реализуя в то же время согласованный интерфейс. Сочетая наследование с переопределением методов, 
 * в суперклассе можно определить общую форму методов для использования во всех его подклассах.
 * 
 * 
 * Глава 7. Наследование 297
 */