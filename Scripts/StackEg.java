package concepts;
import java.util.*;



public class StackEg {
	public static void main(String[] args) {
		int top = -1, max;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		max = sc.nextInt();
		int[] arr = new int[max];
		System.out.println("1. Push 2. Pop 3. Isempty 4. IsFull 5. Display all");
		int ch = sc.nextInt();
		int choice;
		do {
			switch(ch) {
			case 1:
				System.out.println("Enter the element to push: " );
				int a = sc.nextInt();
				if(top != max-1 && top >= 0) {
					top++;
					arr[top] = a;  
				}
				break;
				
			case 2:
				if(top != -1) {
					arr[top] = 0;
					top--;
				}else
					System.out.println("Stack is empty to Pop");
				break;//case 2 end
			case 3:
				
				break;//case 3 end
				
			
				
			case 5:
				if(top != max-1 && top >= 0) {
					for(int i =0; i<= top; i++) {
						System.out.println(arr[i]);
					}
					
				}else {
					System.out.println("Stack is empty!! ");
				}
				break;//case 5 end
			}
			
			System.out.println("Wanna Continue: 1. Yes 2. No");
			choice = sc.nextInt();
		}while(choice == 1);
		
		
		
		
		
	}//Main method end
}//main class end
