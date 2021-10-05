class Car{
    String modelName;
    int age;
}
class Driver{
    String name;
    int driverAge;
    Car car;

     
}

public class AggressionExample {
    public static void main(String[] args) {
        Driver driver = new Driver();
        driver.name = "rahul";
        driver.driverAge = 30;
        Car c = new Car();  // new objeect of car class has been created
        driver.car = c;    // same refrence adress of both car object
        // driver = null ;    // the car object will not go in garbage collector when we put driver object in garbage collector
    }
}
