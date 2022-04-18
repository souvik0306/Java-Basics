import java.util.HashSet;
import java.util.Set;

public class hash_set {
    public static void main(String args[])
    {
        HashSet<String> hasSet = new HashSet<String>();

        hasSet.add("Ele");
        hasSet.add("den");
        hasSet.add("rte");
        System.out.println(hasSet);
        hasSet.remove("den");
        System.out.println(hasSet);

        for (String i: hasSet)
            System.out.println(i);
    }        
}
