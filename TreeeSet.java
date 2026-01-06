import java.util.List;
import java.util.TreeSet;

public class TreeeSet {
    public static void main(String[] args) {
        TreeSet<Integer> marks = new TreeSet<>();
        marks.addAll(List.of(70,65,90,78,82,76,80));

        System.out.println("Sorted Marks:" +marks);
        System.out.println("Total no of students:" +marks.size());


        System.out.println("Lowest mark: " + marks.first());
        System.out.println("Highest mark: " + marks.last());


        System.out.println("Next higher than 70: " + marks.higher(70));
        System.out.println("Next lower than 70: " + marks.lower(70));


        System.out.println("Ceiling of 72: " + marks.ceiling(72));
        System.out.println("Floor of 72: " + marks.floor(72));


        System.out.println("Marks below 70: " + marks.headSet(70));
        System.out.println("Marks from 70 onwards: " + marks.tailSet(70));
        System.out.println("Marks between 55 and 85: " + marks.subSet(55, 85));


        marks.remove(40);
        System.out.println("After removing 40: " + marks);


        System.out.println("Removed lowest mark: " + marks.pollFirst());
        System.out.println("Removed highest mark: " + marks.pollLast());

        System.out.println("Remaining marks: " + marks);
    }
}
