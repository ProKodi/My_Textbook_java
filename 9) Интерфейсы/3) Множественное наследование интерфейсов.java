




public class Main{
public 
    static void main(String args[]){
        A temp = new A();
        temp.print();
        temp.print2();
    }
}
    
    
/*
При множественной реализации интерфейсов можно перечислять 
    все эти интерфейсы через запятую
*/

// Определение интерфейса
interface InnerB{
public default void print(){
        System.out.println("Standart inform");
    }; 
}


interface InnerB2 extends InnerB{
public void print2(); 
}
    

class A implements InnerB, InnerB2{
protected String inform = "Some inform";

public void print(){
        System.out.println(inform);
    } 
public void print2(){
        System.out.println(inform + " append inform");
    } 
}