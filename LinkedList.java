package com.linkedList;

public class LinkedList {

	Node head;
	Node tail;

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
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
		return newNode;
	}

	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	public void print() {
		Node temp = head;
		while (temp != null) {
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

	public void insertBefore(Node previousNode, Node afterNode, int value) {
		if (previousNode == null) {
			Node newNode = new Node(value);
			head = newNode;
			newNode.next = afterNode;
			print();
		}
		Node newNode = new Node(value);
		newNode.next = afterNode;
		previousNode.next = newNode;
		print();

	}

	public int pop() {
		int popData = 0;
		if (head == null) {
			System.out.println("List is empty Please add a element to use this method");
		}
		popData = head.data;
		head = head.next;
		return popData;
	}

	public void popLast() {

		Node temp = head;
		while (temp.next != tail)
			temp = temp.next;

		tail = temp;
		tail.next = null;
		print();

	}

	public int search(int value) {
		if (head == null) {
			System.out.println("List is Empty");
			return -1;
		}
		int index = 1;
		Node tempNode = head;
		while (tempNode != null) {
			if (tempNode.data == value) {
				break;
			}
			index++;
			tempNode = tempNode.next;
		}
		return index;
	}
	public void deleteByKey(int value) {
		Node temp = head;
		Node previous= null;
		if (temp != null && temp.data == value) {
            head = temp.next; // Changed head
            return;
        }
		while (temp != null && temp.data != value) {
            previous = temp;
            temp = temp.next;
        }
		 if (temp == null)
	            return;
		 previous.next = temp.next;
	}
	public int size() {
		int index = 1;
		Node temp = head;
		while (temp != tail) {
			index++;
			temp = temp.next;
		}
		return index ;
	}

}
