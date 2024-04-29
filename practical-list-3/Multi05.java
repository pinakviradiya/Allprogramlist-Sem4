class Vehicle {
    void display() {
        System.out.println("This is a vehicle.");
    }
}

class Car extends Vehicle {
    void accelerate() {
        System.out.println("Car is accelerating.");
    }
}

class Bike extends Car {
    void speedUp() {
        System.out.println("Bike is speeding up.");
    }
}

public class Multi05 {
    public static void main(String[] args) {
        System.out.println("Pinak viradiya");
		System.out.println("220130318014");
        Bike b = new Bike();
        b.display();  
        b.accelerate(); 
        b.speedUp();    
    }
}
