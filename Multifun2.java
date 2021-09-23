import java.util.Arrays;
import java.util.List;

public class Multifun2 {
    public static void main(String[] args)
    {
        List<Integer> numbers
            = Arrays.asList(11, 22, 33, 44,
                            55, 66, 77, 88,
                            99, 100);
 
        
            numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(e -> e * 2)
                .forEach(e -> System.out.println( e ) );
    }
}
