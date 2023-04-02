package datastructures.linkedlist;

public class Main {

	public static void main(String[] args) {
		
		LinkedList myLinkedList = new LinkedList(4); //runs the constructor and assigns the value 4

		myLinkedList.append(2);
		myLinkedList.append(3);
		myLinkedList.append(5);
		
		//This will remove 2
//		System.out.println(myLinkedList.removeLast().value);
		
		//This will remove 4
		//System.out.println(myLinkedList.removeLast().value);
		
		//This will return null
		//System.out.println(myLinkedList.removeLast());
//		myLinkedList.getHead();
//		
//		myLinkedList.getTail();
//		
//		myLinkedList.getLength();
//		
//		myLinkedList.prepend(1);
		
		//This will remove 4
		//System.out.println(myLinkedList.removeFirst().value);
		
		//This will remove 2
		//System.out.println(myLinkedList.removeFirst().value);
		
		//This will return null
		//System.out.println(myLinkedList.removeFirst());
		
		//System.out.println(myLinkedList.get(2).value);
		
		//myLinkedList.set(1, 10);
		
		//myLinkedList.insert(2, 15);
		
		//myLinkedList.remove(2);
		myLinkedList.reverse();
		myLinkedList.printList();
	}

}
