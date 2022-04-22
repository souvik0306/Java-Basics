import java.util.Stack;

public class stack {
    public static void main(String args[])
    {
        Stack<String> stack = new Stack<>();
        stack.push("US");
        stack.push("India");
        stack.push("Germany");

        System.out.println(stack);

        String popped = stack.pop();
        System.out.println("Popped element -  " + popped);
        System.out.println(stack); 
    }
}
