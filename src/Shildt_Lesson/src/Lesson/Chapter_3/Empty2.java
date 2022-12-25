package Shildt_Lesson.src.Lesson.Chapter_3;

//стр 117
// Пропуск отдельных состовляющих в определении цикла for
public class Empty2 {
    public static void main(String[] args) {

        int i;

        i = 0; // Выносим инициализацию за пределы цикла
        for (; i < 10; ) {
            System.out.println("Проход #" + i);
            i++; // Инкрементирование переменной цикла
        }
    }

}

/**
 * Выведение инициализирующей части за пределы цикла обычно дела­ется лишь в том случае, если первоначальное значение управляющей им пере­менной получается в результате сложного процесса, который нецелесообразно
 * вводить в само определение цикла for
 */ 
/*

        for(;;) // этот цикл намеренно сделан бесконечным
        {
        II. . .
        }


*/ 
/*

             бесконечные циклы требуются для решения некоторых задач программирования, на-
            пример при разработке командных процессоров операционных систем, боль-
            шинство так называемых “бесконечных” циклов на самом деле представляют
             собой циклы со специальными требованиями к завершению.

*/

//148 Полное руководство
//части цикла for могут быть пустыми

class ForVar1 {
    public static void main(String[] args) {
        int i;
        boolean done = false;

        i = 0;
        for (; !done; ) {
            System.out.println("i равно " + i);
            if (i==10) done = true;
            i++;
        }
    }
}
/*
Здесь выражения инициализации и итерации вынесены за пределы цик-
ла for. Таким образом, части for пусты. Хотя в настолько простом приме-
ре это не имеет значения (более того, подобный стиль будет считаться до-
вольно плохим), могут возникать ситуации, когда такой подход имеет смысл.
Например, если начальное условие задается с помощью сложного выражения
в другом месте программы или переменная управления циклом изменяется в
зависимости от действий, происходящих в теле цикла, то может быть умест-
но оставить данные части цикла for пустыми.
 */