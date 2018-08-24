package recursionRunningTotal;

public class RunningSum {

	static int runningsum(int n) {
		if(n==0) {
			return 0;
		}
		else {
			return n+runningsum(n-1);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum,n=5;
		
		sum=runningsum(n);
		
		System.out.println("Running sum of "+n+" is "+sum);

	}

}
