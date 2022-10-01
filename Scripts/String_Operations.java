package concepts;
import java.util.*;
import java.io.*;

public class String_Operations {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		//Passing string to other string
		char[] ch = {'M', 'a' , 'n', 'd' , 'y'};
		String str = new String(ch);
		System.out.println(str);
		*/
		
		/*
		//Printing the Ascii
		byte ascii[] = {65, 66, 67, 68, 69, 70};
		String s1 = new String(ascii); // This will store all the Ascii valued alphabets in the ascii array in s1
		String s2 = new String(ascii, 2, 5); // String (ascii, "Start_Source", "target ahead")
		*/
		
		/*
		//String length
		String str = "Mandy";
		System.out.println(str.length());
		System.out.println("Mandy ".length()); // This will give out the length of a string directly
		*/
		
		/*
		//String Concatenation
		String str = "Mandy is No. ";
		int a = 1;
		String str2 = str + a;
		System.out.println(str + a);
		*/
		
		/*
		//Converting int to String using String.valueOf(); method
		int a = 10;
		String str = new String();
		str = str.valueOf(a);
		System.out.println(str);
		*/
		
		/*
		//Extracting one character from a string
		String str = "Mandy";
		char[] ch = new char[5];
		for(int i = 0; i<5; i++) {
			ch[i] = str.charAt(i);		
		}
		//Then print the character array if want
		*/
		
		/*
		//Extracting multiple characters from the string 
		String str = "Mandy is the best !";		
		char[] ch = new char[4];
		str.getChars(13, 17, ch, 0); //getchars(start_index, last_index, string, string_start)
		System.out.println(ch[]);
		*/
		
		/*
		//Comparing Strings
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = "HeLlo";
		
		System.out.println(s1.equals(s2)); // true
		System.out.println(s1.equalsIgnoreCase(s3)); //true
		*/
		
		/*
		//startsWith() and endsWith() methods
		String str = "Foobar";
		String str2 = "Fuc";
		System.out.println(str.startsWith("bar",3)); //true
		System.out.println(str.endsWith(str2)); //false
		*/
		
		/*
		//Sorting the Strings using bubble sort using compareTo() method
		 * eg1. i.compareTo(j)< 0; then j is smaller than i 
		 * eg2. i.compareTo(j)> 0; then i is smaller than j
		 * eg3. i.compareTo(j)= 0; then both are equal
		 
		String[] str = {"Mandy", "is", "the", "Best!"};
		for (int j=0; j<str.length; j++) {
			for(int i=1; i<str.length; i++) {
				if(str[i].compareTo(str[j]) < 0) {//it means j is small
					String temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}else {
					continue;
				}
			}
		}
		for(int i=0; i<4; i++) {
			System.out.println(str[i]);
		}
		*/
		
		/*
		//Searching a string with String.indexOf() method which returns a int
		// -1 if not found. 0 if found. 
		String s = "Mandy is the best !";
		int a = s.indexOf("Mandy", 2); //returns -1 as after index 2 there is no "Mandy"
		System.out.println(a);
		System.out.println(s.lastIndexOf("t"));  // returns 16 as last index of t is 16 starting from 0
		*/
		
		/*
		//Replacing the string with str.replace() method
		String s = "Hello".replace('H', 'F');
		System.out.println(s);
		*/
		
		/*
		//Trimming string using Str.Trim() method
		String s = "    Hello     ".trim();
		System.out.println(s);
		*/
		
		/*
		//Changing the case of characters in the string
		String s = "MAndY";
		String s2 = s.toLowerCase();
		String s3 = s.toUpperCase();
		System.out.println(s2 + " : " + s3 ); // Output - mandy : MANDY
		*/
		
		/*
		//StringBuffer - This is a modifiable string
		String s = "Hello";
		StringBuffer sb = new StringBuffer(s);
		sb.ensureCapacity(25); // Adding minimum capacity to the StringBuffer
		sb.setLength(6); //Sets length to the StringBuffer
		System.out.println("String:" + sb + "Length : " + sb.length( ) + " Capacity: " + sb.capacity());
		
		char a = sb.charAt(2);
		sb.setCharAt(0, 'F'); //This will modify the original string
		System.out.println(a + " : " + sb);
		*/
		
		/*
		// append() method 
		String s = "Fuck ";
		int a = 42;
		StringBuffer sb = new StringBuffer(40);
		sb.append(" a = ").append(a).append("!").toString(); // or we can equal this value to a string
		System.out.println(s);
		*/
		
		/*
		String s = "I Love Stories!";
		StringBuffer sb = new StringBuffer(s);
		sb.insert(2, "Hate ");
		System.out.println(sb); //I Hate Love Stories!
		
		StringBuffer s2 = sb.reverse();
		String s3 = s2 + "Fuck";
		System.out.println(s2 + "," +s3); //!seirotS evoL etaH I,!seirotS evoL etaH IFuck
		
		s2.reverse();
		s2.delete(0, 6);
		System.out.println(s2); // _Love Stories!
		
		s2.deleteCharAt(1);
		System.out.println(s2); // _ove Stories!   ... "_" means monospace 
		
		String temp = "What the Yukk is this!";
		StringBuffer s4 = new StringBuffer(temp);
		s4.replace(9,12,"Fuckk");
		System.out.println(s4); // What the Fuckkk is this!
		*/
		
		
		String str6 = "Hkllo";
		char ch = 'e';
		//appending a character to the string;
		System.out.println("String without operation : " + str6);
		str6 = str6.substring(0,1) + ch + str6.substring(1);
		System.out.println("String after appending is : " + str6);
		//removing a char from string
		str6 = str6.substring(0,2)+str6.substring(3);
		System.out.println("String after removal : " + str6);
		
		
		
		
		
		
		
		
		
	}//Main method end

}//Main class end
