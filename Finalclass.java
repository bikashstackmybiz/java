
final class Finalclass { 

     static void print() {
      System.out.println("Hello form class final class");
    }
  
 //class B extends Finalclass {     // cannot extend from final class
    public static void main(String [] args) {

      System.out.println("Hello form class final class");    
      Finalclass.print();   
      
    }
  }
