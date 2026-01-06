
class AgeException extends Exception {
    AgeException(String msg) {
        super(msg);
    }
}

public class CustomException {
    static void checkAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Age must be at least 18!");
        } else {
            System.out.println("Age is valid.");
        }

    }

    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (AgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

    }
}

