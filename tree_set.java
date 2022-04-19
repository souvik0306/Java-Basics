import java.util.TreeSet;

public class tree_set {
    public static void main(String args[]) 
    {
      TreeSet<String> treeset = new TreeSet <String>();
      treeset.add("As");
      treeset.add("element");

      for (String i:treeset)
        System.out.println(i);
    }
    
}
