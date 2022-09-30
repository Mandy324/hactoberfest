package concepts;
import java.util.Scanner;
class circle{
	private float rd;
	
	public void getdata(float radi) {
		rd = radi;
	}
	
	public double per() {
		return rd *rd* 3.14;
	}
	
}

public class Access_Modifiers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		circle obj = new circle();
		System.out.println("Enter the radius: ");
		float r = sc.nextFloat();
		obj.getdata(r);
		System.out.println("Area : " + obj.per());
	}
	

}
