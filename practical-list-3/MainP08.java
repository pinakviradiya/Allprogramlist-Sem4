interface P1 {
    int CONSTANT_P1 = 10;
    void methodP1();
}

interface P2 {
    int CONSTANT_P2 = 20;
    void methodP2();
}

// Define the interface P12 inheriting from P1 and P2
interface P12 extends P1, P2 {
    void methodP12(); 
}

// Implement the interface P12 in class Q
class Q implements P12 {
   
    public void methodP1() {
        System.out.println("Method from P1");
    }

    
    public void methodP2() {
        System.out.println("Method from P2");
    }

    
    public void methodP12() {
        System.out.println("Method from P12");
    }
}

// Main class to test interface inheritance
public class MainP08{
    public static void main(String[] args) {
        Q q = new Q();
        q.methodP1(); 
        q.methodP2(); 
        q.methodP12(); 
        System.out.println("Pinak viradiya");
		System.out.println("220130318014");
        System.out.println("Constant from P1: " + P1.CONSTANT_P1); // Output: Constant from P1: 10
        System.out.println("Constant from P2: " + P2.CONSTANT_P2); // Output: Constant from P2: 20
    }
}
