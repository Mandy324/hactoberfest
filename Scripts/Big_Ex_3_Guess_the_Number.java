package concepts;
import java.util.Scanner;
import java.util.Random;



class Guess{
	
	Random rd = new Random();
	Scanner sc = new Scanner(System.in);
	public int random_number;
	public int entd = 0;
	public int count = 0;
	
	//Constructor for generating a random number
	public Guess() {
		random_number = rd.nextInt(10);
	}
	
	public void takeUserInput() {
		System.out.println("Enter the number: ");						
		entd = sc.nextInt();
		count++;
		System.out.println("Random : " + random_number);
	}
	
	
	public int IsCorrect() {
		if (entd == random_number) {
			return 0;
		}else if(entd < random_number) {
			return 1;
		}else {
			return 2;
		}
	}
	
	
	public int hops() {
		return count;
	}
	
	
}//class Guess ends

public class Big_Ex_3_Guess_the_Number {
	public static void main(String[] args) {
		/*
		 Create a class Game, which allows a user to play "Guess the Number" game once.
			
			Game should have the following methods:
			Constructor to generate the random number
			takeUserInput() to take a user input of number
			isCorrectNumber() to detect whether the number entered by the user is true
			getter and setter for noOfGuesses
			Use properties such as noOfGuesses(int), etc to get this task done!
		 */
		
		Guess obj = new Guess();
		int cont = 0;
		
		do{
		obj.takeUserInput();
		if(obj.IsCorrect() == 0) {
			System.out.println("You nailed it!!");
			cont = 0;
			break;
		}else if(obj.IsCorrect() == 1) {
			System.out.println("Lesser!!!");
			cont = 1;
		}else{
			System.out.println("Bigger!!!"); 
			cont = 1;
		}
		
		}while(cont == 1);
		
		
		System.out.println("This is your score man: " + obj.hops());
		
		obj.takeUserInput();
		//System.out.println(obj.IsCorrect());
		
		
	}//main end

}//main class end
