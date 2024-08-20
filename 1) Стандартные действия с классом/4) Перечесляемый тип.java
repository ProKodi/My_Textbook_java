






public class Main{
public 
    static void main(String args[]){
        // Создание обьекта перечесляемого типа My_type 
        // (из перечесляемого типа вытаскиваем константу obj_1)
        My_type new_type = My_type.obj_1;
        // new_type переводим в тип int
        System.out.println("obj_1 = " + new_type.get_inform()); 
    }
}

/*Создание перечесляемых типов
enum class "имя типа данных"{
    "константа" = "значение константы"
}
"значение константы" - возможно задать только данные типа int
Указывать значение константы не обязательно (По умолчанию первой константе присваивается значение 0, последующие + 1)
Типа для константы указывать не нужно 
*/
enum My_type{
    // Имена обьектов для перечисления
    obj_0("inform 0"), obj_1("inform 1"), obj_2("inform 2"); 
// По факту - реализация класса (можно не использовать)

    private String inform = null; 
    private My_type(String inform){
        this.inform = inform; 
    }

    public String get_inform(){return this.inform;}
};

