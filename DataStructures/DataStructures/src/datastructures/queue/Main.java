package datastructures.queue;

public class Main {

	public static void main(String[] args) {

		
		Queue myQueue = new Queue(7);
		
		myQueue.enqueue(2);
		System.out.println(myQueue.dequeue().value);
		System.out.println(myQueue.dequeue().value);
		System.out.println(myQueue.dequeue());
//		myQueue.getFirst();
//		myQueue.getLast();
//		myQueue.getLength();
		//myQueue.printList();
	}

}
