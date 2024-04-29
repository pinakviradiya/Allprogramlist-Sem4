import java.util.*;
class Person{
	private String name;
	private String address;
	private	int age;
	
	
public Person(String name, int age, String address) {
	this.name    = name;
	this.age     = age;
	this.address = address;
}

public String getName(){
	return name;
}

public void setName(String name){
	this.name = name;
}

public int getAge(){
	return age;
}

public void setAge(int age){
	this.age = age;
}

public String getAddress(){
	return address;
}

public void setAddress(String address){
	this.address = address;
}

public void introduce(){
	System.out.print("My name is "+ name +", I am "+ age +" Years old and I live at "+ address +".");
}

public static void main(String args[])	{
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Pinak viradiya");
		System.out.println("220130318014");
	
        
        System.out.print("Please enter the name: ");
        String nameInput = scanner.nextLine();
        
        System.out.print("Please enter the age: ");
        int ageInput = Integer.parseInt(scanner.nextLine());
        
        System.out.print("Please enter the address: ");
        String addressInput = scanner.nextLine();

        Person person = new Person(nameInput, ageInput, addressInput);
        person.introduce();

        scanner.close();
    }
}

	