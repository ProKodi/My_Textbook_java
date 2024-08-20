



public class Main{
public 
    static void main(String args[]){
        System.out.printf("My_class.super_number = %d\n", My_class.get_super_number()); 
        My_class new_class = new My_class(4);

        System.out.printf("My_class.super_number = %d\n", My_class.get_super_number()); 
        System.out.printf("My_class.super_number (через new_class) = %d\n", new_class.get_super_number()); 
    }
}

/* 
В Java можно определить атрибуты которые будут относится не к объекту 
    а именно к самому классу
Статическая переменная определяется только один раз и будет существовать, 
    даже если объекты класса не были созданы
    
Конструкция для полей:
    static inline "тип данных атрибутов" "имя поля" = "значение поля"
Конструкция для методов:
    static inline "тип данных возращаемым методом" "имя метода и его аргументы"{
        "код метода. В коде не допускается использование this"
    }
Статические атрибуты не используют приписку this. 

*/



class My_class{
    private int number;
    // Создаем поле класса
    private static int super_number = 0; 
    

    public My_class(final int number){
        My_class.super_number += 1; 
        // Устанавливаем значение для константного поля
        this.number = number; 
    }

    public static int get_super_number(){
        return My_class.super_number; 
    }

};
    