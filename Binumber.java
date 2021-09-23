public class Binumber {
    private int number1;
    private int number2;

    int getNumber1(){
       return this.number1;
    }
    int getNumber2(){
        return this.number2;
    }
    Binumber(int number1 , int number2){
        this.number1 = number1;
        this.number2 = number2;
    }
    int add(){
        int sumOfNumber = this.number1 + this.number2;
        return sumOfNumber;
    }
    int multiply(){
        int multiplyOfNumber = this.number1 * this.number2;
        return multiplyOfNumber;
    }
    void dubble(){
        this.number1 = number1 * 2;
        this.number2 = number2 * 2;

    }
    public static void main(String[] args) {
        
        Binumber numbers = new Binumber(2,3);
        System.out.println(numbers.add());
        System.out.println(numbers.multiply());
        numbers.dubble();
        System.out.println(numbers.getNumber1());
        System.out.println(numbers.getNumber2());

    }
}
