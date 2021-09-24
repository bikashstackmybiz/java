import java.util.List;
import java.util.stream.Collectors;

public class EvenNoOfList {
    public static void main(String[] args) {
       List <Integer> list =  List.of(5, 8, 9, 82, 67, 54, 67).stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
       System.out.println(list);
    }
}
