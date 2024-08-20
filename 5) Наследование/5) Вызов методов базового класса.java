



public class Main{
public 
    static void main(String args[]){
        My_super_class new_good_class = new My_super_class(5, "good inform");
        new_good_class.show_iform();

    }
}
    
    
class My_class{
private int number;
    
public My_class(int number){
        this.number = number;
    }

public void show_iform(){
    System.out.printf("number = %d\n", this.number);
    }
};
        
        
class My_super_class extends My_class{ 
private String inform = "None";
    
public My_super_class(int number, String inform){
        super(number); 
        this.inform = inform;
    }
    
public void show_iform(){
    /* Для того чтобы в дочернем классе вызвать метод базового класса, 
        необходимо использовать следующую конструкцию: 

    super."название метода"();  
    */
        super.show_iform(); 
        System.out.println("inform = " + this.inform);
    }
}
        
        