import java.util.List;

public class FunctionalSumOfElements {
    
    static List <Integer> list2 = List.of(4,2,5,6,7,8,9,3);
    public void sumElements(List <Integer> list2) {
        int s = list2.stream().reduce(0,(number1,number2)->number1+number2);
        System.out.println("sum of  all elements");
        System.out.println(s);
    }
    public void sumOfOddElements(List <Integer> list2) {
        int s = list2.stream().filter(Element->Element%2==1).reduce(0,(number1,number2)->number1+number2);
        System.out.println("sum of odd emements");
        System.out.println(s);
    }

    public static void main(String[] args) {
        FunctionalSumOfElements sumElements = new FunctionalSumOfElements();
        sumElements.sumElements(list2);
        sumElements.sumOfOddElements(list2);
    }
}
