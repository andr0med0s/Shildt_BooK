package Shildt_Lesson.src.Exercise.Chapter_1;
// стр 51
// Упражнение 1.1
//----Преобразование галлонов в литры---
 class GalToLit {
   public static void main(String[] args) {
        double gallons; 
        double liters;

        gallons = 10;
        liters = gallons * 3.7854; // перевод в литры
        
        System.out.println(gallons + " галлонам соответствует " + liters + " литра");
    }
}
