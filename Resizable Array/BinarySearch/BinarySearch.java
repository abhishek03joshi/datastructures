package BinarySearch;
//Binary Search Example
/*
 Given a sorted array A[]  ( 0 based index ) and a key "k"  you need to 
 complete the function bin_search to  determine the position of the key 
 if the key is present in the array. If the key is not  present then you 
 have to return -1. The arguments left and right denotes the left most index 
 and right most index of the array A[]. There are multiple test cases. 
 For each test case, this function will be called individually.
 */
import java.util.*;
public class BinarySearch {
	public static void main(String [] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0) {
			int n = sc.nextInt();
			int arr[]= new int [n];
			for(int i=0; i<n; i++) {
				arr[i] = sc.nextInt();
			}
			
			int key = sc.nextInt();
			GFG g = new GFG();
			System.out.println("The key is present at the "+g.bin_search(arr, 0, n-1, key)+"th element");
			T--;
		}
			
	}
		
}
