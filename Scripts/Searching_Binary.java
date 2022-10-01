package concepts;
import java.util.*;

public class Searching_Binary {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter");
		int search = sc.nextInt();
		int start = 0, end = a.length-1;
		int middle = (start+end)/2;
		while(a[middle] != search && start<=end) {
			if(search>a[middle]) {
				start = middle+1;
			}else if(search<a[middle]) {
				end = middle-1;
			}
			middle = (start + end)/2;
		}
		System.out.println(middle);
		
		
		
	}//main method

}//main class
