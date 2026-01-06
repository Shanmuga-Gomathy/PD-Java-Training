import java.util.ArrayList;
import java.util.List;


//Array list is best for index based manipulation
public class ArrList {
    public static void main(String[] args) {
        List<Integer> sc = new ArrayList<Integer>();
        sc.addAll(List.of(50,60,80,100,65));
        System.out.println("All Scores: " +sc);

        int topScore = sc.get(0);
        for(int i=1; i < sc.size(); i++){
            if(topScore < sc.get(i)){
                topScore = sc.get(i);

            }

        }
        System.out.println("Top Score is : " +topScore);

    }
}



