// Define two interfaces
interface A {
    void methodA();
}

interface B {
    void methodB();
}

// Implement the interfaces in a class
class MyClass implements A, B {
    
    public void methodA() {
        System.out.println("Method A implementation");
    }

    
    public void methodB() {
        System.out.println("Method B implementation");
    }
}


public class InterfaceP07{
    public static void main(String[] args) {
        MyClass myObject = new MyClass();
        System.out.println("Pinak viradiya");
		System.out.println("220130318014");
        myObject.methodA(); // Output: Method A implementation
        myObject.methodB(); // Output: Method B implementation
    }
}
