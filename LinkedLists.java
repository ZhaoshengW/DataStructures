import java.util.LinkedList;
public class LinkedLists {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        // stack
        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("E");
        linkedList.pop(); // E
        System.out.println(linkedList); // D, C, B, A
        // queue
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("E");
        System.out.println(linkedList); // D, C, B, A, A, B, C, D, E
        linkedList.poll();
        System.out.println(linkedList); // C, B, A, A, B, C, D, E
        linkedList.add(0,"Z");
        linkedList.remove("A");
        System.out.println(linkedList); // Z, C, B, A, B, C, D, E
        System.out.println(linkedList.indexOf("Z")); // 0
        System.out.println(linkedList.peekFirst()); // Z
        System.out.println(linkedList.peekLast()); // E
        linkedList.addFirst("88");
        linkedList.addLast("22");
        System.out.println(linkedList);// 88, Z, C, B, A, B, C, D, E, 22
        linkedList.removeFirst();
        linkedList.removeLast();
    }
}