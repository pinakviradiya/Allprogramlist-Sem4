package Person;
package Student;
class Person {

	private String Name;
	private int Age;
	public Person(String Name,int Age){
		this.Name = Name;
		this.Age = Age;
	}
	public String toString(){
		return "Name:"+Name+"Age:"+Age;
	}
}

import Person.Person;
public class Student extends Person{
	private int id;
	private String major;
	
	public Student(String Name,int Age,int id,String major){
		super(Name,Age);
		this.id = id;
		this.major = major;
	}
	public int getId(){
		return Id();
	}
	public void setId(int id){
		this.id = id;
	}
	public String getMajor(){
		return major();
	}
	public void setMajor(String major){
		this.major = major;
	}
	public String toString(){
		return super.toString()+"Id:"+ id + "Major" + major;
	}
}
package tester;
import Person.Person;
import Student.Student;
import Teachar.Teacher;

public class PackageTesterP17{
	public static void main(String[] args){
		Student s1 = new Student("Pinak",17,3425,"computer");
		Teacher t1 = new Teacher("Jay",30,"Mathemetics");
		Student.setId(2201);
		Student.setMajor("Physic");
		teacher.getSubject("Computer");
		
		System.out.println("Student"+student);
		System.out.println("Teacher"+teacher);
	}
}