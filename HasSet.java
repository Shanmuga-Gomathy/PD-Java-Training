import java.util.HashSet;
import java.util.Set;

public class HasSet {
    public static void main(String[] args) {

        Set<Integer> rollNumbers = new HashSet<>();

        rollNumbers.add(101);
        rollNumbers.add(102);
        rollNumbers.add(103);
        rollNumbers.add(101);
        rollNumbers.add(102);

        //prints without duplicate
        System.out.println("Unique Roll Numbers: " + rollNumbers);
    }
}
