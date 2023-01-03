package Shildt_Lesson.src.Lesson.Chapter_4;
//стр 155

//Простой пример применения параметра в методе

class ChkNum {
    //возврат логического значения true
    //если x содержит четное число
    boolean isEven(int x) { // <-- Здесь x целочисленный параметр метода isEven()
        if ((x % 2) == 0) return true;
        else return false;
    }
}

class ParamDemo {
    public static void main(String[] args) {
        ChkNum e = new ChkNum();

        if (e.isEven(10)) System.out.println("10 - четное число");
        //передача аргуметов методу isEven()
        if (e.isEven(9)) System.out.println("9 - четное число");
        //передача аргуметов методу isEven()
        if (e.isEven(8)) System.out.println("8 - четное число");
        //передача аргуметов методу isEven()
    }

}
