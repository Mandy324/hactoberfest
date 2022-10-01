package File6_Recursion;
// Print this on console for n=5
// 5
// 3
// 1
// 1
// 2
// 4
public class V5PDIskip {
    public static void main(String[] args) {
        
        PDIskip(5);
    }

    public static void PDIskip(int n){

        // Base Case
        if(n==0){
            return;
        }

        if(n%2==1){ // if n is an odd number
            System.out.println(n); // help us to print 5,3,1 // Stack Building
        }
        
        PDIskip(n-1); // recursive call // PD(5) PD(4) PD(3) PPD(2) PD(1)
        
        if(n%2==0){ // is n is an even number 
            System.out.println(n); // it will print for PD(2) and PD(4) // Stack Falling
        }
    }
}
