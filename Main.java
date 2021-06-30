package com.linkedList;

public class Main {

	public static void main(String[] args) {

		LinkedList linkedList = new LinkedList();
		LinkedList.Node previousNode =linkedList.insert(56);

		LinkedList.Node afterNode = linkedList.insert(70);
		linkedList.insertBefore(previousNode, afterNode, 30);
		linkedList.pop();
		
		System.out.println("-------------------");
		linkedList.popLast();
		linkedList.pop();
		linkedList.insert(56);
		LinkedList.Node beforeNode =linkedList.insert(30);
		LinkedList.Node nextNode=linkedList.insert(70);
		int searchValue = linkedList.search(70);
		System.out.println(searchValue);
		linkedList.insertBefore(beforeNode, nextNode, 40);
		 linkedList.deleteByKey(40);
		 System.out.println("-------------------");
		 linkedList.print();
		 int size = linkedList.size();
		 System.out.println(size);
		
		

		
	}

}
