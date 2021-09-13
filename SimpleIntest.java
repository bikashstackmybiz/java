import java.math.BigDecimal;

public class SimpleIntest {
	
	BigDecimal principal;
	BigDecimal intrest;
	public SimpleIntest(String principal, String intrest) {
		// TODO Auto-generated constructor stub
		this.principal=new BigDecimal(principal);
		this.intrest = new BigDecimal(intrest).divide(new BigDecimal(100));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleIntest calculator = new SimpleIntest("4500.00" , "7.5");
		BigDecimal totalValue = calculator.calculateTotalValue(5);
		System.out.println(totalValue);

	}

	private BigDecimal calculateTotalValue(int noOfYears ) {
		// TODO Auto-generated method stub
		BigDecimal noOfYearBigDecimal =new BigDecimal(noOfYears);
		
		 BigDecimal totalValue = principal.add(principal).multiply(intrest).multiply(noOfYearBigDecimal);
		
		return totalValue;
	}

}