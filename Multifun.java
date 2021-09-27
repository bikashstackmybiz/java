import java.util.Arrays;
import java.util.List;
public class Multifun { 
      public static void main(String[] args)
    {
        List<Integer> numbers
            = Arrays.asList(11, 22, 33, 44,
                            55, 66, 77, 88,
                            99, 100);
 
    
        numbers.forEach(number      // Internal iterator usinf functional programing or lemda function
                        -> System.out.print(
                            number + " "));
    }
}