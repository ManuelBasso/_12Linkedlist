import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Creare un LinkedList con elementi e stamparlo in console.
        List<Fruit> fruitList = new LinkedList<>();
        fruitList.add(new Fruit("Apple"));
        fruitList.add(new Fruit("Banana"));
        System.out.println("Fruits list: " + fruitList);

        //Aggiungere un elemento al primo posto della lista e uno all'ultimo
        fruitList.addFirst(new Fruit("Ananas"));
        fruitList.addLast(new Fruit("lastfruttoBoh"));

        //Stampare la collezione aggiornata
        System.out.println("Fruits list aggiornata: " + fruitList);


    }
}