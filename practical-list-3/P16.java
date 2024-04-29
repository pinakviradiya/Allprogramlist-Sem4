class Person {

	private String Name;
	private int Age;
	public Person(String Name,int Age){
		this.Name = Name;
		this.Age = Age;
	}
	public String getName(){
		return Name;
	}
	public void setName(String Name){
		this.Name = Name;
	}
	public int getAge(){
		return Age;
	}
	public void setAge(int Age){
		this.Age = Age;
	}
	public String toString(){
		return"Person Name is :" + Name + " And Age is :" + Age;
	}
}
public class P16{
	public static void main(String args[]){
		Person p1 = new Person("Pinak",17);
		System.out.println(p1);
	}
}