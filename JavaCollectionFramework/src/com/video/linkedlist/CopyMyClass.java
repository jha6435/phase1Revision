package com.video.linkedlist;

class Node{
	int data;
	Node next;
}
class singlyLinkedList{
	private Node head;
	
	public boolean isEmpty() {
		return(head==null);
	}
	public void insertFirst(int data) {
		Node newNode=new Node();
		newNode.data=data;
		newNode.next=head;
		head=newNode;
	}
	public void printLinkedList() {
		Node current=head;
		while(current!=null) {
			System.out.println(current.data);
			current=current.next;
		}
	}
}
public class CopyMyClass {
public static void main(String[] args) {
	SinglyLinkedList li=new SinglyLinkedList();
li.insertFirst(70);
li.insertFirst(90);
li.insertFirst(100);

li.printLinkedList();
}
}
