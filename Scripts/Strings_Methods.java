package concepts;

public class Strings_Methods {
	public static void main(String[] args) {
		String name = "Mandy";
		
		System.out.println(name.length());
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		
		String name2 = "   Fuckkk    ";
		System.out.println(name2.trim());
		
		System.out.println(name.substring(2));
		System.out.println(name.substring(2,4));
		System.out.println(name.replace("Man","D"));
		System.out.println(name.startsWith("Sid"));
		System.out.println(name.endsWith("Y"));
		System.out.println(name.charAt(3));
		System.out.println(name.indexOf("nd"));
		System.out.println(name.lastIndexOf("d",2));
		System.out.println(name.equals(name2));
		System.out.println(name.equalsIgnoreCase("MaNdY"));
	}

}
