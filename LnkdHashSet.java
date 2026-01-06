import java.util.LinkedHashSet;
import java.util.Set;


public class LnkdHashSet {
    public static void main(String[] args) {
        Set<String> users = new LinkedHashSet<>();
        users.add("Gomathy");
        users.add("Rithiga");
        users.add("Thowfic");
        users.add("Gomathy");
        users.add("gomathy");//case sensitive
        System.out.println(users.iterator());
        System.out.println("Logged-in users (unique & ordered):");
        System.out.println(users);
    }
}
