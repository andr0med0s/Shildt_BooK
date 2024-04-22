// package Lesson.Chapter_7;

// //Глава 7. Наследование 289
// /*
//  * Один из самых важных моментов для присваивания ссылок на объекты подкласса переменным с типом суперкласса наступает тогда, когда конструкторы вызываются в иерархии классов.  Как вам уже должно быть известно, в классе зачастую определяется конструктор, получающий объект собственного класса в качестве параметра. Благодаря этому в классе может быть создана копия объекта. Этой особенностью можно воспользоваться в подклассах, производных от такого класса. В качестве примера рассмотрим описанные ниже версии классов TwoDShape и Triangle. В оба класса добавлены конструкторы, получающие объект своего класса в качестве параметра.
//  */

// class TwoDShape {

//   private double width;
//   private double height;
  
//   // Конструктор по умолчанию
//   TwoDShape() {
//     width = height = 0.0;
//   }

//   // Параметризированный конструктор
//   TwoDShape(double w, double h) {
//     width = w;
//     height = h;
//   }

//   // Создание объекта с одинаковыми значениями
//   // переменных экземпляра width и height
//   TwoDShape(double х) {
//     width = height = х;
//   }

// // Создание одного объекта на основе другого
// TwoDShape (TwoDShape ob) { //Конструирование объекта на основе другого объекта
//     width = ob.width;
//     height = ob.height;
// }

//     // Методы доступа к переменным экземпляра width и height
//     double getWidth()  {return width;}    
//     double getHeight() {  return height;  }
//     void setWidth(double w)  {  width = w;  }
//     void setHeight(double h)  {  height = h;  }


//     void showDim()  {System.out.println("Ширина и высота - "  + width +  " и "  + height);}
// }
//     // Подкласс,  применяемый для представления треугольников
//     //и производный от класса TwoDShape
//     class

// Triangle extends TwoDShape  {
//         private String style;
//         // Конструктор по умолчанию
//         Triangle()  {
//             super();
//             style = "none";
//         }

//         // Конструктор класса Triangle
//         Triangle(String s,  double w,  double h)  {
//             super(w,  h);  // вызов конструктора суперкласса
//             style = s;
//         }
//         // Конструктор с одним аргументом для построения треугольника
//         Triangle(double х)  {
//             super(х);  // вызов конструктора суперкласса
//             style = "закрашенный";
//         }
//         // Создание одного объекта на основе другого 
//         Triangle(Triangle ob)  {
//             super(ob);  // передача объекта конструктору класса TwoDShape
//             style = ob.style;
//         }

//         double area()  {
//             return getWidth()  * getHeight() / 2;
//         }
//         void showStyle()  {System.out.println("Треугольник " + style);
//         }
//     }


// public class Shapes7 {
//     public static void main(String args[])  {
//         Triangle t1 = new Triangle("контурный",  8.0,  12.0);
//         // создать  копию объекта tl
//         Triangle t2 = new Triangle(t1);
//         System.out.println("Информация о tl:  ");
//         t1.showStyle();
//         t1.showDim();
//         System. out .println ( "Площадь  -  "  + t1.area());
//         System.out.println();System.out.println("Информация о t2:  ");
//         t2.showStyle();t2.showDim();
//         System.out.println("Площадь  -  "  + t2.area());
//     }

// }