public class Person1 {
    private String name;
    private int age;
    

    
    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
        
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

    
    public void introduce() {
        System.out.println("Hello, my name is " + name + ", I am " + age + " years old ");
    }

    public static void main(String[] args) {
        System.out.println("Pinak viradiya");
		System.out.println("220130318014");

        Person1 person = new Person1("Prem ", 18);

       
        System.out.println("Original Person1:\n" +
                "Name: " + person.getName() + "\n" +
                "Age: " + person.getAge());

        
        person.setName("Pinak");
        person.setAge(18);
        

        // Calling the introduce method to print out the person's introduction message
        person.introduce();
    }
}