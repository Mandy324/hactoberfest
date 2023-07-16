package File6_Recursion.Scripts;
import java.util.Scanner;
public class Big_Ex_1_Calculate_CGPA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks of sub 1");
		int sub1 = sc.nextInt();
		System.out.println("Enter sub 2");
		int sub2 = sc.nextInt();
		System.out.println("Enter sub 3");
		int sub3 = sc.nextInt();
		
		float per = (sub1 + sub2 + sub3)/300f*100;
		float cgpa = per/9.5f;
		System.out.println("Your CGPA is : " + cgpa);
	}

}
