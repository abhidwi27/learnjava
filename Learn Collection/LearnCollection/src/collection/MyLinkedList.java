package collection;

public class MyLinkedList<E> {

	private Node<E> head;
	private Node<E> tail;
	private int size;

	public void add(E e) {
		Node<E> newNode = new Node<E>(e, null, null);
		if (size == 0) {
			head = newNode;
			tail = head;

		} else {
			tail.next = newNode;
			tail = newNode;
		}
		size++;
	}

	public E get(int index) {
		if (index < 0 || index > size) {
			return null;
		} else {
			Node<E> result = head;
			for (int i = 0; i < index; i++) {
				result = result.next;
			}
			return result.data;
		}

	}

	private static class Node<E> {

		private E data;
		private Node<E> next;
		private Node<E> priv;

		Node(E data, Node<E> next, Node<E> priv) {
			this.data = data;
			this.next = next;
			this.priv = priv;
		}
	}

}
