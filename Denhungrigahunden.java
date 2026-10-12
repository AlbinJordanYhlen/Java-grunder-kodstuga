public class Denhungrigahunden {

    public static void main(String[] args) {
        
        int currentHunger = 100; 
        
        currentHunger = Dog.eat(currentHunger, 30);
        
   
        Dog.showHunger(currentHunger); 
    }


    static class Dog {
        
        static int eat(int hunger, int food) {
            hunger -= food;
            return hunger;
        }

        static void showHunger(int hunger) {
            System.out.println("Hunger level is: " + hunger);
        }
    }
}