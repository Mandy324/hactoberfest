package File6_Recursion;

public class V3RercusionWorkStackFalling {
    public static void main(String[] args) {
        
        printIncrease(5);
    }

    public static void printIncrease(int n){

        // Base Case
        if(n==0){
            return;
        }

        printIncrease(n-1); // recursive call
        System.out.println(n);
    }
}
