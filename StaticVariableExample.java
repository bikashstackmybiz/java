public class StaticVariableExample {
    private static int number = 0;

     StaticVariableExample (int a){
    this.number = a;
    }

    public void method1 () {
        System.out.println("value of number is "+ number);
    }
    public void method2() {
        System.out.println("the value of number is" + number);
    }

public static void main(String[] args) {
    StaticVariableExample obj1 = new StaticVariableExample(8);
    StaticVariableExample obj2 = new StaticVariableExample(10);
    obj1.method1();
}
}
