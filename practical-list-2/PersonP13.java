public class PersonP13 {
    private String name;
    private int age;
    private String address;
    public PersonP13(String name, int age, String address) {
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
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void introduce() {
        System.out.printf("Hi, my name is " + name + " I am " + age + "years old and I live at "+ address +".");
    }
    public static void main(String[] args) {
        System.out.println("Pinak viradiya");
		System.out.println("220130318014");
        PersonP13 person = new PersonP13("Jack hanma", 50, "Tokyo");
        person.introduce();
    }
}
