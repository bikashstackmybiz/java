import java.lang.reflect.Method;
import java.util.List;

public class FunctionalPrograming {
    static List<String> list = List.of("apple","mango","banana","cat");

    public void printSmply(List<String> list){ 
             // simple method too print all element of list
             System.out.println("simple method too print all element of list");
        for(String str:list){
            System.out.println(str);
        }
    }
    public void printWithFunctionalPrograming(List<String> list) {    
          // print all the emlemt of a list with functional programing
          System.out.println("print all the emlemt of a list with functional programing");
        list.stream().forEach(element -> System.out.println(element));  //this is called lemda expession
    }
    public void printWithFunctionalProgramingFilter(List<String> list) {        // with filter
        list.stream().filter(element -> element.endsWith("le")).forEach(element -> System.out.println(element));

    }

    public static void main(String[] args) {
        FunctionalPrograming obj = new FunctionalPrograming();
        obj.printWithFunctionalProgramingFilter(list);
    }
}
