






public class Main{
    public 
        static void main(String args[]){
            int number_1 = 3;
            int number_2 = 2;
        
            /*Виды операторов:
                1) Унарные (нужен только один операнд)
                2) Бинарные (нужно два операнда)
                3) Тернарные (нужно три операнда)
            При работе с операторами все операнды должны быть одного типа
            */
        
            // Унарные операторы
            // Унарный минус (умножает число на -1)
            System.out.printf("Унарный минус  %d\n", -number_1);
        
            // ++ Инкримент ( аналог += 1)
            System.out.printf("Инкримент  %d\n", number_1++); // Отображает 23 но на самом деле 24
            System.out.printf("Инкримент  %d\n", ++ number_1); // Отображает все как надо
        
            // -- Дикремент (херовый аналог -= 1)
            System.out.printf("Дикремент  %d\n", number_1--); // Отображает 25 но на самом деле 24
            System.out.printf("Дикремент  %d\n", --number_1); // Отображает все как надо
        
            number_1 = 3;
        
            // Бинарные операторы
            // + Сложение
            number_1 += number_2;
            System.out.printf("+= %d\n", number_1);
            // number_1 += number_2 аналогично number_1 = number_1 + number_2
            number_1 = 3;
        
            // - Вычитание
            number_1 -= number_2;
            System.out.printf("-= %d\n", number_1);
            // number_1 -= number_2 аналогично number_1 = number_1 - number_2
            number_1 = 3;
        
        
            // * Умножение
            number_1 *= number_2;
            System.out.printf("*= %d\n", number_1);
            // number_1 *= number_2 аналогично number_1 = number_1 * number_2
            number_1 = 3;
        
        
            // / Деление
            number_1 /= number_2;
            System.out.printf("/= %d\n", number_1);
            // number_1 /= number_2 аналогично number_1 = number_1 / number_2
            number_1 = 3;
        
        
            // % Деление по модулю (остаток от деления). Работает только с целочисленными числами
            int number_2_int = (int)number_2;
            number_2_int %= 2;
            System.out.printf("%%= %d\n", number_2_int);
        
            // Целочисленное деление
            System.out.printf("Целочисленное деление %d\n", (int)(number_2 / number_1));
        
            number_2 =  (int)(number_2 / number_1);
            System.out.printf("Целочисленное деление c присваиванием %d\n", number_2);
            number_2 = 2;
    
            // Побитовые сдвиги
            // << - сдвиг в лево
            System.out.printf("number_1 << 2 = %d\n", number_1 << 2); // 11 << 2 = 1100 = 12
            // >> - сдвиг в право
            System.out.printf("number_1 >> 2 = %d\n", number_1 >> 2); // 11 >> 2 = 0
            // >>> - сдвиг в право с игнорированием знака
            System.out.printf("number_1 >>> 2 = %d\n", number_1 >>> 1); // 11 >>> 1 = 1
        }
    }
        
        
        