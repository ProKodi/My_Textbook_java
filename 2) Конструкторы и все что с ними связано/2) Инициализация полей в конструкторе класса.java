






public class Main{
public 
    static void main(String args[]){
        My_class new_class = new My_class(4);
    }
}

class My_class{
private
    final int number; // Какой-то атрибут класса который константа
    
public
    /*
    Инициализация полей в конструкторе класса
    Для того чтобы можно было инициализировать поле в конструкторе класса, 
        необходимо использовать следующую конструкцию:
        this."название поля" = "значение поля";
    Даную констукцию, для одного поля, можно использовать только 1 раз 
    */
    My_class(int number){
        // Данный конструктор используется когда класс инициализируют 1 параметром
        this.number = number; 
        System.out.printf("number = %d\n", this.number); 
        // this.number = number;  // Ошибка
    }
};