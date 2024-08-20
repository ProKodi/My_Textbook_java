






public class Main{
    public 
        static void main(String args[]){
            My_class new_class = new My_class(4);
            My_class new_class2 = new My_class(49, "Все прекрасно");
            My_class new_class3 = new My_class(new_class2);
            My_class new_class4 = new My_class();;
        }
    }
    
class My_class{
private int number; // Какое-то поле класса
private String state;
    /* 
    Кроме конструктора начальную инициализацию объекта вполне 
        можно было проводить с помощью инициализатора объекта.
    Инициализатор выполняется до любого конструктора. 
    То есть в инициализатор мы можем поместить код, общий для всех конструкторов
    */

    // начало блока инициализатора
    {
        this.number = 50;
        this.state = "Good state";
    }
    // конец блока инициализатора

public My_class(){}

public My_class(int number){this.number = number;}
        
public My_class(int number, String state){
        this(number); 
        this.state = state;
    }

public My_class(final My_class opt){this(opt.number, opt.state);}
};