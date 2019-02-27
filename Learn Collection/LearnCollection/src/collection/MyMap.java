package collection;

public class MyMap<K, V> {
	
	private static final int DEFAULT_CAPACITY = 16;
	
	private Entry<K, V>[] table ; 
	
	@SuppressWarnings("unchecked")
	MyMap(){
		table = (Entry<K, V>[]) new Entry[DEFAULT_CAPACITY];
	}
	public boolean put(K key, V val){
		Entry<K, V> newEntry = new Entry<>(key, val, null);
		int index = Math.abs(newEntry.hash % DEFAULT_CAPACITY);
		if(table[index] == null){
			table[index] = newEntry;
		}else{
			Entry<K, V> entry = table[index];
			while ( entry!=null & entry.next != null ){
				if(entry.key.equals(key)){
					entry.val = val;
					return true;
				}else{
						entry = entry.next;
				}
			}
			if(entry.key.equals(key)){
				entry.val = val;
				return true;
			}else{
				entry.next = newEntry;
			}
		}
		
		return true;
	}
	
	public V get(K key){
		int index = Math.abs(key.hashCode() % DEFAULT_CAPACITY);
		Entry<K, V> entry = table[index];
		while( entry !=null && entry.next != null){
			if(entry.key.equals(key)){
				return entry.val;				
			}else{
				entry = entry.next;
			}
		}
		if(entry.key.equals(key)){
			return entry.val;				
		}else{
			return null;
		}	
		
		
	}
	
	/*private void putVal(int index, Entry<K, V> e){
		
	}*/
	
	private static class Entry<K, V>{
		private int hash;
		private K key;
		private V val;
		
		private Entry<K, V> next;
		
		Entry(K key , V val, Entry<K, V> next ){
			this.key = key;
			this.val = val;
			this.next = next;
			this.hash = key.hashCode();
		}
	}

}
