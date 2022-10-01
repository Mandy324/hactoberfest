package concepts;
import java.util.*;

public class Pairs_in_sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int[] arr = {-5,-2,-1,1,2,3,4,5,6,7,8,9,10,15,20,25,30};//17
		
		int sum = sc.nextInt();
		int count = 0;
		for(int i =0; i<arr.length-1; i++) {
			for(int j=1; j<arr.length-1;j++) {
				if(arr[i] + arr[j] == sum) {
					count++;
				}
			}
		}
		
		System.out.println(count);
		
		
		
	}//main method

}
