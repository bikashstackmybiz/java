public class Book {
    private int noOfCopies ;

    Book(int initialNoOfBook){
        this.noOfCopies = initialNoOfBook;
    }
   void setNoOfCopies(int number){  // seters
       if(number > 0){
       this.noOfCopies = number;
       }
   }
   int setNoOfCopies(){ //getter
     return this.noOfCopies;
    }
    public void increaseNo(int howMuch){  // method to increase no of book
        setNoOfCopies(this.noOfCopies+howMuch);
    }
    public void desreaseNo(int howMuch){  // method to decrease no of book
        setNoOfCopies(this.noOfCopies-howMuch);
    }
public static void main(String[] args) {
    
    Book physics = new Book(1000);
    Book computer = new Book(1000);
    Book math = new Book(1000);
     math.setNoOfCopies(-20);
     math.increaseNo(150);
     math.desreaseNo(20);
     System.out.println(math.setNoOfCopies());
     System.out.println(computer.setNoOfCopies());
}

}
