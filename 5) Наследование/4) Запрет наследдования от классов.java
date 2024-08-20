



public class Main{
public 
    static void main(String args[]){
        My_class my_class = new My_class(5);
    }
}


/* Для того чтобы другим классам запретить наследоваться от класса нужно применить следующую конструкцию:
final class "имя класса" */
final class My_class{
    private int number;

    public My_class(int number){
        this.number = number; 
    }
};
    