package datastructures.doublylinkedlist;

public class Main {

	public static void main(String[] args) {
		
		DoublyLinkedList myDll = new DoublyLinkedList(7);
		
		myDll.append(2);
		myDll.append(3);
		myDll.append(5);
		//myDll.prepend(1);
//		System.out.println(myDll.removeLast().value);
//		System.out.println(myDll.removeLast().value);
//		System.out.println(myDll.removeLast());
		
//		System.out.println(myDll.get(1).value);
//		System.out.println(myDll.get(2).value + "\n");
		//System.out.println(myDll.removeFirst().value);
		//System.out.println(myDll.removeFirst().value);
		//System.out.println(myDll.removeFirst());
//		myDll.getHead();
//		myDll.getTail();
//		myDll.getLength();
		
		myDll.insert(2, 6);
		myDll.remove(4);
		myDll.set(1, 4);
		myDll.printList();

	}

}
