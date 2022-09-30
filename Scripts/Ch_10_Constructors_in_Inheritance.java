package concepts;

class base {
	base(){
		System.out.println("Base constructor without argument!!");
	}
	base(int x){
		System.out.println("Base constructor, value of x is: " + x);
	}
	base(int x, int y){
		System.out.println("Base constructor with 3 args, value of y is : " + y);
	}
	
} 

class derived extends base{
	derived(){
		System.out.println("Derived constructor without args!!");
	}
	derived(int x){
		System.out.println("Derived constructor with 2 args, value of x is : " + x);
	}
	derived(int x, int y){
		super(x);
		System.out.println("Derived constructor with 2 args, value of y is : " + y);
	}
}

class derived2 extends derived{
	derived2(){
		System.out.println("Derived 2 constructor without args!!");
	}
	derived2(int x, int y, int z){
		super(x,y);
		System.out.println("Derived 2 constructor with 3 args and value of z is : " + z);
	}
}


public class Ch_10_Constructors_in_Inheritance {
	public static void main(String[] args) {
		derived2 o = new derived2(12,13,14);
	}

}

