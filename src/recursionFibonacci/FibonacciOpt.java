package recursionFibonacci;

import java.util.Scanner;

public class FibonacciOpt {
	static int  sum=0;
	static int num1=0;
	static int num2=1; 
	static  final void fib(int n) {
		
		sum = num1+num2;
		System.out.println(sum);
		num1=num2;
		num2=sum;
		if(n==1 || n==0) {
			return;
		}
		else{
			
			fib(n-1);
		}
				
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int num;
		System.out.println("Please enter a number whose fibonacci series needs to be calculated");
		num=in.nextInt();
		in.close();
		fib(num);

	}

}
