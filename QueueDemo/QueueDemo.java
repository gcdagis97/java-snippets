package queuedemo;

/**
 * @author George Dagis
 * @since 12-3-16
 * @version 1.0
 */

/*
 *  Demonstrate Queue.Java by enqueing / dequeing
 */

public class QueueDemo {

/**
 * Integer values are enqueued/dequeued to a queue.
 * Program states whether or not there is a queue underflow or a queue underflow.	
 * @param args
 */
	
	 public static void main(String[] args) {

		 Queue QueueDemo = new Queue(4);
		 QueueDemo.dequeue();
		 QueueDemo.enqueue(23);
		 QueueDemo.enqueue(2);
		 QueueDemo.enqueue(73);
	     QueueDemo.enqueue(21);
	     QueueDemo.dequeue();
	     QueueDemo.dequeue();
	     QueueDemo.dequeue();
	     QueueDemo.dequeue();
    
/**
 * Prints status of queue.
 */

     	while(!QueueDemo.isEmpty()) {    	 
     		long n = QueueDemo.dequeue();
     		System.out.print(n);
     		System.out.print(" ");
     	} 
     }
}
