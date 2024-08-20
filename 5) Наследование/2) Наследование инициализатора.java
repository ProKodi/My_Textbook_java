



public class Main{
public 
    static void main(String args[]){
        My_super_class new_good_class = new My_super_class(5, "good inform");
        new_good_class.show_iform();

        My_super_class new_class = new My_super_class(5);

        new_class.show_iform();
    }
}


class My_class{
    private int number;

    public My_class(int number){
        this.number = number;
    }

    public int get_number(){
        return this.number;
    }
};
    
    

    
class My_super_class extends My_class{ 
    private String inform = "None";

    public My_super_class(int number, String inform){
        /* Использование конструктора родительского класса
        Конструкция: 
            super("данные которые нужно подать родительскому классу"); 
        */
        super(number); 
        this.inform = inform;
    }

    public My_super_class(int number){super(number); }


    public void show_iform(){
        System.out.printf("number = %d\n", this.get_number());
        System.out.println("inform = " + this.inform);
    }

};
    
    