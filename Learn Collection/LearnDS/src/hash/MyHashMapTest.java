package hash;

public class MyHashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyHashMap<String, String> map = new MyHashMap<>();
		
		map.put("Mahesh","Kesari");
		map.put("Suresh","Lal");
		map.put("Ramesh","Kumar");
		map.put("Kamask","Dwi");
		map.put("Priya","Smith");
		map.put("Ram","Dsouza");
		map.put("Sumit","khan");
		
		System.out.println(map.get("Mahesh"));
		System.out.println(map.get("Suresh"));
		System.out.println(map.get("Ramesh"));
		System.out.println(map.get("Kamask"));
		System.out.println(map.get("Priya"));
		System.out.println(map.get("Ram"));
		System.out.println(map.get("Sumit"));
		
	}

}
