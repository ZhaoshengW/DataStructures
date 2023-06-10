import java.util.Stack;
public class Stacks{
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        stack.push("E");
        System.out.println(stack.peek()); // E
        String popItem = stack.pop(); // E
        System.out.println(popItem); // E
        System.out.println(stack.peek()); // D
        System.out.println(stack); // A B C D
    }
}