package com.linkedList;

public class LinkedList {

	Node head ;
	
	class Node {
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	
	public Node insert(int data) {
		
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		}
		else {
			Node temp = head;
			while(temp.next!= null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
		return newNode;
	}
	
	public void push(int data) {
		Node newNode = new Node (data);
		 newNode.next = head;
		head = newNode;
	}
	
	public void print() {
		Node temp = head ;
		while(temp != null) {
			System.out.println(temp.data + " -> ");
		temp = temp.next;
		}
	}
	
	public void insertAfter(Node prevNode, int value) {

		if (prevNode == null) {
		System.out.println("Prev Node should not be null");
		return;
		}
		Node newNode = new Node(value);
		newNode.next = prevNode.next;
		prevNode.next = newNode;

		print();
		}
	
	public void insertBefore(Node previousNode ,Node afterNode , int value) {
		if (afterNode == null) {
			System.out.println(" To use insertBefore you have to have a last node");
			return;
		}
		Node newNode = new Node(value);
		newNode.next = afterNode;
		previousNode.next = newNode;
		print();
		
		
	}
}
