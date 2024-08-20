






public class Main{
public 
    static void main(String args[]){
        // Создание экземпляра класса My_class
        My_class new_class = new My_class();

        // Общение к защищеному полю
        new_class.pro_fun();
        // Общение к полю с модификатором по умолчанию
        new_class.stan_fun();
        // Обращение к публичным методам класса
        new_class.print_inform();
    }
}
    
class My_class{
// Поле приватных атрибутов 
// private
    /* Создание приватных атрибутов
    Данные атрибуты могут использоватся только в классе
    */
private int super_number = 25;
private void pri_fun(){
        System.out.println("Вызов функции pub_fun"); 
    }

        
// Поле защищеных атрибутов
// protected
    /* Создание защищеных атрибутов
    Данные атрибуты могут использоватся только в классе или в классах производным от данного.
    Так же данные атрибуты могут использоватся в текущем пакете (за текущем пакетом доступа к ним нет)
    */
protected int s_number = 20; 
protected void pro_fun(){
        System.out.println("Вызов функции pro_fun"); 
    }

        
// Поле публичных атрибутов
// public
    /* Создание публичных атрибутов
    Данные атрибуты доступны в любой части программы
    */
public int number = 15;
public void print_inform(){
        /*В методе мы можем обращатся к любым атрибутам*/
        /* this - данная штука ссылается на действующий объект класса
        this.super_number - данная штука запрашивает атрибут у действующего объекта класса
        this не обязателен при взаимодействии с атрибутам (но лучше его использовать)
        Также с помощью this  можно вернуть текущий объект класса
            return this
        */
        this.super_number = 25;
        this.s_number = 20;
        this.number = 10;
        this.n_number = 5; 
        System.out.printf("super_number: %d, s_number: %d, number: %d, n_number: %d\n", 
                          this.super_number, this.s_number, this.number, this.n_number
        ); 
        // Вызов методов класса
        this.pro_fun();
        this.pri_fun();
        this.stan_fun();
    }

// Атрибуты с модификатором по умолчанию
    /* Отсутствие модификатора у поля или метода класса предполагает 
        применение к нему модификатора по умолчанию. 
    Такие поля или методы видны всем классам в текущем пакете.
    */
    int n_number = 10; 
    void stan_fun(){
        System.out.println("Вызов функции stan_fun"); 
    }
};
            

