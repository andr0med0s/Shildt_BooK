package Exercise;

public class InchesToMeters {
    
    public static void main(String[] args) {
        double inches, metrs, foot;
        int counter;
        
        

        counter = 0;
        foot = 12*12;
        for(inches= 1; inches<=foot; inches++){
            metrs = inches / 39.37;
            System.out.println(inches + " дюйму соответствует " + metrs + " метра.");

            counter++;
            if(counter == 12) {
                System.out.println("футов");
                counter = 0; // сбросить счетчик строк
            }

        }
    }
}
 

        // 12 дюймов - 1 фут
        // 1 метр - 39.37 дюймов

        // for (foot=1 ;counter == 12;foot++){
        //     System.out.println("футов" + foot);
        //     counter = 0; // сбросить счетчик строк
        // }