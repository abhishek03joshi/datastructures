package Treeset;
import java.util.TreeSet;

public class MyBasicTreeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(123);
		ts.add(345);
		ts.add(54);
		System.out.println("Check the elements:"+ts);
		//check if the set is empty
		System.out.println("Is the set empty? "+ts.isEmpty());
		//delete all the elements from the tree
		ts.clear();
		System.out.println("Is the set empty? "+ts.isEmpty());
		ts.add(240);
		ts.add(678);
		ts.add(60);
		System.out.println("Elements"+ts);
		System.out.println("Size of the set is "+ts.size());
		//remove one string
		ts.remove(60);
		System.out.println("Elements"+ts);
		

	}

}
