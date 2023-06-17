import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Collections;
public class PriorityQueues {
    public static void main(String[] args) {
        Queue<Double> queue = new PriorityQueue<>();
        //Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());
        // 4.0 3.5 3.0 2.5 2.0
        queue.offer(4.0);
        queue.offer(3.5);
        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(2.0);
        while(!queue.isEmpty()){
            System.out.print(queue.poll()+" ");//2.0 2.5 3.0 3.5 4.0
        }
        Queue<String> queue2 = new PriorityQueue<>();
        queue2.offer("D");
        queue2.offer("C");
        queue2.offer("B");
        queue2.offer("A");
        while(!queue2.isEmpty()){
            System.out.print(queue2.poll()+" ");//A B C D
        }
    }
}