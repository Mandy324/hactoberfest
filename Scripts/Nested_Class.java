package File6_Recursion.Scripts;

public class Nested_Class {
	
	void show() {
		System.out.println("Shown in main");
		class nest{
			void show2() {
				System.out.println("Shown in nested class in method");
			}//show end
			
		}//nest class end
		nest obj1 = new nest(); // we can access class nest in show function only .. 
		obj1.show2();
		
	}//show end
	
	
	public static void main(String[] args) {
		
		Nested_Class obj = new Nested_Class();
		obj.show();
		
	}//main method end
}//main class end
