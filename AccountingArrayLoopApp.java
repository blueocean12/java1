
public class AccountingArrayLoopApp {

	public static void main(String[] args) {
		
		double valueofsupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = valueofsupply * vatRate;
		double total = valueofsupply + vat;
		double expense = valueofsupply*expenseRate;
		double income = valueofsupply - expense ;
		
		
		//변수가 많아질수록 오류가 날 확률이높다 -> 배열 사용
		
		double[] dividendRates = new double[3];
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;
		
		
		

		System.out.println("Value of supply : " + valueofsupply);
		System.out.println("VAT : " + vat);
		System.out.println("Total : " +total);
		System.out.println("Expense : " + expense);
		System.out.println("Income : " + income);
		
		double dividend1 = (income) * dividendRates[0];
		double dividend2 = (income) * dividendRates[1];
		double dividend3 = (income) * dividendRates[2];
		
		int i= 0;
		while(i < dividendRates.length) {
			System.out.println("Dividend  : " + income * dividendRates[i] );
			i = i + 1;
		}
		
		
		
		
	}

}
