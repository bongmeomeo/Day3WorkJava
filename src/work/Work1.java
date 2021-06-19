package work;

import java.util.Scanner;

public class Work1 {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Input index work: ");
		checkIndex(sc.nextInt());
		
	}
	
	public static boolean checkInteger(int a, int b, int c) {
		boolean check = true;
		if (a != (int)a && b != (int)b && c != (int)c) {
			check = false;
		}
		return check;
	}
	
	public static void checkIndex(int num) {
		if (num >= 1 && num <= 6) {
			switch(num) {
			case 1: System.out.println("Import number to check Positive/ Negative: ");
				checkNum(sc.nextInt());
				break;
			case 2: System.out.println("Import number to convert to Text: ");
				numToText(sc.nextInt());
				break;
			case 3:System.out.println("Import 3 numbers to check sides of Triangle ");
				checkTriEdge(sc.nextInt(), sc.nextInt(), sc.nextInt());
				break;
			case 4: 
				System.out.println("Import 3 numbers to check sides of Right Triangle ");
				checkTriEdge(sc.nextInt(), sc.nextInt(), sc.nextInt());
				break;
			case 5:  
				System.out.println("Import number to get Sum Positive Integer from 0 to this ");
				sumNegaInt(sc.nextInt());
				break;
			case 6:  
				System.out.println("Import number to get Product of this with 1 to 20  ");
				mult1To20(sc.nextInt());
				break;
			}
		} else {
			System.out.println("Dont have this index of work! \nPress any to Continued, 0 to cancel!");
			if (sc.nextInt() != 0 ) {
				checkIndex(sc.nextInt());
			} 
		}
		System.out.println("End!");
	}

	public static void checkNum(int num) {
		if ( checkInteger(num, num, num) ==true) {
			if (num >= 0) {
				System.out.println(num + " is Positive Integer!");
			} else {
				System.out.println(num + " is Negative Integer!");
			
		}
	} else {
		System.out.println("Import Integer Number!");
	}
	}
	
	public static void numToText(int num) {
		String[] numStr = {
				"One",
				"Two",
				"Three",
				"Four",
				"Five",
				"Six",
				"Seven",
				"Eight",
				"Nine",
				"Ten"
		}; 
if ( checkInteger(num, num, num) ==true) {
	if ( num <= 10 && num >0) {
		System.out.println(num + " : " + numStr[num-1]);
	}
		}else {
			System.out.println("Import Integer Number!");
		}
		
	}
	
	public static void checkTriEdge(int a, int b, int c) {
		if ( checkInteger(a, b, c) ==true) {
			if ( a + b > c && a + c > b && b + c > a) {
				System.out.println("There are 3 sides of a triangle!");
				if ( a*a + b*b == c*c || a*a + c*c == b*b || b*b* +c*c == a*a) {
					System.out.println("There are 3 sides of a right triangle!");
				}
			} else {
				System.out.println("There are not 3 sides of a triangle!");
			}
		}else {
			System.out.println("Import Integer Number!");
		
		}
	}
	
	public static void sumNegaInt(int num) {
		if ( checkInteger(num, num, num) ==true) {
		if (num > 0) {
			int sum =0;
			for (int i = 0; i<= num; i++) {
				if(i%2 ==0) {
					sum+= i;
				}
			}
			System.out.println("Sum Positive Integer from 0 to " + num + " : " + sum);
		} else {
			System.out.println("This number is't Positive Integer!");
		}
		} else {
			System.out.println("Import Integer Number!");
		}
	}
	
	public static void mult1To20(int num) {
		if ( checkInteger(num, num, num) ==true) {
		if ( num == 0) {
			System.out.println("Result: " + 0);
		} else {
			for ( int i =1; i<=20; i++) {
				System.out.println("Result: " + num*i);
			}
		}
		
	}else {
		System.out.println("Import Integer Number!");
	}
	}
	
}
