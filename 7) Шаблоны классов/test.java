



public class Main_script{
public 
    static void main(String args[]){
        Poin<Integer, Float> poin = new Poin(4, 76.5); 
        poin.print();

        Poin<String, Float> poin2 = new Poin("Some inform", 76.5); 
        poin2.print();
    }
}

/*
Шаблоны классов - используют классы в качестве параметра при определении класса/функции
Инстанцирование - процесс генерации компилятором определеного класса

Пример:
    class "название класса"<"названия типов данных через запятую">{

*/

class Poin<type, type2>{
private type x;
private type2 y;
public Poin(type x, type2 y){
        this.x = x;
        this.y = y;
    }
public void print(){
    System.out.print("this.x = "); 
    System.out.print(this.x); 
    System.out.print("\t this.y = "); 
    System.out.println(this.y); 
}
};