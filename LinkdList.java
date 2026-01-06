import java.util.LinkedList;
import java.util.List;

public class LinkdList {
    public static void main(String[] args){
        List<String> students = new LinkedList<>();
        students.addAll(List.of("Gomathy","Thowfic","Rithiga","Vishva","Hema","Iniya"));
        System.out.println("All Students: " +students);

        List<String> passedStudents = new LinkedList<>();
        passedStudents.add("Vishva");
        passedStudents.add("Hema");
        passedStudents.add("Iniya");
        System.out.println("Passed Students: " +passedStudents);

        //to find failed students
        List<String> failedStudents = new LinkedList<>(students);//passing students list
        failedStudents.removeAll(passedStudents);
        System.out.println("Failed Students: " +failedStudents);

    }
}
