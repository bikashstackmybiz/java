import java.util.Scanner;  

public class HashcodeExample {
        public static void main(String[] args) {  
          System.out.print("Enter the desired input value: ");  
          Scanner readInput = new Scanner(System.in);    

            Integer i = readInput.nextInt();                  //Create integer object  
            readInput.close();
            Integer hashValue = i.hashCode();  

            System.out.println("Hash code Value for object is: " + hashValue);  
            }  
    
    
}
