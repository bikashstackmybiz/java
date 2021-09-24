import java.util.Scanner;

public class MultiplicationTable {
	 int i ;
	
	void printTable () {
		
			Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the number to print table");
		int number = sc.nextInt();
		
		for ( i =1; i <= 10 ; i++) {
			 System.out.printf("%d *  %d = %d",number, i, number * i).println();
		}
	}
	public static void main(String[] args) {
		MultiplicationTable multi = new MultiplicationTable();
		multi.printTable();
	}

}
