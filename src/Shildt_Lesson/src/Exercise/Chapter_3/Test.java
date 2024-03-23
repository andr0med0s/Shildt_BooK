package Exercise.Chapter_3;

 class Test {
    public static void main(String[] args) {
         for(int i = 0; i<10; i++) {
             System.out.print(i + " ");
             if((i%2) == 0) continue; // если деление по модулю true то continue
             System.out.println() ;
             }
    }
}
