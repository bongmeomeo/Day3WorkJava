package work;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Work {

static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Enter number of works from 14 to :";
		System.out.println(str);
		int num = sc.nextInt();
		returnWork(num, str);		
	
	}
	
	public static void returnWork(int num , String str) {
		switch (num) {
		case 14: System.out.println("Enter numbers: ");
		checkTypeNum(sc.nextInt());
		break;
		case 15: multiOf3();
		break;
		case 16: checkTextA();
		break;
		case 17: checkArrS();
		break;
		case 18: splitStrArr();
		break;
		case 19: printCheckPrime();
			break;
		case 20:USCLN();
			break;
		case 21: sumNInteger();
			break; 
		case 22:sumPrimeN();
			break;
		case 23: sum0ToN();
			break;
		case 24: printNOfFibonaci();
			break;
		case 25:printArts();
			break;
		case 26:printArts2();
		break;
			default: System.out.println(str);
			returnWork(num, str);
			break;
		}
	}
	
//	 Work 14 
	public static void checkTypeNum(int num) {
		if ( num==  0) {
			System.out.println(num + " is Zero!");
		} else if (num %2 ==0) {
			System.out.println(num + " is Even Number!");
		} else {
			System.out.println(num + " is Odd Number!");
		}
	}
	
// Work 15
	public static void multiOf3() {
		for (int i = 3; i <= 300; i++) {
			System.out.println("Multiples of 3: ");
			if ( i% 3 == 0) {
				System.out.print(i +", ");
			}
		}
	}
//	Work 16
	public static int checkTextA() {
		int n , i =0, count= 0;
		System.out.println(" Enter lenght of array: ");
		n = sc.nextInt();
		String a[] = new String[n];
		System.out.println("Enter elements of array: ");
		for ( i = 0; i < n; i++ ) {
			a[i] = sc.nextLine();
		}
		
		for (i =0; i <n; i++) {
			if (a[i] == "a") {
				count ++;
			}
		}
		System.out.println("Number of Occurrence of 'a' : ");
		return count;
	}
	
	// Work 17 
	public static void checkArrS() {
		int n ;
		System.out.println("Enter lenght of array: ");
		n = sc.nextInt();
		if ( n<= 0) {
			System.out.println("Lenght must be > 0! Enter Again!");
			checkArrS();
		} else {
			char s[] = new char[n];
			enterArr(n , s);
		}
	}
//	
	public static void enterArr(int n, char[] s) {
		System.out.println("Enter element of array: ");
		for (int i =0; i< n; i++) {
			char num = sc.next().charAt(0);
			if (checkNum(num) == true) {
				System.out.println("This is a Number!");
				s[i] = num;
			} else {
				System.out.println("This isnt a Number! Enter again");
				enterArr(n, s);
			}
		}
	}
//	
	public static boolean checkNum(int num) {
		boolean check = false;
		if (Character.isDigit(num) == true) {
			check = true;
		} 
		return check;
	}
	// Work 18
	public static void splitStrArr() {
		StringTokenizer S = new StringTokenizer("Bai Tap Mon Lap Trinh Java");
		System.out.println("String :");
		while (S.hasMoreTokens()) {
			System.out.println(S.nextToken());
		}
		
	}
//	Work 19 
	public static void printCheckPrime() {
		System.out.println("Enter Number to check is Prime");
		int num = sc.nextInt();
		if ( num < 2) {
			System.out.println("Number must be >= 2!Enter Again:");
			printCheckPrime();
		} else if (num == 2){
			System.out.println(num +" is Prime Number!");
		} else { 
			if ( checkPrimeNum(num) == true) {
				System.out.println(num +" is Prime Number!");
	} else {
		System.out.println(num +" isnt Prime Number!");
	}
	}
	}
//	
	public static boolean checkPrimeNum(int num) {
		boolean check = true;
			for (int i = 2; i< num; i++) {
				if (num%i == 0) {
					check = false;
					break;
				} 
			}
		return check;
	}

//	Work 20
	public static void USCLN() {
		System.out.println("First number: ");
		int a = sc.nextInt();
		System.out.println("Second number: ");
		int b = sc. nextInt();
		if ( a > 0 && b > 0) {
			while ( a!= b ) {
				if (a > b) {
					a -= b;
				} else {
					b -= a;
				}
			}
			int uscln = a;
			System.out.println("USCLN : " + uscln);
		} else {
			System.out.println("Two numbers must be > 0! Enter Again: ");
			USCLN();
		}
	}
//	Work 21
	public static void sumNInteger() {
		int sum = 0;
		System.out.println("Total numbers to Sum: ");
		int length = sc.nextInt();
		if (length == 0) {
			System.out.println("Sum : " + sum );
		} 
		for(int i = 0; i< length; i++) {
			System.out.println("Enter number at " + (i+1) + " :");
			sum += sc.nextInt();
		}
		System.out.println("Sum of there numbers: " + sum);
	}
//	Work 22
	public static void sumPrimeN() {
		int sum = 2;
		System.out.println("Enter number N:");
		int N = sc.nextInt();
		if (N < 2) {
			System.out.println("Number must be > 2");
		}
		for (int i = 2; i< N; i++) {
			if( checkPrimeNum(i) == true) {
				sum += i;
			}
		}
		System.out.println("Sum of Prime Numbers  < N : " + sum );
	}
//	Work 23
	public static void sum0ToN() {
		sumPrimeN();
	}
//	Work 24
	
	public static void printNOfFibonaci() {
		System.out.println("Enter number n: ");
		int n = sc.nextInt();
		if ( n < 2 ) {
			System.out.println("Number n must be >= 3");
			printCheckPrime();
		} 
		int sum = arrFibonaci(n);
		System.out.println("Sum of first n numbers of Fibonaci Array:  " + sum);
		
	}
//	
	public static int arrFibonaci( int lenght) {
		int sum = 2;
		int[] arr = new int[lenght];
		arr[0] = arr[1] = 1;
		for (int i = 2; i < lenght; i ++ ) {
			arr[i] = arr[i-1] + arr[i-2]; 
			sum += arr[i];
		}
		return sum;
	}
//	Work 25
	public static void printArts() {
		System.out.println("Enter index of Art from a to c: ");
		String str = sc.nextLine();
		switch(str) {
		case "a": print25a();
		break;
//		case "b": print25b();
//		break;
//		default: print25c();
//		break;
		}
	}
	public static void print25a() {
		for (int i= 0 ; i< 9; i++) {
			for ( int j =0; j<= i; j++ ) {
				if ( j == 1 || j == i || i == 9) {
					System.out.print("*");
				} else {
					System.out.print("");
				}
				System.out.println("");
			}
		}
	}
	
//	Work 26
	public static void printArts2() {
		System.out.println("Enter index of Art from a to d: ");
		String str = sc.nextLine();
		switch(str) {
		case "a": printTri26a();
		break;
		case "b": printTri26b();
		break;
		case "c": printTri26c();
		break;
		default: printTri26d();
		break;
		}
	}
	
	public static void printTri26a() {
		for(int i = 0; i< 7; i++ ) {
			for (int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println("\n");
		}
	}
	public static void printTri26b() {
		for(int i = 7; i> 0 ; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("\n");
		}
	}
	public static void printTri26c() {
		for(int i= 0; i < 10; i++) {
			for (int j = 0; j< 19; i++) {
				System.out.print("*");
			}
			System.out.println("\n");
		}
	}
	public static void printTri26d() {
		
	}
	
}
