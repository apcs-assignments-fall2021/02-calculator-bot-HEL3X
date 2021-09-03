import java.util.Scanner;

public class MyMain {

    // Calculates the median of the three inputs
    public static int median(int a, int b, int c) {
        if (a<b && b<c){
            return b;
        }else if (a>b && b>c){
            return b;
        }else if (b<a && a<c){
            return a;
        }else if (b>a && a>c){
            return a;
        }else{
            return c;
        }
    }

    // Returns the input with the larger absolute value
    public static int magnitude(int a, int b) {
        if (java.lang.Math.abs(a) > java.lang.Math.abs(b)){
            return a;
        } else if (java.lang.Math.abs(b) > java.lang.Math.abs(a)){
            return b;
        }else{
            return a;
        }
    }

    // Returns the "c" value from the Pythagorean theorem "a^2 + b^2 = c^2",
    // where "a" and "b" are the inputs to the method
    public static double pythagoras(int a, int b) {
        double cc = a*a + b*b;
        double c = Math.sqrt(cc);
        return c;
    }

    public static void main(String[] args) {
        // You may want to keep these lines of code to test that your methods work
        System.out.println(median(1, 2, 3)); // should be 2
        System.out.println(magnitude(-7, -1)); // should be -7
        System.out.println(pythagoras(3, 4)); // should be 5.0

        Scanner scan = new Scanner(System.in);
        // YOUR CODE HERE
    }
}
