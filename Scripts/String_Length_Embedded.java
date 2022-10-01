package concepts;
import java.util.*;
import java.io.*;
public class String_Length_Embedded {
	public static void main(String[] args) {
		String str = "apple59red";
		int record = 0;
		int max = 50;
		int[] a = new int[max];
		
		//System.out.println(str.length());
		char[] ch =  new char[str.length()];
		
		for(int i=0; i<str.length()-1; i++) {
			if(ch[i] > 'a' && ch[i] < 'z') {
				continue;
			}else {
				a[record] = (str.charAt(i));
				record ++;
			}
		}
		int found=0;
		for(int i = 0; i<=record; i++) {
			if(a[record] == str.length()-1) {
				found = i;
			}
		}
		
		for(int i=0; i<str.length()-1; i++) {
			if(ch[i]!=a[found]) {
				ch[i] = str.charAt(i);
			}else if (ch[i] == a[found]) {
				continue;
			}
			
		}
		
		System.out.println(ch);	
	}

}
