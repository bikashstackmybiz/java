import java.util.List;

public class LenthOfElement {
    public static void main(String[] args) {
        List.of("Apple","Ant","Bat").stream().map(e->e.length()).forEach(p->System.out.println(p)); // count the lenth of word from functional programing 
    }
}
