




public class Main{
public 
    static void main(String args[]){
        int a = 65;
        /*Как делать преобразование типов
            1) ("тип данных который мы хотим получить")"переменная";
        */
        System.out.println((float)a);
        System.out.println((char)a);
        // При присваивании переменной малого размера переменной большего значения, обязательно нужно пользоватся явными преобразованиями
        byte b = (byte)a;
    }
}


