package com.video.linkedlist;

class Node
{
	public int data;
	public Node next;
}
class SinglyLinkedList
{
	private Node head;
	public boolean isEmpty() {
		return(head==null);
	}
	public void insertFirst(int data) {
		Node newNode= new Node();
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
public class MyClass {

	public static void main(String[] args) {
		
SinglyLinkedList list=new SinglyLinkedList();
list.insertFirst(45);
list.insertFirst(65);
list.insertFirst(90);

list.printLinkedList();
	}

}
