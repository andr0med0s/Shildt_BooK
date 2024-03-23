package Lesson.Chapter_5;

//стр 198
// Знакомство с классом String
class StringDemo {
    public static void main(String[] args) {
// Различные способы объявления строк
        String str1 = new String("В Java строки - это объекты.");
        String str2 = "Их можно создавать разными способами.";
        String str3 = new String(str2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
/*
* boolean equals(str)
  Возвращает логическое значение true, если текущая
  строка содержит ту же последовательность символов, что
* и параметр str
* ------------------------
* int length() Возвращает длину строки
* ----------
* char charAt (index)
* Возвращает символ, занимающий в строке позицию,
  указываемую параметром index
*-------------------------
* int compareTo(str)
Возвращает отрицательное значение, если текущая
* строка меньше строки str, нуль, если эти строки равны,
и положительное значение, если текущая строка больше
строки str
* --------------------------
* int indexOf(str)
* Выполняет в текущей строке поиск подстроки,
определяемой параметром str. Возвращает индекс
первого вхождения подстроки str или -1, если поиск
завершается неудачно
* -----------------------------------
* int lastlndexOf(str)
* Выполняет в текущей строке поиск подстроки,
определяемой параметром str. Возвращает индекс
последнего вхождения подстроки str или -1, если поиск
завершается неудачно
* */


// Некоторые операции над строками стр 199
class Strops {
    public static void main(String[] args) {
        String str1 = "Java - лидер Интернета!";
        String str2 = new String(str1);
        String str3 = "Строки Java эффективны.";
        int result, idx;
        // char ch;

        System.out.println("Длина str1: " + str1.length());

        // Отображение строки str1 посимвольно
        for (int i = 0; i < str1.length(); i++)
            System.out.print(str1.charAt(i));
        System.out.println();
        if (str1.equals(str2)) {
            System.out.println("str1 эквивалентна str2");
        } else {
            System.out.println("str1 не эквивалентна str2");
        }
        if (str1.equals(str3)) {
            System.out.println("str1 эквивалентна str3");
        } else {
            System.out.println("str1 не эквивалентна str3");
        }
        result = str1.compareTo(str3);
        if (result == 0) {
            System.out.println("str1 и str3 равны");
        } else if (result < 0) {
            System.out.println("str1 меньше str3");
        } else {
            System.out.println("str1 больше str3");
        }
        // Присваивание переменной str2 новой строки
        str2 = "One Two Three One";
        idx = str2.indexOf("One");
        System.out.println("Индекс первого вхождения One: " + idx);
        idx = str2.lastIndexOf("One");
        System.out.println("Индекс последнего вхождения One: " + idx);
    }
}
/*
* ! * Метод equals () сравнивает последовательности символов, содержащиеся
*  в двух объектах типа String, и проверяет, совпадают ли они, тогда
   как оператор == позволяет лишь определить, указывают ли две ссылки типа
   String на один и тот же объект.
* */

// стр 200
// Демонстрация использования массивов строк
class StringArrays {
    public static void main(String[] args) {
        String[] strs = {"Эта", "строка", "является", "тестом."};
        System.out.println("Исходный массив: ");
        for (String s : strs)
            System.out.print(s + " ");
        System.out.println("\n");
// Изменение строки
        strs[2] = "также является";
        strs[3] = "тестом!";
        System.out.println("Измененный массив: ");
        for (String s : strs)
            System.out.print(s + " ");
    }
}
//-----------------Объекты типа String неизменяемые-----------------
/*
* В Java имеется класс StringBuffer,
который создает символьные строки, способные изменяться. Так, в дополне-
ние к методу charAt (), возвращающему символ из указанного места в стро-
ке, в классе StringBuffer определен метод setCharAt(), включающий
символ в строку. Но для большинства целей вполне подходит класс String,
так что особой необходимости в использовании класса StringBuffer не
возникает
* */

/*
*  общий синтаксис объявления метода substring():
*  возвращающим новую строку, которая содержит часть вызывающей строки.
*
string substring (int начальный_индекс, int конечный_индекс)
*
* Здесь начальный_индекс обозначает начало извлекаемой подстроки, а
конечный_индекс — ее окончание.
* */

// Применение метода substring() стр 202
class SubStr {
    public static void main(String[] args) {
        String orgstr = "Java - двигатель Интернета.";

        //Сформировать подстроку
        String substr = orgstr.substring(7, 25); //Здесь создается новая строка
        // содержащая нужную подстроку

        System.out.println("orgstr; " + orgstr);
        System.out.println("substr: " + substr);
    }
}

// Использование строк для управления инструкцией switch стр 203

class StringSwitch {
    public static void main(String[] args) {
        String command = "cancel";
        switch (command) {
            case "connect":
                System.out.println("Подключение");
                break;
            case "cancel":
                System.out.println("Отмена");
                break;
            case "disconnect":
                System.out.println("Отключение");
                break;
            default:
                System.out.println("Неверная команда!");
                break;
        }
    }
}

/*
* Возможность использования строк в инструкции switch очень удобна и по-
зволяет сделать код более удобочитаемым. В частности, применение инструк-
ции switch, управляемой строками, является лучшим решением по сравнению
с эквивалентной последовательностью инструкций if-else. Но если учитывать
накладные расходы, то использование строк для управления переключателями
оказывается менее эффективным по сравнению с целочисленными значения-
ми. Поэтому использовать строки для данной цели целесообразно лишь в тех
случаях, когда управляющие данные уже являются строками.
* */

/* стр 204
*
* Использование аргументов командной строки
Теперь, когда вы уже познакомились с классом String, можно пояснить
назначение параметра args метода main() в исходном коде большинства рас-
смотренных ранее примеров программ. Многие программы получают параме-
тры, задаваемые в командной строке. Это так называемые аргументы командной
строки. Они представляют собой данные, указываемые непосредственно после
имени запускаемой программы. Для того чтобы получить доступ к аргументам
командной строки из программы на Java, достаточно обратиться к массиву объ-
ектов типа String, который передается методу main(). Рассмотрим в качестве
примера программу, отображающую параметры командной строки. Ее исход-
ный код приведен ниже.
* */
// Отображение всех данных, указываемых в командной строке
class CLDemo {
    public static void main(String[] args) {
        System.out.println("Программе передано " + args.length +
                " аргумента командной строки.");
        System.out.println("Список аргументов: ");
        for (int i = 0; i < args.length; i++)
            System.out.println("arg[" + i + " ] : " + args[i]);
    }
}
/*
* Допустим, программа CLDemo была запущена из командной строки следую­
щим образом:
*
java CLDemo one two three
*
Тогда результат ее выполнения будет следующим.
Программе передано 3 аргумента командной строки.
*
Список аргументов:
arg[0]: one
arg[1]: two
arg[2]: three
* */


/*чтобы стало понятнее, как пользоваться аргументами командной
строки, рассмотрим следующую программу, которая получает один аргумент,
определяющий имя абонента, а затем выполняет поиск имени в двумерном
массиве строк. Если имя найдено, программа отображает телефонный номер
указанного абонента.
* */

// Простейший автоматизированный телефонный справочник
class Phone {
    public static void main(String[] args) {
        String[][] numbers = {
                {"Tom", "555-3322"},
                {"Mary", "555-8976"},
                {"John", "555-1037"},
                {"Rachel", "555-1400"}
        };
        int i;

        // Для того чтобы воспользоваться программой,
        //ей нужно передать один аргумент командной строки выполнения
        if (args.length != 1) {
            System.out.println("Использование: java Phone <имя>");
        } else {
            for (i = 0; i < numbers.length; i++) {
                if (numbers[i][0].equals(args[0])) {
                    System.out.println(numbers[i][0] + ": " + numbers[i][1]);
                    break;
                }
            }
            if (i == numbers.length) {
                System.out.println("Имя не найдено.");
            }
        }

    }
}

/*
 * стр 207 Полное руководство
 *
 * Исследование класса String
 * */
// Демонстрация работы с объектами String
class StringDemo1 {
    public static void main(String[] args) {
        String strOb1 = "Первая строка";
        String strOb2 = "Вторая строка";
        String strOb3 = strOb1 + " и " + strOb2;
        System.out.println(strOb1);

        System.out.println(strOb2);
        System.out.println(strOb3);
    }
}

// Демонстрация работы нескольких методов класса String.
class StringDemo2 {
    public static void main(String[] args) {
        String strOb1 = "Первая строка";
        String strOb2 = "Вторая строка";
        String strOb3 = strOb1;

        System.out.println("Длина строки strOb1: " + strOb1.length());

        System.out.println("Символ по индексу 3 в строке strOb1: " + strOb1.charAt(3));

        if (strOb1.equals(strOb2))
            System.out.println("Cтpoкa strOb1 равна строке strOb2");
        else
            System.out.println("Cтpoкa strOb1 не равна строке strOb2");
        if (strOb1.equals(strOb3))
            System.out.println("Cтpoкa strOb1 равна строке strObЗ");
        else
            System.out.println("Cтpoкa strOb1 не равна строке strObЗ");
    }
}

// Демонстрация использования массивов String.
class StringDemo4 {
    public static void main(String[] args) {

        String[] str = {"один", "два ", "три"};
        for (int i = 0; i < str.length; i++)
            System.out.println("str[" + i + "]: " + str[i]);
    }
}

//стр 210 полное руководство
// Отображение всех аргументов командной строки.
/*
* Иногда программе при запуске необходимо передать какую-то информа-
цию. Для этого предназначены аргументы командной строки, передаваемые
методу main() . Аргумент командной строки представляет собой данные,
которые следуют непосредственно за именем программы в командной стро-
ке, когда программа запускается. Получить доступ к аргументам командной
строки в программе на Java довольно просто - они хранятся в виде строк
внутри массива типа String, который передается параметру args метода
main(). Первый аргумент командной строки хранится в args[О] , второй - в
args [1] и т.д.
* */
class CommandLine {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++)
            System.out.println("args[" + i + "]: " + args[i]);
    }
}
/*
* Запустите программу как показано ниже:
java CommandLine это всего лишь тест 100 -1
Программа сгенерирует следующий вывод:
args [ О ] : это
args [ l ] : всего
args [ 2 ] : лишь
args [ 3 ] : тест
args [ 4 ] : 100
args [ 5 ] : -1
* */
//--------------Помните!
// Все аргументы командной строки передаются в строковом виде.
// числовые значения придется вручную преобразовывать в их внутренние формы.