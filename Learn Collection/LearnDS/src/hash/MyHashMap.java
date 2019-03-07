package hash;

import java.util.ArrayList;

public class MyHashMap<K, V> {

	private final int DEFAULT_CAPACITY = 4;

	private int size;

	private ArrayList<Entry<K, V>> bucket;

	private double loadfactor = 0.75;

	private int CAPACITY;

	MyHashMap(double loadfactor) {
		super();
		this.loadfactor = loadfactor;
	}

	MyHashMap() {

		this.CAPACITY = DEFAULT_CAPACITY;
		this.bucket = new ArrayList<Entry<K, V>>(this.CAPACITY);
		for(int i=0; i< this.CAPACITY; i++) {
			this.bucket.add(null);
		}
	}

	public boolean put(K key, V val) {
		double size = (double) this.size;
		double currentLoadFactor =  (size+1)/this.CAPACITY;
		if (currentLoadFactor > loadfactor) {
			resize();
		}

		putVal(key, val);
		return true;
	}

	public V get(K key) {
		V val = null;

		int hash = Math.abs(key.hashCode());
		int index = hash % this.CAPACITY;

		Entry<K, V> node = this.bucket.get(index);

		while (node != null) {
			if (node.key == key) {
				 val = node.val ;
				return val;
			}
			node = node.next;
		}
		return val;
	}

	private void resize() {

		System.out.println("Resizing Bucket..");
		this.CAPACITY = 2 * this.CAPACITY;
		ArrayList<Entry<K, V>> temp = this.bucket;
		this.bucket = new ArrayList<Entry<K, V>>(this.CAPACITY);
		for(int i=0; i< this.CAPACITY; i++) {
			this.bucket.add(null);
			this.size = 0;
		}
		for (int i = 0; i < temp.size(); i++) {
			Entry<K, V> head = temp.get(i);
			while (head != null) {
				putVal(head.key, head.val);
				head= head.next;
			}
		}
	}

	private void putVal(K key, V val) {
		Entry<K, V> node = new Entry<>(key, val);

		int hash = Math.abs(key.hashCode());
		int index = hash % this.CAPACITY;

		Entry<K, V> head = this.bucket.get(index);
		Entry<K, V> lastNode = head;
		while (head != null) {
			if (head.key == key) {
				head.val = val;
				return;
			}
			lastNode = head;
			head = head.next;
		}
		if (lastNode != null) {
			lastNode.next = node;
			this.size++;
		} else {
			this.bucket.set(index, node);
			this.size++;
		}

	}

	private static class Entry<K, V> {

		private K key;
		private V val;
		private Entry<K, V> next;

		Entry(K key, V val) {
			this.key = key;
			this.val = val;
			this.next = null;

		}
	}
}
