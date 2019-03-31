package epamtask4;

import java.util.*; 

//Java program to implement 
//a Singly Linked List 
class LinkedList { 

	Node head; // head of list 
	void middle()
	{
	    Node middle=head;/* assigning the head node to middle for temporary usage */
	    Node cur=head;
	
	    int length=0;
	    while(cur.next!=null)/* iterates until node is null */
	    {
	    
	    length++;/* incrementing length variable in order to find even positions */
	    if(length%2==0)
	    { /* if length is even then we need to move middle node to next node */
	       middle=middle.next;
	    }
	    cur=cur.next;/* current node is continuously moved to right position in order to find the middle position */
	    }
	    if(length%2==1)/* if length is odd then we need to choose middle.next node */
	    middle=middle.next;
	    System.out.println(middle.data);/* printing the middle element */
	}

	// Linked list Node. 
	// This inner class is made static 
	// so that main() can access it 
	static class Node { 

		int data; 
		Node next; 

		// Constructor 
		Node(int d) 
		{ 
			data = d; 
			next = null; 
		} 
	} 

	// Method to insert a new node 
	public static LinkedList insert(LinkedList list, int data) 
	{ 
		// Create a new node with given data 
		Node new_node = new Node(data); 
		new_node.next = null; 

		// If the Linked List is empty, 
		// then make the new node as head 
		if (list.head == null) { 
			list.head = new_node; 
		} 
		else { 
			// Else traverse till the last node 
			// and insert the new_node there 
			Node last = list.head; 
			while (last.next != null) { 
				last = last.next; 
			} 

			// Insert the new_node at last node 
			last.next = new_node; 
		} 

		// Return the list by head 
		return list; 
	} 

	// Method to print the LinkedList. 
	public static void printList(LinkedList list) 
	{ 
		Node currNode = list.head; 

		System.out.print("LinkedList: "); 

		// Traverse through the LinkedList 
		while (currNode != null) { 
			// Print the data at current node 
			System.out.print(currNode.data + " "); 

			// Go to next node 
			currNode = currNode.next; 
		} 
	} 

	// Driver code 
	public static void main(String[] args) 
	{ 
		/* Start with the empty list. */
		int length_of_linked_list;
		LinkedList list = new LinkedList(); 
		Scanner sc=new Scanner(System.in);
		int elements[]=new int[10000];
		
		length_of_linked_list=sc.nextInt();
		for(int i=0;i<length_of_linked_list;i++)
			elements[i]=sc.nextInt();
		for(int i=0;i<length_of_linked_list;i++)
			LinkedList.insert(list,elements[i]);
		list.middle();

		// Print the LinkedList 
	//	printList(list); 
		sc.close();
	} 
} 

