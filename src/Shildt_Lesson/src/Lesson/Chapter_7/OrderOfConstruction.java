// package Lesson.Chapter_7;

// /*
//  * стр 286
//  * Очередность вызова конструкторов После прочтения материала, посвященного наследованию и иерархии классов, у читателей может возникнуть вопрос, когда именно создается объект подкласса и какой именно конструктор выполняется первым: тот, который определен в подклассе, или тот, который определен в суперклассе? Например, если имеется суперкласс А и подкласс В, то что будет вызываться раньше: конструктор класса А или конструктор класса в? Ответ на этот вопрос заключается в том,что в иерархии классов конструкторы вызываются в порядке наследования, начиная с суперкласса и заканчивая подклассом. Более того, метод super()  должен быть первой инструкцией в конструкторе подкласса, и поэтому порядок, в котором вызываются конструкторы, остается неизменным, независимо от того, используется ли вызов метода super()  или нет.  Если вызов метода super() отсутствует, то выполняется конструктор каждого суперкласса по умолчанию (т.е. конструктор без параметров). Порядок вызова конструкторов демонстрируется на примере следующей программы.
//  */

// // Демонстрация очередности вызова конструкторов

// //Создание супер класса
// class A {

//   A() {
//     System.out.println("Конструктор A");
//   }
// }

// // Создание подкласса в результате расширения класса А
// class B extends A {

//   B() {
//     System.out.println("Конструктор B");
//   }
// }

// // Создание подкласса в результате расширения класса В
// class С extends B {

//     С() {
//     System.out.println("Конструктор C");
//   }
// }

// public class OrderOfConstruction {
    
//     public static void main(String[] args) {
//       С c = new С();
//     }
// }

// /*
//  * Как видите, конструкторы вызываются в порядке наследования классов.Если вникнуть в суть вопроса, то можно прийти к выводу, что вызов конструкторов в порядке наследования классов имеет определенный смысл.  Ведь суперклассу ничего не известно ни об одном из производных от него подклассов, и поэтому любая инициализация, которая требуется его членам, не только должна осуществляться независимо от инициализации членов подкласса, но и, возможно, является необходимой подготовительной операцией, требуемой для выполнения этого процесса. Следовательно, она будет выполняться первой.

// */
 