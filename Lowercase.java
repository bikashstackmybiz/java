import java.util.List;

public class Lowercase {
    public static void main(String[] args) {
        List.of("Apple", "Ant", "Bat").stream().map(e -> e.toLowerCase()).forEach(p -> System.out.println(p)); // make all character to lower case using functional programing
    }
}
