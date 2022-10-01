package File6_Recursion;

public class V6Factorial {
    public static void main(String[] args) {
        int f = factorial(6);
        System.out.println(f);
    }

    public static int factorial(int n){  // n! = n*(n-1)!

        // Base Case
        if(n==1){
            return 1;
        }
        
        int fnm1 = factorial(n-1); // fnm1: factorial of n-1 OR (n-1)!
        int fn = n*fnm1;  // fn: factorial of n 
        return fn;
    }
}
