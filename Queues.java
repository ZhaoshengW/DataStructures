import java.util.Queue;
import java.util.LinkedList;
public class Queues{
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        System.out.println(queue.isEmpty());//true
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        queue.offer("D");
        queue.offer("E");
        System.out.println(queue.size());// 5
        System.out.println(queue.contains("E"));// true
        System.out.println(queue);// [A, B, C, D, E]
        System.out.println(queue.peek());// A
        //System.out.println(queue.element()); which could cause an exception
        queue.poll();// A
        System.out.println(queue);// [B, C, D, E]
    }
}