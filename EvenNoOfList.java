import java.util.List;

public class EvenNoOfList {
    public static void main(String[] args) {
       List.of(5, 8, 9, 82, 67, 54, 67).stream().filter(e -> e % 2 == 0).forEach(e -> System.out.println(e));
    }
}
