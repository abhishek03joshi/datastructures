//Reverse an Array
/*
 First line contains an integer, the number of test cases 'T' 
 Each test case should contain an integer, size of array 'N' in 
 the first line. In the second line Input the integer elements 
 of the array in a single line separated by space.
 */
import java.util.*;
public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		int L;
		int [] arr;
		int [] des;
		
		for(int i=0; i<T; i++){
		    L=sc.nextInt();
		    sc.close();
		    arr = new int [L];
		    for (int j=0; j<arr.length ; j++){
		        arr[j]=sc.nextInt();
		    }
		    des = new int [L];
		    for(int j=L-1; j>=0; j--){
		        des[j]=arr[L-j-1];
		    }
		    
		    for(int j=0; j<des.length; j++){
		    System.out.print(des[j]+" ");
		    }
		    System.out.println();
		    
		}
		

	}

}
