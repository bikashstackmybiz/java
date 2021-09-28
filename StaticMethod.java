public class StaticMethod {
    int num1 = 3;
    public int num2 = 5;
    static int num3 = 6;

    static void printExampleOfStatic(){
       // System.out.println("this is example of static method"+num1);
       // System.out.println("this is example of static method"+num2);  ( both are wrong beacouse we have to use static variable in static  method)

        System.out.println("this is example of static method" + num3);

    }
    public static void main(String[] args) {
        StaticMethod.printExampleOfStatic();   // static method can be used with clas  also
        StaticMethod obj = new StaticMethod();
        obj.printExampleOfStatic();    /// and static method can be used with object also and with object also
    }
}
