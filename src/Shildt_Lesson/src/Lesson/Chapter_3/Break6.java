package Lesson.Chapter_3;
// стр 131
// Расположение метки имеет большое значение
class Break6 {
    public static void main(String[] args) {
        int x = 0, y = 0;
        // Здесь метка распологается перед циклом for
        stop1: for (x = 0; x < 5; x++) {
            for (y = 0; y < 5; y++) {
                if (y == 2)
                    break stop1;
                System.out.println("x и y: " + x + " " + y);
            }
        }

        System.out.println();

        // А тут метка распологается непосредственно перед открывающей фигурной скобкой
        for (x = 0; x < 5; x++)
            stop2: {
                for (y = 0; y < 5; y++) {
                    if (y == 2)
                        break stop2;
                    System.out.println("x и y: " + x + " " + y);
                }
            }

    }
}
/*
В этой программе наборы вложенных циклов идентичны, за исключением того, что в первом наборе метка находится перед внешним циклом for. В та­ком случае при выполнении инструкции break управление передается в конец всего блока цикла for, а оставшиеся итерации внешнего цикла пропускают­ся. Во втором наборе метка находится перед открывающей фигурной скобкой
блока кода, определяющего тело внешнего цикла. Поэтому при выполнении инструкции break stop2 управление передается в конец тела внешнего цикла
for, и далее выполняется очередной его шаг.
*/ 