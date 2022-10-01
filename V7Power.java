package File6_Recursion;

public class V7Power {
    public static void main(String[] args) {
        
        int p = power(2, 5);
        System.out.println(p);
    }

    public static int power(int x, int n){ // 2^3 = 2 * 2^2   // 2^2 = 2 * 2^1   // 2^1 = 2 * 2^0

        if(n==0){  // any number with power = 0 returns 1
            return 1;
        }

        int pnm1 = power(x, n-1);  // x raise to power of (n-1)
        int pn = x*pnm1;  // power of n

        return pn;
    }
}
