interface Animal {
    void makeSound();
}


class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

public class MainP03 {
    public static void main(String[] args) {
        // Create an instance of the Dog class
        Dog myDog = new Dog();
        System.out.println("Pinak viradiya");
		System.out.println("220130318014");
        // Call the method defined in the Animal interface
        myDog.makeSound();
    }
}
