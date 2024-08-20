



public class Main{
public 
    static void main(String args[]){
        My_super_class new_class = new My_super_class();
        new_class.show_iform();
    }
}


class My_class{

    protected int number2 = 70; // Какой-то атрибут класса
    protected int get_number2(){
        return this.number2;
    }
    
    public int number = 7; // Какой-то атрибут класса
    public int get_number(){
        return this.number;
    }
};
    
    
/* Конструкция наследования:
class "Имя класса наследника":  extends "Имя класса родителя"{
    "реализация класса наследника"
}
Данная конструкция может из класса родителя вытянуть поля protected, public (private будет наследоватся, но не будет доступна) 
при наследовании методы и атрибуты из класса родителя можно использовать только в классе наследнике

По умолчанию все классы неявно наследуются от Object
*/
    
class My_super_class extends My_class{ 
public void show_iform(){
    System.out.printf("number = %d\n", this.get_number());
    System.out.printf("number2 = %d\n", this.get_number2());
}

};
    
    