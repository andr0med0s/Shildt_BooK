// package Lesson.Chapter_7;

// /*
//  * Конструкторы и наследование
//  * 
//  * В  иерархии  классов допускается, чтобы  суперклассы  и  подклассы  имели собственные конструкторы.  В связи с этим  возникает вопрос,  какой  именно конструктор отвечает за создание объекта подкласса: конструктор суперкласса, конструктор подкласса или же оба одновременно? На этот вопрос можно ответить так: конструктор суперкласса используется для построения родительской части объекта, а конструктор подкласса — для остальной его части.  И  в этом есть своя логика, поскольку суперклассу неизвестны и недоступны любые собственные члены подкласса, а значит, каждая из указанных частей объекта должна конструироваться по отдельности. В приведенных выше примерах этот вопрос не возникал, поскольку они базировались на автоматически создаваемых конструкторах,  используемых по умолчанию.  Но на практике в большинстве случаев конструкторы следует определять явным образом.
//  * 
//  * Если  конструктор определен только в подклассе, то все происходит очень просто:  конструируется объект подкласса, а родительская часть объекта автоматически создается конструктором суперкласса, используемым по умолчанию.

//  В качестве примера рассмотрим приведенный ниже переработанный  вариант класса Triangle,  в котором определяется собственный  конструктор,  вследствие чего члену style этого класса придается статус закрытого.
//  */

// // Добавление конструктора в класс Triangle
// // Класс,  описывающий двумерные объекты

// class TwoDShape {

//   private double width; // теперь эти переменные
//   private double height; // объявлены как закрытые

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
//     setWidth(w);
//     setHeight(h); // Инициализация части объекта, соответсвующей классу TwoDshape

//     style = s;
//   }

//   double area() {
//     return getWidth() * getHeight() / 2;
//   }

//   void showStyle() {
//     System.out.println("Треугольник " + style);
//   }
// }

// public class Shapes3 {

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
//  * В данном случае конструктор класса Triangle инициализирует собственное поле style и унаследованные члены класса TwoDClass.Если конструкторы объявлены как в подклассе, так и в суперклассе, то все немного усложняется,  поскольку в этом случае  будут  выполняться оба конструктора. При этом на помощь приходит ключевое слово super, которое может применяться в двух общих формах. Первая форма используется для вызова конструктора суперкласса, а вторая — для доступа к членам суперкласса, скрытых членами подкласса.  Рассмотрим первое из указанных применений ключевого слова super
//  */
