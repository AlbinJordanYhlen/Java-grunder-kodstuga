public class pizzakalkylatorn {

    static int beraknaPris(int antalPizzor, int prisPerPizza) {
        int totalPris = antalPizzor * prisPerPizza;
        System.out.println("Totalpris för " + antalPizzor + " pizzor är: " + totalPris + " kr");
        return totalPris;


    }

public static void main(String[] args) {
        int antalPizzor = 3;
        int prisPerPizza = 100;
        beraknaPris(antalPizzor, prisPerPizza);
       
}
    }


