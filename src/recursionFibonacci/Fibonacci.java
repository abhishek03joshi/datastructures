package recursionFibonacci;

import java.util.Scanner;

public class Fibonacci {

	static int fib(int n) {
		int sum;
		if (n==2 || n==1) {
			return 1;
		}
		else {
			sum = fib(n-1)+fib(n-2);
			return sum;
		}
		
	}
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int num;
		System.out.println("Please enter a number whose fibonacci series needs to be calculated");
		num=in.nextInt();
		in.close();
		for(int i=1;i<=num;i++) {
			int f = fib(i);
			System.out.println(f);
		}		
	}
		
}
