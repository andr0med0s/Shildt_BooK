package Exercise;

public class My_WeightOnTheMoon {
    public static void main(String[] args) {
        double my_weight = 60;
        double moon_gravity = 17;   // Сила притяжения на Луне
        double earth_gravity = 100; // Сила притяжение на Земле
        double my_weightOnTheMoon = my_weight*(moon_gravity/earth_gravity);
        
        System.out.println("Мой вес на луне =  " + my_weightOnTheMoon + " кг" );
    }
}
