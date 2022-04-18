import java.util.LinkedList;

public class linkedlist {
    public static void main(String args[])
    {
     LinkedList<String> list = new LinkedList<String>();
     list.add("A");
     list.add("B");
     list.addLast("E");
     list.addFirst("F");
     list.add(4, "ele");
     System.out.println(list);

     list.remove("B");
     System.out.println(list);
  
    }
}
