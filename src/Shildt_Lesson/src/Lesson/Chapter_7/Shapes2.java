// package Lesson.Chapter_7;

// /*
//  * стр 270
//  * Java: руководство для начинающих, 7-е издание
//  *
//  * Наследование и доступ к членам класса
//  *
//  * Как отмечалось в главе 6, с целью исключения несанкционированного доступа к членам класса их часто объявляют как закрытые,  используя для этого модификатор доступа private. Наследование класса не отменяет ограничений, налагаемых на доступ к закрытым членам класса. Поэтому, несмотря на то что в подкласс автоматически включаются все члены его суперкласса, доступ к закрытым членам суперкласса ему запрещен. Так, если переменные экземпляра width и height в классе TwoDShape объявить как закрытые (см.  ниже), это предотвратит возможность доступа к ним из класса Triangle.
//  */

// /*
// // Закрытые члены класса не наследуются
// // Этот код не пройдет компиляцию
// // Класс,  описывающий двумерные объекты

// class TwoDShape {

//   private double width; // теперь эти переменные
//   private double height; // объявлены как закрытые

//   void showDim() {
//     System.out.println("Ширина и высота - " + width + " и " + height);
//   }
// }

// // Подкласс для представления треугольников,
// // производный от класса TwoDShape

// class Triangle extends TwoDShape {

//   String style;

//   double area() {
//     return width * height / 2; // Ошибка доступ запрещен!
//     //Доступ к челенам суперкласса, объявленным как закрытые, невозможен
//   }

//   void showStyle() {
//     System.out.println("Треугольник " + style);
//   }
// }

//   Класс Triangle не сможет быть скомпилирован, поскольку ссылки на переменные width и height в методе area ()  нарушают правила доступа. Эти переменные объявлены закрытыми (private), поэтому они доступны только членам собственного класса. Для подклассов доступ к ним невозможен.Помните о том, что член класса, объявленный как закрытый, недоступен за пределами своего класса. Это ограничение распространяется на все подклассы данного класса.На первый взгляд, ограничение на доступ к закрытым членам суперкласса из подкласса кажется неудобным и ведет к невозможности их использования.

//  */

// /*
//  * Однако это вовсе не так.  Как пояснялось в главе 6, для обращения к закрытым членам класса в программах на Java обычно используют специальные методы доступа.  Ниже  в качестве  примера приведены  видоизмененные классы TwoDShape и Triangle, в которых методы доступа применяются для обращения к переменным экземпляра width и height.
//  */

// // Использование методов доступа для установки и
// // получения значений закрытых членов.
// // Класс,  описывающий двумерные объекты
// class TwoDShape {

//   private double width; // теперь эти переменные
//   private double height; // объявлены как закрытые

//   // Методы доступа к закрытым переменным экземпляра width и height
//   double getWidth() { // Методы доступа к закрытым переменным экземпляра width и height
//     return width;
//   }

//   double getHeight() { // Методы доступа к закрытым переменным экземпляра width и height
//     return height;
//   }

//   void setWidth(double w) {
//     width = w;
//   }

//   void setHeight(double h) {
//     height = h;
//   }

//   void showDim() {
//     System.out.println("Ширина и высота -  " + width + " и " + height);
//   }
// }

// // Подкласс для представления треугольников,
// // производный от класса TwoDShape
// class Triangle extends TwoDShape {

//   String style;

//   double area() {
//     return getWidth() * getHeight() / 2; //использование методов доступа,
//     //предоставляемых суперклассом
//   }

//   void showStyle() {
//     System.out.println("Треугольник " + style);
//   }
// }

// class Shapes2 {

//   public static void main(String args[]) {
//     Triangle t1 = new Triangle();
//     Triangle t2 = new Triangle();
//     t1.setWidth(4.0);
//     t1.setHeight(4.0);
//     t1.style = "закрашенный";
//     t2.setWidth(8.0);
//     t2.setHeight(12.0);
//     t2.style = "контурный";
//     System.out.println("Информация о t1:  ");
//     t1.showStyle();
//     t1.showDim();
//     System.out.println("Площадь  -  " + t1.area());
//     System.out.println();
//     System.out.println("Информация о t2:  ");
//     t2.showStyle();
//     t2.showDim();
//     System.out.println("Площадь -  " + t2.area());
//   }
// }
// /*
// В каких случаях переменную экземпляра нужно объявлять закрытой?

//  Не существует четко сформулированных правил, позволяющих принять безошибочное решение по данному вопросу. Следует лишь придерживаться двух общих принципов. Во-первых, если переменная экземпляра используется только методами, определенными в классе, то она должна быть закрытой. И во-вторых, если значение переменной экземпляра не должно выходить за определенные границы, ее следует объявить как закрытую, а обращение к ней выполнять с помощью специальных методов доступа. Подобным образом можно предотвратить присваивание недопустимых значений переменной. 
//  */