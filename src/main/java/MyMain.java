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
        } else {
            return b;
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

        Scanner scan = new Scanner(System.in);
        System.out.println("Please type the function you would like to use. ('median' 'magnitude' 'pythagoras')");
        String calcType = scan.nextLine();
        if (calcType.equals("median")){
            System.out.println("What's your first number?");
            int a = scan.nextInt();
            System.out.println("What's your second number?");
            int b = scan.nextInt();
            System.out.println("What's your third number?");
            int c = scan.nextInt();
            System.out.println(median(a,b,c) + " is the median.");
        } else if (calcType.equals("magnitude")){
            System.out.println("What's your first number?");
            int aa = scan.nextInt();
            System.out.println("What's your second number?");
            int bb = scan.nextInt();
            System.out.println(magnitude(aa, bb) + " is the magnitude.");
        }else if (calcType.equals("pythagoras")){
            System.out.println("What's your first number?");
            int aaa = scan.nextInt();
            System.out.println("What's your second number?");
            int bbb = scan.nextInt();
            System.out.println(pythagoras(aaa, bbb) + " is the hypotenuse.");
        } else{
            System.out.println("* Error 404 - NOT DEFINED CALCULATOR FUNCTION PLEASE TRY AGAIN *");
        }
    }
}
