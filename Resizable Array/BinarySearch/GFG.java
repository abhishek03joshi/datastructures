//IMplement the binary search function.
package BinarySearch;

public class GFG {
	int bin_search(int A[], int left, int right, int k) {
		int flag=0;		
		//Test if the key is present or not.
		for(int j=0; j<A.length; j++) {
			if(A[j] == k) {
				flag = j;
				break;
			}
			else {
				flag = -1;
			}
		}
		return flag;
		
	}
}
