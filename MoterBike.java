public class MoterBike {
    void start(){
        System.out.println("Bike  has been Start");
    }
    void shiftGear(int gear){
        System.out.printf("The Bike is in gear no %d",gear).println();
    }
    
    public static void main(String[] args) {
        MoterBike honda = new MoterBike();
        MoterBike tvs = new MoterBike();
        honda.start();
        honda.shiftGear(5);
        
    }
}
