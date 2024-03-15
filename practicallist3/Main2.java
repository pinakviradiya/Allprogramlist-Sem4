
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

class SportsCar extends Car {
    void speedUp() {
        System.out.println("Sports car is speeding up.");
    }
}

public class Main2 {
    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar();
        sportsCar.display();  
        sportsCar.accelerate(); 
        sportsCar.speedUp();    
    }
}
