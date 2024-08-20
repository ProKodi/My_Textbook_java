



public class Main{
public 
    static void main(String args[]){
        // Создаем константный объект собственного класса
        final My_class new_odj = new My_class(4);

        // Пытаемся изменить значение константного объекта 
        My_class new_odj2 = new_odj.set_number(5); 
        new_odj2 = new_odj2.set_number(1); 

        System.out.printf("new_odj.number = %d\n", new_odj.get_number());
        System.out.printf("new_odj2.number = %d\n", new_odj2.get_number());
    }
}

/* 
Создание константных обьектов
Для того что-бы экземпляр созданного нами класса мог быть константой
    необходимо определить является ли это класс изменяемым. 

Если класс неизменяемый то необходимо сделать следующее:
    1) Все поля которые должны быть не изменяемыми должны иметь модификатор final
    2) При изменении не изменяемых объектов в методе, метод должен вернуть новый объект класса

Если класс изменяемый то необходимо сделать следующее:
    1) При изменении не изменяемых объектов в методе, должны изменятся поля и при
    этом данные поля не должны иметь модификатор final


Основное отличие между изменяемыми и не изменяемыми объектами состоит в том что,
    при изменении неизменяемого объекта, создается новый объект а при изменении 
    изменяемого обьекта, объект остается тем же (тот же адрес)

*/


class My_class{

    // Создаем константное поле
    private final int number;
    

    public My_class(final int number){
        // Устанавливаем значение для константного поля
        this.number = number; 
    }
    // Возращаем новый объект при попытке изменить константу
    public My_class set_number(final int number){
        return new My_class(this.number + number); 
    }

    public int get_number(){
        return this.number;
    }

};
    