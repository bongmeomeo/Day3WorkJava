package work;

import java.lang.reflect.Array;
import java.security.interfaces.DSAParams;
import java.util.Scanner;

public class Work12 {

	static Scanner sc = new Scanner(System.in);
	public static void main(int b[] ) {
		// TODO Auto-generated method stub
		
		int max = b[0], min= b[0];
		for (int i = 0; i<= b.length; i ++) {
			if (b[i] > max) {
				max = b[i];
			} 
			if (b[i]< min) {
				min = b[i];
			}
		}
		System.out.println("Max : " + max);
		System.out.println("Min : " + min);
		
	}

	
	
}
