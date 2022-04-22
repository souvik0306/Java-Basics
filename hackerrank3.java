import java.util.*;
import java.io.*;
import static java.lang.Math.*;
class hackerrank3{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int c = (int)Math.pow(2,n);
            int d = c*b;
            int eqn = (a+b+c);
            System.out.println(eqn);
        }
        in.close();
        
    }
}