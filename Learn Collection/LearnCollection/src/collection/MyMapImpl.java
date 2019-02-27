package collection;

public class MyMapImpl {

	static MyMap<String, Integer> map =  new MyMap<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		map.put("hari", 1);
		map.put("ram", 2);
		map.put("krish", 3);
		map.put("hari", 4);
		map.put("komal" , 5);
		map.put("seeta", 6);
		map.put("Geeta", 7);
		map.put("Sita", 8);
		map.put("Gita", 9);
		map.put("Ramesh", 10);
		map.put("Suresh" , 11);
		map.put("Mahesh", 12);
		map.put("Rajesh", 13);
		map.put("Suri", 14);
		map.put("Priya", 15);
		map.put("Riya", 16);
		map.put("Maya" , 17);
		map.put("Nikol", 18);
		
		System.out.println(map.get("hari"));
		System.out.println(map.get("krish"));
		System.out.println(map.get("Ramesh"));
	}

}
