import java.util.*;
public class queue {
    public static void main(String args[])
    {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("US");
        queue.add("India");
        queue.add("Pakistan");

        System.out.println("Original Queue - "+queue);

        queue.remove();
        System.out.println("New Queue - "+queue);
    }
}
