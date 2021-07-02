package com.linkedList;

import com.linkedList.LinkedList.*;

public class Queue {

	Node head, rear;

	class Node {
		
		Node next;
		int data;
		

		public Node(int data) {

			this.next = null;
			this.data = data;

		}
	}

	public Node enqueue(int data) {
		Node newNode = new Node(data);
		if (head == null && rear == null) {
			head = rear = newNode;
		} else {
			Node temp = rear;
			while (temp.next != null) {
				temp = rear.next;
			}
			temp.next = newNode;
		}
		return newNode;
	}

	public void dequeue() {
		int popData = 0;
		if (head == null && rear == null) {
			System.out.println("queue is empty");
		}
		popData = head.data;
		head = head.next;
	}

	public void print() {
		Node temp = head;
		if (temp == null) {
			System.out.println("queue is empty");
		}
		while (temp != null) {
			System.out.println(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println();
	}

}
