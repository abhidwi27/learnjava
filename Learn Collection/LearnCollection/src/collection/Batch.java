package collection;

import java.util.ArrayList;
import java.util.List;

public class Batch {
	private List<Object> students;
	
	public Batch(){
		this.students = new ArrayList<>();
	}
	
	
	private class Student{
		private String name;
		private int id;
		
		Student(String name, int id){
			this.name = name;
			this.id = id;
		}
		
		@Override
		public String toString(){
			return this.name + " " + this.id;
		}
	}

	public List<Object> getStudents() {
		return students;
	}

	public void setStudents(List<Object> students) {
		this.students = students;
	}

	public void addStudent(String name, int id){
		Student s = this.new Student(name, id);
		students.add(s);
		
	}
	
	
		
		
	
}
