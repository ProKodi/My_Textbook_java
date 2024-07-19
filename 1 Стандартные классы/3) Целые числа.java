




public class Main{
public 
    static void main(String args[]){
        //byte - 1 байт (Значения: [-128; 127]). Самый наименьший тип данных
        byte number_byte = 100;
        System.out.println(number_byte);

        // Целые числа
        //short - 2 байта (Значения: [-322768; 322767])
        short number_shr = 56; 
        System.out.println(number_shr);

        //int - 4 байт (Значения: [-2147483648; 2147483647])
        int number_int = 34; 
        System.out.println(number_int);

        //long - 8 байт (Значения: [-9223372036854775808 до 9223372036854775807])
        long number_lng_lng = 798;
        System.out.println(number_lng_lng);



        /* Целые числа в двоичной системе счисления
        0b"Число в 2 системе исчесления"}
        */
        int number = 0b1100; // Получение числа из двоичной системы счисления 
        System.out.println(number);
    }
}
