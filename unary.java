public class unary {
    public static void main(String[] args) {
        int result = +5;
        result--;
        System.out.println(result);
        result++;
        System.out.println(result);
        result = -result; // negate a variable
        System.out.println(result);

        boolean success = false;
        System.out.println(!success); // inverse the bool value by assigning !
    }
}
