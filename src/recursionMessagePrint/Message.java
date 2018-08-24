package recursionMessagePrint;
import java.util.*;

public class Message {
	
	static void display(int n) {
		if(n>0) {
			System.out.println(n+" Hello world!!");
			display(n-1);//recursive call to the function
		}
		else {
			return;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int number;
		
		//input a value
		System.out.print("Enter number of times to display the message : ");
		number=in.nextInt();
		in.close();
		
		display(number);//recursive function called

	}

}
