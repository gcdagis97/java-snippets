package binarysearchtree;

/**
 * @author George Dagis
 * @version 1.0
 */

/*
 * Implements Michael Main's BTNode.java to create a BST and print its contents through inorder traversal.
 */

public class BTree {

	public static void main(String[] args) {
		
		//node 4
		//node 4 is rightChild2
		BTNode<Integer> rightChild2 = new BTNode<Integer>(4, null, null);
		
		//node 11
		//node 11 is leftChild2
		BTNode<Integer> leftChild2 = new BTNode<Integer>(11, null, null);
		
		//node 22
		//node 22 is leftChild3
		BTNode<Integer> leftChild3 = new BTNode<Integer>(22, null, null);
		
		//Build left subtree
		//3 now points to null and 4 (rightChild2) instead of null and null
		BTNode<Integer> leftChild = new BTNode<Integer>(1, null, null);
		BTNode<Integer> rightChild = new BTNode<Integer>(3, null, rightChild2);
		BTNode<Integer> leftParent = new BTNode<Integer>(2, leftChild, rightChild);		
		
		//Build right subtree
		//13 now points to 11 (leftChild2) and null instead of null and null
		//34 now points to 22 (leftChild3) and null instead of null and null
		leftChild = new BTNode<Integer>(13, leftChild2, null);	
		rightChild =  new BTNode<Integer>(34, leftChild3, null);	
		BTNode<Integer> rightParent = new BTNode<Integer>(21, leftChild, rightChild);
		
		//Attach both subtrees to root
		BTNode<Integer>root = new BTNode<Integer>(5, leftParent, rightParent);
		
		//Print Binary Search Tree
		System.out.println("Printing contents of binary search tree using in-order traversal:");
		root.inorderPrint(); 
		System.out.println();
	}
}