package File6_Recursion;

// Print this on console for n=5
// 5
// 4
// 3
// 2
// 1
// 1
// 2
// 3
// 4
// 5
public class V4PDI {
    public static void main(String[] args) {
        PDI(5);
    }

    public static void PDI(int n){

        // Base Case
        if(n==0){
            return;
        }

        System.out.println(n); // help us to print 5,4,3,2,1 // Stack Building
        PDI(n-1); // recursive call

        System.out.println(n); // it will print 1,2,3,4,5 // Stack Falling
    }
}
