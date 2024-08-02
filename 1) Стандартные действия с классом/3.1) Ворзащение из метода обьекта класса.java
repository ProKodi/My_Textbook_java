






public class Main{
public 
    static void main(String args[]){
        Test exempl = new Test(15);
        System.out.printf("До копирования: %d\n", exempl.te); 
        Test copi = exempl.get_copi();
        System.out.printf("После копирования: %d\n", copi.te); 
    }
}


class Test{
public
    int te;

    // Конструктор класса с инициализацией
    Test(int te){this.te = te;}
    // Конструктор копирования
    Test(Test obj){this.te = obj.te;}
    // Метод возращающий обьект класса
    Test get_copi(){
        Test temp = new Test(this.te + 1); 
        return temp;
    }
};