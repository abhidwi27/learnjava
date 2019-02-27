package ser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class LearnSer {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		Person p = new Person("Abhishek", 26, "KA");
		//Serialize
		File f = new File("C:\\Sample.ser");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream os = new ObjectOutputStream(fos);
		
		os.writeObject(p);
		System.out.println("Object written into memory..");
		
		// Deserialize
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Person o1 = (Person) ois.readObject();
		System.out.println(o1.getAge());
		System.out.println(o1.address);
		
		
	}
	
	

}

class Person implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String name;
	transient String address = "KA"; 
	private int age;
	
	Person(String name, int age, String address){
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}