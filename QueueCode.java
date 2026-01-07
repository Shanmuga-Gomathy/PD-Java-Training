import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class QueueCode {
    public static void main(String[] args){
        Queue<Integer> queue= new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.offer(15);
        queue.add(25);
        queue.add(30);
        System.out.println("Queue:"+queue);
        System.out.println("Peek:" +queue.peek());
        queue.remove(30);
        System.out.println("After removing:" +queue);
        queue.remove();
        System.out.println("After removing:" +queue);
        queue.poll();
        System.out.println("After removing:" +queue);
        System.out.println("Is empty:" +queue.isEmpty());




    }
}
