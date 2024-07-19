



import java.util.Scanner; // Данный модуль необходим для работы ввода в консоль




public class Main{
public 
    static void main(String args[]){
        /*
        Общая конструкция множественного условия:
        switch ("какое то выражение"){
            case "значение 1":
                "действия если выражение == значение 1";
                break;
            case "значение 2":
                "действия если выражение == значение 2";
                break;
            default:
                "данный блок не обязателен (при невыполении всех выше стоящих условий switch просто закроется (как при break))"
                "действия по умолчанию";
                break;
        }
        какое то выражение должно быть целочисленным (int или bool)
        Значения для case должны быть разными

        break - точка выхода из switch (необходим иначе выполнется нужное и не нужное под другими case в switch)
        Любые переменные которые создаются в блоке switch будут удалены
        */
        Scanner in = new Scanner(System.in);

        System.out.print("Введите полученную оценку: ");
        int mark = in.nextInt();
        in.close();

        switch (mark){
            case 1:
                System.out.println("Была получена оценка 1. Это отвратительно");
                break;
            case 2:
                System.out.println("Была получена оценка 2. Это плохо");
                break;
            case 3:
                System.out.println("Была получена оценка 3. Это удовлетворительно");
                break;
            case 4: // Совмещенный блок
                case 5:
                    System.out.println("Хорошая оценка");
                    break;
            default:
                // Так как все возможные варинты были перепробаваны то остаются невозможные варианты
                System.out.println("Было введено не верное значение");
                break;
        }
    }
}
