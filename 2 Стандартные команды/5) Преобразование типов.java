




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

        /*Так же в Java можно проверить, является ли объект экземпляром определенного типа
        Для этого нужно использовать следующую конструкцию:
            "обьект который хотим преобразовать" instanceof "название желаемого класса"
        */
        Object kate = new Main();

        System.out.println((kate instanceof Main)); // Вернет true так как kate ссылается на объект типа Main
        System.out.println((kate instanceof String)); // Вернет false так как kate не ссылается на объект типа String
    }
}


