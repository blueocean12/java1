class Accounting{
	public static double valueofsupply;
	public static double vatRate;
	public static double expenseRate;
	
	public static void print(double vat, double total, double expense, double income, double dividend2,
			double dividend3) {
		System.out.println("Value of supply : " + valueofsupply);
		System.out.println("VAT : " + getVAT());
		System.out.println("Total : " + getTotal());
		System.out.println("Expense : " + getExpense());
		System.out.println("Income : " + getIncome());
		System.out.println("Dividend : " + getDividend1() );
		System.out.println("Dividend : " + getDividend2() );
		System.out.println("Dividend : " + getDividend3() );
	}

	public static double getDividend1() {
		return getIncome()* 0.5;
	}
	public static double getDividend2() {
		return getIncome()* 0.3;
	}
	public static double getDividend3() {
		return getIncome()* 0.2;
	}

	public static double getIncome() {
		return valueofsupply - getExpense();
	}

	public static double getExpense() {
		return valueofsupply*expenseRate;
	}

	private static double getTotal() {
		return valueofsupply + getVAT();
	}

	private static double getVAT() {
		return valueofsupply * vatRate;
	}

}

	
}
public class AccountingClassApp {
	
	public static void main(String[] args) {
		
		Accounting.valueofsupply = 10000.0;
		Accounting.vatRate = 0.1;
		Accounting.expenseRate = 0.3;
		Accounting.print();

		
		
		//anotherVariable
	}
		
		 
	}

	