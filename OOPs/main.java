package OOPs;

public class main {

    static class Car {
        String company;
        String model;
        String color;
        int price;
        int topSpeed;
        int currentSpeed;
        boolean airbags;

        // Constructor Overloading
        Car(String company, String model, String color, int price, int topSpeed, int currentSpeed, boolean airbags) {
            this.company = company;
            this.model = model;
            this.color = color;
            this.price = price;
            this.topSpeed = topSpeed;
            this.currentSpeed = currentSpeed;
            this.airbags = airbags;
        }

        Car(String company, String model, String color, int price) {
            this.company = company;
            this.model = model;
            this.color = color;
            this.price = price;
        }

        void start() {
            System.out.println(company + " " + model + " started.");
        }

        void stop() {
            System.out.println(company + " " + model + " stopped.");
        }

        int currentSpeed() {
            return currentSpeed;
        }

        void print() {
            System.out.println("Company: " + company);
            System.out.println("Model: " + model);
            System.out.println("Color: " + color);
            System.out.println("Price: ₹" + price);
            System.out.println("Top Speed: " + topSpeed + " km/h");
            System.out.println("Current Speed: " + currentSpeed + " km/h");
            System.out.println("Airbags: " + (airbags ? "Yes" : "No"));
            System.out.println("--------------------------------");
        }

       
    }

    // Subclass: ElectricCar (Inheritance + Method Overriding)
    static class ElectricCar extends Car {
        int batteryCapacity;

        ElectricCar(String company, String model, String color, int price, int topSpeed, int currentSpeed, boolean airbags, int batteryCapacity) {
            super(company, model, color, price, topSpeed, currentSpeed, airbags);
            this.batteryCapacity = batteryCapacity;
        }

        // Method overriding: Polymorphism
        @Override
        void start() {
            System.out.println(company + " " + model + " (Electric) started silently.");
        }

        void chargeBattery() {
            System.out.println(model + " is charging. Battery Capacity: " + batteryCapacity + " kWh");
        }

        @Override
        void print() {
            super.print();
            System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
            System.out.println("--------------------------------");
        }
    }

    public static void main(String[] args) {
        // Creating a normal car
        Car car1 = new Car("Toyota", "Camry", "Red", 2500000, 220, 0, true);
        car1.start();
        car1.print();

        // Creating an electric car
        ElectricCar tesla = new ElectricCar("Tesla", "Model 3", "White", 4500000, 250, 0, true, 85);
        tesla.start();
        tesla.chargeBattery();
        tesla.print();


        // Polymorphism using parent class reference
        Car polyCar = new ElectricCar("MG", "ZS EV", "Blue", 3000000, 200, 0, true, 60);
        polyCar.start();  // Calls overridden method
        polyCar.print();  // Calls overridden print()
    }
}

