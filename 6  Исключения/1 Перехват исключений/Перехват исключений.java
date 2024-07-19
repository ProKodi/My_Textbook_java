



import java.util.Scanner; // Данный модуль необходим для работы ввода в консоль


public class Main{
public 
    static void main(String args[]) throws StackOverflowError, OutOfMemoryError{
        /*
        Конструкция try - catch - finally
        Данная конструкция позволяет отлавливать исключения в коде и делать какие либо действия если произошло исключение
        try{
            "Код который хотим проверить на наличие исключений"
        }
        catch("исключение которое хотим поимать"){
            "Действие которое хотим сделать если нашли исключение"
        }
        finally{
            "Действие которое мы хотим сделать всегда"
        }
        */
        Scanner in = new Scanner(System.in);
        
        int flag;
        System.out.print("Введите число: ");
        flag = in.nextInt();

        in.close();


        try{
            switch (flag){
                case (1):
                    // Возбуждаем исключение для демонстрации работы try-catch
                    throw new StackOverflowError("Демонстрация возможностей try-catch (1)"); 
                case (2):
                    // Возбуждаем исключение для демонстрации работы try-catch
                    throw new OutOfMemoryError();
            }
        }
        catch (StackOverflowError ex){
            // StackOverflowError - класс исключений который возникает при перегрузке стека (функция вызывает много раз саму себя)
            System.out.println("Произошла функция вызывает много раз саму себя");
            System.out.print("Подробности ");
            System.out.println(ex.getMessage());
        }
        catch (Throwable error){
            // Throwable - базовый класс исключений (он детектит все исключения)
            System.out.println("Произошла неизвестная поломка программы");
            System.out.print("Подробности ");
            System.out.println(error.getMessage());
        }
        finally{
            System.out.println("Данное сообщение будет выводится всегда");
        }
    }
}
