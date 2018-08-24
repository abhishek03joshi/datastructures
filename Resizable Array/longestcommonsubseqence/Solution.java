package longestcommonsubseqence;
import java.util.*;

public class Solution {

	static int [] LCS(int[] a, int[]b) {
		int l1=a.length;
		int l2=b.length;
		if(l1==0 || l2==0) {
			return 0;
		}
		else if(a[l1-1]==b[l2-1]) {
			return 1+LCS(a[l1-2],b[l2-2])
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int m = in.nextInt();
		
		int[] a = new int[n];
		for(int i=0; i<a.length; i++) {
			a[i]=in.nextInt();
		}
		
		int[] b = new int[m];
		for(int i=0; i<b.length; i++) {
			b[i]=in.nextInt();
		}
		
		int [] result = LCS(a,b);
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
		
		System.out.println();
		in.close();		

	}

}
