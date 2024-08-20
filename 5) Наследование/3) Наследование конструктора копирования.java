



public class Main{
public 
    static void main(String args[]){
        My_super_class new_good_class = new My_super_class(5, "good inform");

        My_super_class new_class = new My_super_class(new_good_class);

        new_class.show_iform();
    }
}


class My_class{
    private int number;

    public My_class(int number){
        this.number = number;
    }

    public My_class(final My_class p){
        this.number = p.number; // Передаем копии атрибут объекта который хотим скопировать
        System.out.println("Копирование класса My_class");
    }


    public int get_number(){
        return this.number;
    }
};
    
    

    
class My_super_class extends My_class{ 
    private String inform = "None";

    public My_super_class(int number, String inform){
        super(number); 
        this.inform = inform;
    }

    My_super_class(final My_super_class p){
        super(p); 
        this.inform = p.inform; // Передаем копии атрибут объекта который хотим скопировать
        System.out.println("Копирование класса My_super_class");
    }


    public void show_iform(){
        System.out.printf("number = %d\n", this.get_number());
        System.out.println("inform = " + this.inform);
    }

};
    
    