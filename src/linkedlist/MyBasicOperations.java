package linkedlist;
import java.util.LinkedList;

public class MyBasicOperations {
	
	public static void main(String [] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Apple");
		ll.add("Oranges");
		ll.add("Grape");
		ll.add("Banana");
		//print the linked list
		System.out.println(ll);
		//check the size of linked list
		System.out.println("Size of linked list is : "+ll.size());
		//Check if the linked list is empty or not
		System.out.println("Is the linked list empty? "+ll.isEmpty());
		//check if the linked list contains apple or not
		System.out.println("Does the linked list contain?"+ll.contains("Apple"));		
		
	}

}
