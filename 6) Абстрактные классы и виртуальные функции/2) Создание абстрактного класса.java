



/*
Виртуальная функция, объявленная в базовом классе иерархии порождения может не иметь определения. 
Для выделения этой особенности ее приравнивают к нулю. В этом случае функция называется чисто виртуальной.

Абстрактный класс - класс который создан для того чтобы быть классом родителем.
Необходим для того чтобы выделить что-то общее между обьектам (может иметь атрибуты)
Абстрактный класс не предпологает создание экземпляров. 

Абстрактные классы можно использовать как интерфейсы
*/



public class Main_script{
public 
    static void main(String args[]){
        // Animal ani = new Animal(); - Такое не допустимо
        Cat my_cat = new Cat("Tobi pizda"); 
        System.out.println("Вызов метода на прямую:");
        my_cat.print();

        System.out.println("Вызов метода через обьект абстрактого класса");
        Animal obj = my_cat; 
        obj.print();
    }
}

/* Для создания абстрактоного класса необходимо использовать следующую конструкцию:
abstract class "название класса"{
    "Реализация класса"
}
*/

// Абстрактный класс животных
abstract class Animal{
protected String type_name; 

/*
Для создания чисто-виртуальной функции необходимо использовать следующую конструкцию:
    abstract "расширение доступа" "тип возращаемый функцией" "название функции"("параметры");
*/
abstract public void print(); // Создание виртуальной функции (Не определено, но компилятору это безразлично)
}
    
class Cat extends Animal{
protected String name;
protected String type_name = "cat";

public Cat(String name){
        this.name = name;
    }

public void print(){
    System.out.print("Name: " + this.name); 
    System.out.println("Type: " + this.type_name); 
    }
}
