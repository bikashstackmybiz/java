import java.util.stream.IntStream;

public class SqureOfNumers {
    
    public static void main(String[] args) {
        IntStream.range(1, 11).map(e -> e*e).forEach(p -> System.out.println(p)); // from functional programing we print squares of frist 10 numbers
    }
}
