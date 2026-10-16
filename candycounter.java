public class candycounter {

public static void main(String[] args){


double totalPrice = countPrice(12, 3.50);
System.out.println("The total price is: " + totalPrice + " kr");
}
public static double countPrice(int amount, double priceforeachpiece){

return amount*priceforeachpiece;

}




}
