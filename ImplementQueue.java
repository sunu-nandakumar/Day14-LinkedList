package com.linkedList;

public class ImplementQueue {

	public static void main(String[] args) {
		Queue queue=new Queue();
		queue.enqueue(56);
		queue.enqueue(30);
		queue.enqueue(70);
		queue.print();
		queue.dequeue();
		queue.print();

	}

}
