class Food {
    void order(String item) {
        System.out.println("Ordered item: " + item);
    }


    void order(String item, int quantity) {
        System.out.println("Ordered item " + item + " quantity: " + quantity);
    }


    void order(String item, int quantity, String juice) {
        System.out.println("Ordered item " + item + " quantity: " + quantity + " juice: " + juice );
    }
}

public class PolymorphismCT {
    public static void main(String[] args) {
        Food f1 = new Food();

        f1.order("Burger");
        f1.order("Burger", 2);
        f1.order("Burger", 2, "Cola");
    }
}
