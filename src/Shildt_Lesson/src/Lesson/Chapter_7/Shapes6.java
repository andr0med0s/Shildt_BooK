package Lesson.Chapter_7;

/*
 * Создание многоуровневой иерархии классов
 * 
 * До сих пор применялись простые иерархии классов, которые состояли только из суперкласса и подкласса. Однако Java позволяет создавать иерархии, состоящие из произвольного количества уровней наследования.  Как уже упоминалось выше, многоуровневая иерархия идеально подходит для использования одного подкласса в качестве суперкласса для другого подкласса. Так, если имеются три  класса, А, В и с, то класс С может наследовать все характеристики
класса в, а тот, в свою очередь, все характеристики класса А. В подобных случаях каждый подкласс наследует характерные особенности всех своих суперклассов. В частности, класс С наследует все члены классов в и А.Для того чтобы стало понятнее назначение многоуровневой иерархии, рассмотрим следующий пример программы, в которой подкласс Triangle выступает в качестве суперкласса для класса ColorTriangle. Класс ColorTriangleнаследует все свойства классов Triangle и TwoDShape, а также включает поле color, задающее цвет треугольника.
 */

// Многоуровневая иерархия
class TwoDShape {

  private double width; // теперь эти переменные
  private double height; // объявлены как закрытые

  //Конструктор,  заданный по умолчанию
  TwoDShape() {
    width = height = 0.0;
  }

  //Параметризированный конструктор
  TwoDShape(double w, double h) { // конструктор класса TwoDShape
    width = w;
    height = h;
  }

  // Создание объекта с одинаковыми значениями
  // переменных экземпляра width и height
  TwoDShape(double х) {
    width = height = х;
  }

  // Методы доступа к переменным экземпляра width и height
  double getWidth() {
    return width;
  }

  double getHeight() {
    return height;
  }

  void setWidth(double w) {
    width = w;
  }

  void setHeight(double h) {
    height = h;
  }

  void showDim() {
    System.out.println("Ширина и высота - " + width + " и " + height);
  }
}

// Подкласс для представления треугольников,
// производный от класса TwoDShape

class Triangle extends TwoDShape {

  private String style;

  // Конструктор по умолчанию
  Triangle() {
    super(); // вызов конструкора суперкласса по умолчанию
    style = "none";
    //Использование метода super() для вызова разных форм конструктора класса TwoDShape
  }

  //  вызов конструктора суперкласса с двумя аргументами
  Triangle(String s, double w, double h) {
    super(w, h); //
    //Использование метода super() для вызова разных форм конструктора класса TwoDShape
    style = s;
  }

  // вызов конструктора суперкласса с одним аргументом
  Triangle(double х) {
    super(х);
    style = "закрашенный";
  }

  double area() {
    return getWidth() * getHeight() / 2;
  }

  void showStyle() {
    System.out.println("Треугольник " + style);
  }
}

//-----------------------

//  Расширение класса Triangle
class ColorTriangle extends Triangle {

  //класс ColorTriangle наследует класс Triangle, производный от класса TwoDShape, и поэтому включает все члены классов Triangle и TwoDShape
  private String color;

  ColorTriangle(String c, String s, double w, double h) {
    super(s, w, h);
    color = c;
  }

  String getColor() {
    return color;
  }

  void showColor() {
    System.out.println("Цвет -  " + color);
  }
}

public class Shapes6 {

  public static void main(String[] args) {
    ColorTriangle t1 = new ColorTriangle("Синий", "контурный", 8.0, 12.0);
    ColorTriangle t2 = new ColorTriangle("Красный", "закрашенный", 2.0, 2.0);

    System.out.println("Информация о tl:  ");
    t1.showStyle();

    t1.showDim();
    t1.showColor();
    System.out.println("Площадь  -  " + t1.area());
    System.out.println();
    System.out.println("Информация о t2:  ");
    t2.showStyle();
    t2.showDim(); // Объект типа ColorTriangle может вызвать как собственные методы, так и методы суперклассов
    t2.showColor();
    System.out.println("Площадь  -  "  + t2.area());
  }
}
/*
 * Благодаря наследованию в классе ColorTriangle можно использовать ранее определенные классы Triangle и TwoDShape, дополняя их лишь полями, необходимыми для конкретного применения класса ColorTriangle. Таким образом, наследование способствует повторному использованию кода.
 * Данный  пример демонстрирует  еще  одну  важную деталь:  вызов  метода super ()  всегда означает обращение к конструктору ближайшего суперкласса. Иными словами, вызов super ()  в классе ColorTriangle означает вызов конструктора класса Triangle, а в классе Triangle — вызов конструктора класса TwoDShape. Если в иерархии классов для конструктора суперкласса предусмотрены параметры, то все подклассы должны передавать их вверх по иерархической структуре. Это правило действует независимо от того, нужны ли параметры самому подклассу.
 */