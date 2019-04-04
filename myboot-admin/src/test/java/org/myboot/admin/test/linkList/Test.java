package org.myboot.admin.test.linkList;

public class Test {

	/**
	 * 测试
	 * @param args
	 */
	public static void main(String[] args){
		
		MyLinkedList myList = new MyLinkedList();
		myList.addNode(30);
		myList.addNode(20);
		myList.addNode(40);
		myList.addNode(50);
		myList.addNode(10);
		myList.addNode(60);
		myList.addNode(70);
		myList.addNode(80);
		myList.addNode(9);
		myList.printLink();
		System.out.println(myList.linkSort().data);
		
		System.out.println(myList.findReverNode(2).data);
		
		myList.reserveLink();
		myList.printLink();
	}
}
