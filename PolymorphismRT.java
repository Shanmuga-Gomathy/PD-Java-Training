class Payment {
    void pay() {
        System.out.println("Making payment");
    }
}

class Cash extends Payment {
    void pay() {
        System.out.println("Paying with cash");
    }
}

class Card extends Payment {
    void pay() {
        System.out.println("Paying with card");
    }
}

class UPI extends Payment {
    void pay() {
        System.out.println("Paying using UPI");
    }
}

public class PolymorphismRT{
    public static void main(String[] args) {
        Payment p;

        p = new Cash();
        p.pay();

        p = new Card();
        p.pay();

        p = new UPI();
        p.pay();
    }
}


