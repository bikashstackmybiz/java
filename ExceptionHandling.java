public class ExceptionHandling {
    int a;
    int b;
    int c;
    
    public void method1() {
        try{
        int [] arr = {1, 4, 7, 3};
       int num = arr[4];
        System.out.println(num);
        } catch(ArithmeticException ex){
            System.out.println("this is wrong");
        } 
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("index is wrong on method 1");
        }
    }
    public void method2() {
        System.out.println("this is method 2");
        method1();
    }
    public static void main(String[] args) {
        ExceptionHandling except = new ExceptionHandling();
        except.method1();
    }
}
