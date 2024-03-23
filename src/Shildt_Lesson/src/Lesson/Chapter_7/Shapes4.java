// package Lesson.Chapter_7;

// /*
// Использование ключевого слова super
// для вызова конструктора суперкласса

// Для вызова конструктора суперкласса из подкласса используется следующий общий синтаксис ключевого слова super:
// super ( список_параметров) ;
// где список_параметровопределяет параметры, используемые конструктором суперкласса. Вызов конструктора super ()  всегда должен быть первой инструкцией в теле конструктора подкласса. Проиллюстрируем использование вызова super ()  на примере  приведенной ниже программы,  включающей видоизмененную версию класса TwoDShape, в которой определен конструктор, инициализирующий переменные экземпляра width и height. */

// // Добавление конструкторов в класс TwoDShape

// class TwoDShape {

//   private double width; // теперь эти переменные
//   private double height; // объявлены как закрытые

//   //Параметризированный конструктор
//   TwoDShape(double w, double h) { // конструктор класса TwoDShape
//     width = w;
//     height = h;
//   }

//   // Методы доступа к переменным экземпляра width и height
//   double getWidth() {
//     return width;
//   }

//   double getHeight() {
//     return height;
//   }

//   void setWidth(double w) {
//     width = w;
//   }

//   void setHeight(double h) {
//     height = h;
//   }

//   void showDim() {
//     System.out.println("Ширина и высота - " + width + " и " + height);
//   }
// }

// // Подкласс для представления треугольников,
// // производный от класса TwoDShape

// class Triangle extends TwoDShape {

//   private String style;

//   // Конструктор
//   Triangle(String s, double w, double h) {
//     super(w, h); // вызов конструктора суперкласса
//     //Использование оператора super() для вызова конструктора класса TwoDShape
//     style = s;
//   }

//   double area() {
//     return getWidth() * getHeight() / 2;
//   }

//   void showStyle() {
//     System.out.println("Треугольник " + style);
//   }
// }

// public class Shapes4 {

//   public static void main(String[] args) {
//     Triangle t1 = new Triangle("закрашенный", 4.0, 4.0);
//     Triangle t2 = new Triangle("контурный", 8.0, 12.0);

//     System.out.println("Информация о t1:  ");
//     t1.showStyle();
//     t1.showDim();
//     System.out.println("Площадь  -  " + t1.area());
//     System.out.println();
//     System.out.println("Информация о t2:  ");
//     t2.showStyle();
//     t2.showDim();
//     System.out.println("Площадь  -  " + t2.area());
//   }
// }
// /*
// В конструкторе Triangle осуществляется вызов конструктора super ()  с параметрами w и h. Это приводит к тому, что управление получает конструктор TwoDShape (), инициализирующий переменные width и height данными значениями, благодаря чему класс Triangle не должен самостоятельно инициализировать элементы суперкласса.  Ему остается инициализировать только собственную переменную экземпляра style. Конструктору TwoDShape ()  предоставляется возможность создать соответствующий объект так, как требуется для данного класса.  Более того, в суперклассе TwoDShape можно реализовать функции, о которых подклассам ничего не будет известно.  Благодаря этому повышается степень отказоустойчивости кода
//  */
