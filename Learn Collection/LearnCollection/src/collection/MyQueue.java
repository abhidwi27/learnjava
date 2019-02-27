package collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class MyQueue<T> {
	
	private int size;
	private Node<T> head;
	private Node<T> tail;
	
	
	
	public boolean add(T t){
		if(size == 0){
			head = new Node<>(t, null);
			head.data = t;
			head.nextNode = null;
			tail = head;
			
		}else{
			Node<T> newNode = new Node<>(t, null);;
			newNode.data = t;
			newNode.nextNode = null;
			
			if(size == 1){
				head.nextNode = tail;
			}
			tail.nextNode = newNode;
			tail = newNode;
		}
		size++;
		return false;
	}

	public T poll(){
		T result = (T) head.data;
		head = head.nextNode;		
		return result;
	}
	
	public T peek(){
		return head.data;
	}
	
	public T remove() throws MyQueueException{
		if(size == 0){
			throw new MyQueueException("Queue is empty..");
		}
		return poll();
	}
	
	private static class Node<E>{
		private E data;
		private Node<E> nextNode;
		//private Node<E> prevNode;
		
		Node(E data, Node<E> nextNode){
			this.data = data;
			this.nextNode = nextNode;
		}
		
	}
	
	private <Z extends P, P> Z copyElements(Z a, P p) {
		return a;
        
    }
}