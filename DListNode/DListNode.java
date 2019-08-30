package dlistnode;

/**
 * @author George Dagis
 * @version 1.0
 * @since 2016-11-3
 */

public class DListNode<T> {

/**
 * A generic Node class
 */
	
    private static class Node<T> {
        private T data;
        private Node next;
        private Node prev;
        
        public Node(T data) {
            this.data = data;
        }

        public void displayNode() {
            System.out.printf(data + " ");
        }

        @Override
        public String toString() {
            return data.toString();
        }
    }
    
    public Node first = null;
    public Node last = null;
    
/**
 * Method to push node to front of list
 */
    
    public void addFirst(T data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            newNode.next = null;
            newNode.prev = null;
            first = newNode;
            last = newNode;
        }
        
        else {
            first.prev = newNode;
            newNode.next = first;
            newNode.prev = null;
            first = newNode;
        }
    }

/**
 * Checks to see if list is empty
 */
    
    public boolean isEmpty() {
        return (first == null);
    }

/**
 * Runs through list printing each node
 */
    
    public void displayList() {
        Node current = first;
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }

/**
 * Method to pop the first node in the list
 */
    
    public void removeFirst() {
        if (!isEmpty()) {
            Node temp = first;

	        if (first.next == null) {
	        	first = null;
	            last = null;
	        }
        
	        else {
	        	first = first.next;
	            first.prev = null;
	        }
	        System.out.println(temp.toString() + " is popped from the list");
        }
    }
    
/**
 * Method to pop the last node in the list
 */
    
    public void removeLast() {
        Node temp = last;

        if (!isEmpty()) {

            if (first.next == null) {
                first = null;
                last = null;
            }
            
            else {
                last = last.prev;
                last.next = null;
            }
        }
        System.out.println(temp.toString() + " is popped from the list");
    }

/**
 * Method to pop the third node in the list
 */
    
    public void removeThird() {
        Node temp = first.next.next;
        first.next.next = first.next.next.next;
        temp = null;
    }
    
/**
 * Method reverses list by swapping values
 */
    
    public void reverseList() {
    	Node temp = first;
    	first = last;
    	last = temp;
    	Node o = first;
    	
    	while(o!=null) {
    		temp = o.next;
    	    o.next = o.prev;
    	    o.prev = temp;
    	    o = o.next;
    	}
    }
}
