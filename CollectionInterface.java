import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionInterface {
 public static void main(String[] args){
     Collection<Integer> number = new ArrayList<Integer>();
     number.add(1);
     number.add(2);
     number.add(3);
     number.add(3);
     System.out.println("Array" +number);
     System.out.println(number.contains(4));
     System.out.println(number.contains(1));
     System.out.println(number.hashCode());//956260 //955330
     System.out.println(number.remove(3));
     System.out.println("Array" +number);
     System.out.println(number.size());
 }
}
