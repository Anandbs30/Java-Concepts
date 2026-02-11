package V36_Collection_FrameWork.Collection_Interface.List.LinkedList;

/*
 * In linkedList every elements is called as node
 * where node consist two things : 
 * 			1) Data
 * 			2) Pointer/Reference (where this have the info about next node where stored.)
 * 
 * LinkedList and there types : 
 * 1. Singly Linked List (SLL) : Each node contains data and a reference to the next node. Traversal is only one direction.
 * 		Structure : [data | next]
 * 		Text / Linear Diagram : HEAD
 								 |
 								 v
								[10 | ] -> [20 | ] -> [30 | ] -> [40 | ] -> null
								
		Key Points :
			One-way traversal
			Less memory usage
			Deletion needs previous node reference
	
	2. Doubly Linked List (DLL)
		Definition :
			Each node contains previous, data, and next references.
			Traversal is both directions.
		
		Structure : [prev | data | next]
		Text / Linear Diagram : null <- [ | 10 | ] <-> [ | 20 | ] <-> [ | 30 | ] <-> [ | 40 | ] -> null
		
		Key Points:
			Two-way traversal
			Extra memory for prev
			Easier insertion & deletion
		
	3. Circular Singly Linked List (CSLL)
		Definition:
			Last node points back to the first node instead of null.
		Text / Linear Diagram:
								HEAD
								 |
								 v
								[10] -> [20] -> [30] -> [40]
								  ^                          |
								  |__________________________|
		Key Points:
			No null reference
			Useful in round-robin scheduling
			Continuous traversal
			
	4. Circular Doubly Linked List (CDLL)
		Definition:
			Both next and prev form a circular structure.
		Text / Linear Diagram:
								        <---------------------------------+
								        |                                 |
								[10] <-> [20] <-> [30] <-> [40]
								        |                                 |
								        +--------------------------------->
		Key Points:
			Bi-directional + circular
			Used in navigation systems
			Slightly complex but powerful
	5. Java LinkedList (Collection Framework)
		Important Note:
			Java’s LinkedList is implemented as a Doubly Linked List.
		Hierarchy:
					Iterable
					  |
					Collection
					  |
					List
					  |
					LinkedList
					
		Internal Representation:
									null <- [prev | data | next] <-> [prev | data | next] <-> null
									
									
	NOTE : 
			Quick Comparison (Memory Friendly)
				Singly        : data + next
				Doubly        : prev + data + next
				Circular      : no null at end
				Java LinkedList : Doubly Linked List
				
				
	The LinkedList class in java is a part of the collection framework and implements the list interface. Unlike an ArrayList, 
	which uses a dynamic array to store the elements, a LinkedList stores its elements an nodes in a doubly linkedList. This provides different 
	performance characteristics and usage scenarios compared to ArrayList.
	
 */

class Node{
	public int value;
	public Node next;	
}
public class linked_List_Class {
	public static void main(String[] args) {
		Node node1 = new Node();
		node1.value = 2;
		node1.next = null;
		
		/*
		 * If the Node is have more than 1 value then we have to create the object of the Node and insert the value into value variable.
		 * And after that we have to change the next value
		 * 
		 * Node node1 = new Node();
		 * Node node2 = new Node();
		 * Node node3 = new Node();
			node1.value = 2;
			node1.next = node2;
			node2.value = 4;
			node2.next = node3
			node3.value = 6;
			node3.next = null;
			
			Linear diagram : [2|]->[4|]->[6|]->null
		 */
	}
	

}
