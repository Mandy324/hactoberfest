package File6_Recursion.Scripts;
import java.util.Scanner;
import java.util.Random;
public class Big_Ex_2_Rock_Paper_Scissor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		int comp = 0, user = 0, count=1;
		
		do {
			
			System.out.println("Enter Your Choice : \n\t0. Rock \n\t1. Paper \n\t2. Scissor");
			int i1 = sc.nextInt();
			int i2 = rd.nextInt(2);
			if(i1==i2) {
				System.out.println("Tie");
			}else if(i1 == 0 && i2 == 1){
				System.out.println("Comp had Paper!");
				System.out.println("Comp win!");
				comp++;	
			}else if(i1 == 0 && i2 == 2) {
				System.out.println("Comp had Scissor");
				System.out.println("User win!!");
				user++;
			}else if(i1 == 1 && i2 == 0) {
				System.out.println("Comp had Rock!!");
				System.out.println("User win!!");
				user++;
			}else if(i1 == 1 && i2 == 2) {
				System.out.println("Comp had Scissor!!");
				System.out.println("Comp win!!");
				comp++;
			}else if(i1 == 2 && i2 == 0) {
				System.out.println("Comp had Rock!!");
				System.out.println("Comp win!!");
				comp++;
			}else if(i1 == 2 && i2 == 1) {
				System.out.println("Comp had Paper!!!");
				System.out.println("User win!!");
				user++;
			}
			count++;
			
		
		}while(count<=10);
		
		
		System.out.println("User won  " + user + " times!");
		System.out.println("Comp won " + comp + " times!");
		
		if(user>comp) {
			System.out.println("Final result declared as User won!");
		}else if(user == comp) {
			System.out.println("No one won, coz its tie");
		}else {
			System.out.println("Final result declared as Comp Won!");
		}
		
	}

}
