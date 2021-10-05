import java.util.HashMap;
import java.util.Map;


public class HashmapExample {
    Integer slno;
    String name;
    Integer employeeId;
    String email;
    String address;

    HashmapExample(String name, Integer employeeId, String email, String address) {
        this.name = name;
        this.employeeId = employeeId;
        this.email = email;
        this.address = address;
    }

    public static void main(String[] args) {

        Map<String, HashmapExample> employee = new HashMap<>();

        employee.put("bikash", new HashmapExample("bikash", 269, "bikashroshan000@gmail.com", "rajendra nagar"));
        employee.put("ravi", new HashmapExample("ravi", 2, "bkrprm@gamil.com", "chirondi"));
        employee.put("aksh", new HashmapExample("akash", 3, "askashsharma@gmail.com", "ranchi"));
        // for (HashmapExample value: employee.values()) {
        //     System.out.println(value);
        // }    
        employee.values().stream().forEach(e -> System.out.println(e));
    }

}
