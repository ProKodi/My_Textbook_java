






public class Main{
public 
    static void main(String args[]){

        /*Виды операторов:
            1) Унарные (нужен только один операнд)
            2) Бинарные (нужно два операнда)
            3) Тернарные (нужно три операнда)
        */


        int number_1 = 2; // 010 - в бинарной форме
        int number_2 = 3; // 011 - в бинарной форме


        // Бинарные операторы
        // Операторы сравнения
        // < - меньше
        System.out.printf("number_1 < number_2 = %b\n", number_1 < number_2);

        // > - больше
        System.out.printf("number_1 > number_2 = %b\n", number_1 > number_2);


        // <= - меньше или равно
        System.out.printf("number_1 <= number_2 = %b\n", number_1 <= number_2);

        
        // >= больше или равно
        System.out.printf("number_1 >= number_2 = %b\n", number_1 >= number_2);

        // Операторы равенства
        // == - равно
        System.out.printf("number_1 == number_2 = %b\n", number_1 == number_2);

        // != - не равно
        System.out.printf("number_1 != number_2 = %b\n", number_1 != number_2);
        
        // & - логическое побитовое и/умножение
        System.out.printf("number_1 & number_2 = %d\n",number_1 & number_2); // 010 & 011 = 010 = 2

        // | - логическое побитовое или/сложение
        System.out.printf("number_1 | number_2 = %d\n",number_1 | number_2); // 010 | 011 = 011 = 3

        // ~ - логическое побитовое отрицание (обязательно доводить до формы в которой возможна адресация памяти процессором)
        System.out.printf("~number_1 = %d\n", ~number_1); // ~0000 0010 = 1111 1101 = -3

        // ^ - исключающее побитовое или / XOR (побитовое не равно)
        System.out.printf("number_1 ^ number_2 = %d\n",number_1 ^ number_2); // 010 ^ 011 = 001 = 1

        boolean flag_1 = false;
        boolean flag_2 = true;

        // && - логическое и 
        System.out.printf("flag_1 and flag_2 = %b\n",flag_1 && flag_2);

        // || - логическое или 
        System.out.printf("flag_1 or flag_2 = %b\n",flag_1 || flag_2);

        // ! - логическое не (лог отрицание\инверсия) 
        System.out.printf("not flag_1 = %b\n", !flag_1);

    }
}


