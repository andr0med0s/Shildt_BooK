package Shildt_Lesson.src.Lesson.Chapter_3;

//стр 133
//Применение инструкции continue с меткой
public class ContToLabel {
    public static void main(String[] args) {

        outerloop:
        for (int i = 1; i < 10; i++) {
            System.out.println("\nВнешний цикл: проход " + i + ", внутренний цикл: ");
            for ( int j = 1; j< 10; j++){
                if(j == 5) continue outerloop; // продолжение внешнего цикла
                System.out.println(j);
            }
        }
    }
}
 /*
 Как следует из приведенного выше примера, при выполнении инструкции
continue управление передается внешнему циклу, и оставшиеся итерации вну-
треннего цикла пропускаются.
В реальных программах инструкция continue применяется очень редко.
И объясняется это, в частности, богатым набором инструкций циклов в Java,
удовлетворяющих большую часть потребностей в написании прикладных про-
грамм. Но в особых случаях, когда требуется преждевременное прекращение
цикла, инструкция continue позволяет сделать это, не нарушая структуру кода.
  */

//стр 161
// Использование continue с меткой
class ContinueLabel{
    public static void main(String[] args) {
        outer: for(int i = 0; i < 10; i++){
        for(int j = 0; j<10; j++) {
            if (j > i) {
                System.out.println();
                continue outer;
            }
            System.out.print(" " + (i * j));
        }
        }
        System.out.println();
    }
}
/*
Оператор continue в этом примере завершает цикл по j и продолжает со
следующей итерации цикла по i.
 */