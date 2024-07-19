



import java.util.Scanner; // Данный модуль необходим для работы ввода в консоль


public class Main{
public 
    static void main(String args[]){
        /* 
        Для того чтобы можно было вводить даные в консоль необходимо создать обьект сканер
            Scanner in = new Scanner(System.in);
        Для получения данных необходимо будет применить следующие методы:
            in.next(): считывает введенную строку до первого пробела
            in.nextLine(): считывает всю введенную строку
            in.nextInt(): считывает введенное число int
            in.nextDouble(): считывает введенное число double
            in.nextBoolean(): считывает значение boolean
            in.nextByte(): считывает введенное число byte
            in.nextFloat(): считывает введенное число float
            in.nextShort(): считывает введенное число short

        После получения данных обьект нужно удалить
            in.close();
         */
        Scanner in = new Scanner(System.in);

        String name;
        System.out.println("Input name");
        name = in.nextLine();

        int age;
        System.out.println("Input age");
        age = in.nextInt();

        in.close();

        System.out.printf("Helloy. My name %s. I am %d old", name, age);
    }
}


