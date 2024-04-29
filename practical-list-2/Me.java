public class Me {
    private String name;
    private int age;

    // Default constructor
    public Me() {
        this.name = "Prem gohel";
        this.age = 18;
    }

    // Copy constructor
    public Me(Me other) {
        this.name = other.name;
        this.age = other.age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Me me1 = new Me();
        Me me2 = new Me(me1); // Using the copy constructor
        System.out.println("Pinak viradiya");
		System.out.println("220130318014");

        System.out.println("Me 1 - Name: " + me1.getName() + ", Age: " + me1.getAge());
        System.out.println("Me 2 - Name: " + me2.getName() + ", Age: " + me2.getAge());
    }
}