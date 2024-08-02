






public class Main{
public 
    static void main(String args[]){
        // Создание экземпляра класса My_class
        My_class new_class = new My_class();

        // Обращение к публичным методам класса
        new_class.fun();
        // За классом мы можем использовать только public методы

        /*
        cout << "\nРабота с указателями\n\n";

        // Обращение к методам через указатель
        My_class* ptr_class = &new_class; // Создание указателя на new_class
        // Обращение к публичным методам класса через указатель
        ptr_class -> fun();
        ptr_class -> print_inform();
         */
    }
}


class My_class{
private
    /* Создание инкапсулированных атрибутов
    Данные атрибуты могут использоватся только в классе
    */
    int super_number = 25;
    void pri_fun(){
        System.out.println("Вызов функции pub_fun"); 
    }

protected
    /* Создание защищеных атрибутов
    Данные атрибуты могут использоватся только в классе или в классах производным от данного.
    */
    int s_number = 20; 
    void pro_fun(){
        System.out.println("Вызов функции pro_fun"); 
    }

public
    /* Создание публичных атрибутов
    Данные атрибуты доступны в любой части программы
    */
    int number = 15;
    void fun(){
        /*В методе мы можем обращатся к любым атрибутам*/
        /* this - данная штука ссылается на действующий объект класса
        this.super_number- данная штука запрашивает атрибут у действующего объекта класса
        this обязателен при задании значения атрибутам класса
        Также с помощью this  можно вернуть текущий объект класса
            return this
        */
        this.super_number = 25;
        this.s_number = 20;
        this.number = 10;
        System.out.printf("super_number: %d, s_number: %d, number: %d\n", this.super_number, this.s_number, this.number); 
        // Вызов методов класса
        pro_fun();
        pri_fun();
    }


};
