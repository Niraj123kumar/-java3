public class Car{
// TODO: Define instance variables (attributes):
String brand;
String model;
int year;
String color;
boolean isrunning ;


// TODO: Create a constructor that initializes all attributes
public Car(String brand,String model,int year,String color,boolean isrunning){
    this.brand = brand;
    this.model=model;
    this.year=year;
    this.color=color;
    this.isrunning= false;
}
// TODO: Create instance methods:
public void startengine(){
    if(!isrunning){
        isrunning = true;
        System.out.println(brand + " "+model + "engine stsrted.");
    }else {
        System.out.println(brand + " " + model +"engine is already is running." );
    }
}
public void stopEngine() {
        if (isrunning) {
            isrunning = false;
            System.out.println(brand + " " + model + " engine stopped.");
        } else {
            System.out.println(brand + " " + model + " engine is already off.");
        }
    }
public void displayInfo() {
        System.out.println("Car Information:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
        System.out.println("Is Running: " + isrunning);
        System.out.println("-----------------------");
    }
public int getAge(int currentYear) {
        return currentYear - year;
    }

// startEngine() sets isRunning to true, prints message
//sets isRunning to false, prints message // - stopEngine()
//displayInfo() prints all car information
// getAge() returns current year minus car year
public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Corolla", 2015, "White",false);
        Car car2 = new Car("Honda", "Civic", 2018, "Black",false);
        Car car3 = new Car("Tesla", "Model 3", 2022, "Red",false);
        
        car1.displayInfo();
        car1.startengine();
        car1.stopEngine();
        System.out.println("Age of " + car1.brand + ": " + car1.getAge(2025) + " years\n");

        car2.displayInfo();
        car2.startengine();
        System.out.println("Age of " + car2.brand + ": " + car2.getAge(2025) + " years\n");

        car3.displayInfo();
        car3.startengine();
        car3.stopEngine();
        System.out.println("Age of " + car3.brand + ": " + car3.getAge(2025) + " years\n");


// TODO: Create 3 different Car objects with different attributes
// TODO: Demonstrate calling methods on each object
// TODO: Show how each object maintains its own state
// TODO: Explain in comments: How is this similar to real-world

}
}
