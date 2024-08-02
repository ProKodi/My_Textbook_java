






public class Main{
public 
    static void main(String args[]){
        // Создание экземпляра класса My_class
        My_class new_class = new My_class();

        // Обращение к публичным полю объекта класса
        System.out.printf("Обращение к полю number объекта класса My_class: %d\n", new_class.number); 
        // За классом мы можем использовать только public атрибуты

        // Изменение поля объекта класса
        new_class.number = 100;
        System.out.printf("Обращение к полю number объекта класса My_class: %d\n", new_class.number);

        /* 
        // Обращение к атрибутам через указатель
        My_class* ptr_class = &new_class; // Создание указателя на new_class

        // Обращение к публичным атрибутам класса через указатель
        cout << "Обращение к атрибуту number класса My_class через указатель: " << ptr_class->number << "\n";

        // Изменение атрибутов класса через указатель
        ptr_class->number = 10;
        cout << "Обращение к атрибуту number класса My_class через указатель: " << ptr_class->number << "\n";
        */
    }
}


class My_class{
// Поле приватных атрибутов (данное поле является по умолчанию)
private
    /* Создание инкапсулированных атрибутов
    Данные атрибуты могут использоватся только в классе
    */
    int super_number = 25;
// Поле защищеных атрибутов
protected
    /* Создание защищеных атрибутов
    Данные атрибуты могут использоватся только в классе или в классах производным от данного.
    */
    int s_number = 20; 
// Поле публичных атрибутов
public
    /* Создание публичных атрибутов
    Данные атрибуты доступны в любой части программы
    */
    int number = 15;

};
