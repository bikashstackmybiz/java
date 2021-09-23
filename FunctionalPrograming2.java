import java.util.List;

public class FunctionalPrograming2 {
    static List <Integer> list2 = List.of( 4, 2 , 5, 6, 7, 8, 9, 3);
    public void evenPrint(List<Integer>list2) {
        list2.stream().filter(Element->Element%2==0).forEach(Element->System.out.println(Element));
    }
    public void oddPrint(List<Integer>list2) {
        list2.stream().filter(Element->Element%2==1).forEach(Element->System.out.println(Element));
    }
    public static void main(String[] args) {
        FunctionalPrograming2 obj2 = new FunctionalPrograming2();
        obj2.evenPrint(list2);
        obj2.oddPrint(list2);
    }
    
}
