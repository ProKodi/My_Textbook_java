






public class Main{
public 
    static void main(String args[]){
        My_class new_class = new My_class(4);
        My_class new_obj =  new My_class(new_class);
    }
}

class My_class{
private
    int number;
    
public
    My_class(int number){
        this.number = number; 
    }
    
    My_class(final My_class p){
        /* Данный конструктор используется когда мы копируем объект
        По умолчанию просто копирует объект со всеми его атрибутами 
        При создании это конструктора необходимо указать что нужно скопировать
        */
        this.number = p.number; // Передаем копии атрибут объекта который хотим скопировать
        System.out.println("Копирование класса My_class"); 
    }
};
    