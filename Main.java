package com.linkedList;

public class Main {

	public static void main(String[] args) {

		LinkedList linkedList = new LinkedList();
		LinkedList.Node previousNode = linkedList.insert(56);

		LinkedList.Node afterNode = linkedList.insert(70);
		linkedList.insertBefore(previousNode, afterNode, 30);

		
	}

}
