package Exercise.Chapter_3;
// использование цикла for для создания геометрической прогрессии
 class Progress {
    public static void main(String[] args) {
        
        for(int i = 1; i < 100; i += i) 
            System.out.print(i + " ");

    }
}
