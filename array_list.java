import java.util.*;
public class array_list {
    public static void main(String[] args)
    {
     List<Integer> arrayList = new ArrayList<Integer>(5);
     for (int i = 1;i<=5;i++)
     arrayList.add(i);

     System.out.println(arrayList);

     arrayList.get(2);
     arrayList.size();
     arrayList.add(4);
    //  System.out.println(arrayList.get(2));

     for (int i =0;i<arrayList.size();i++)
     {
      System.out.println(arrayList.get(i));
     }
    }
}
