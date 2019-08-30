package queuedemo;

public class Queue {
	
	private int maxSize;
	private long[] queArray;
	private int front;
	private int back;
	private int nItems;

/**
 * Queue class contains a front and back, as well as a size.	   
 * @param s
 */
	
	public Queue(int s) {
		maxSize = s;
	    queArray = new long[maxSize];
	    front = 0;
	    back = -1;
	    nItems = 0;
	}
	   
/**
 * Method removes a value from queue from the back.
 * Compares items in queue with size to determine if there is an overflow or not.
 */
	   
	public void enqueue(long j) {
		if(back == maxSize-1)
			back = -1;
		
		queArray[++back] = j;
	    nItems++;
	    System.out.printf("%d has been enqueueed.%n", j);
		
	    if( nItems > maxSize) {
	    	System.out.println("Queue overflow!!");
			nItems++;
		}
	}
	   
/**
* Method adds a value to the front of the queue.
* Compares items in queue with size to determine if there is an underflow or not.
*/
	   
	public long dequeue() {
		long temp = queArray[front++];
		if(front == maxSize)
			front = 0;
		nItems--;
		System.out.printf("Dequeue operation performed!%n");

		if( nItems <0) {
			System.out.println("Queue underflow!!");
		    nItems++;
	    }
		return temp;
	}
	   
/**
 * Checks whether or not the queue is empty by checking the number of items in the queue.
 */
	   
	public boolean isEmpty() {
	   	System.out.println("Your queue is empty!");
	   	return (nItems==0);
   }
}
