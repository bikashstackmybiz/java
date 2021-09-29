import java.util.Scanner;  

public class HashcodeExample {
        public static void main(String[] args) {  
          //Create integer object  
          Scanner readInput = new Scanner(System.in); 
          System.out.print("Enter the desired input value: ");  
                  
            Integer i = readInput.nextInt();  
            // Returned hash code value for this object   
            long hashValue = i.hashCode();  
            System.out.println("Hash code Value for object is: " + hashValue);  
            }  
    
    
}
