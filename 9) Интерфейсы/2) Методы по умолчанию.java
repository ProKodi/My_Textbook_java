




public class Main{
public 
    static void main(String args[]){
        A temp = new A();
        temp.print();
    }
}
    
    
/*
В интерфейсах можно использовать стандартные методы. 
Для данных методов нужно использовать спецификатор default
Конструкция:
    "спецификатор доступа метода" default "тип данных который возращает метод" "название метода"("аргументы метода"){
        "реализация метода"
    }
*/

// Определение интерфейса
interface InnerB{
public default void print(){
        System.out.println("Standart inform");
    }; 
}


class A implements InnerB{
protected String inform = "Some inform";

public void print(){
        System.out.println(inform);
    } 
}