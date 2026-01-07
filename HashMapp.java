import java.util.HashMap;
import java.util.Map;

public class HashMapp {
    public static void main(String[] args) {
        Map<Integer,String> students= new HashMap<>();
        students.put(1,"Gomathy");
        students.put(3,"Thowfic");
        students.put(2,"Rithiga");
        System.out.println("Students" +students);

        students.put(2,"Vishva");//overrides
        students.put(4,"Gomathy");//value can be duplicated
        System.out.println("Students" +students);

        System.out.println("Get:" +students.get(3));
        students.remove(2);
        System.out.println("Final Students List");

    }
}
