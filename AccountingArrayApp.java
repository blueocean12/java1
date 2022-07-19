
public class AccountingArrayApp {

	public static void main(String[] args) {
		
		double valueofsupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = valueofsupply * vatRate;
		double total = valueofsupply + vat;
		double expense = valueofsupply*expenseRate;
		double income = valueofsupply - expense ;
		
		
		//변수가 많아질수록 오류가 날 확률이높다, 서로 연관되어있는지확인 불가능 -> 배열 사용
		
		double[] dividendRates = new double[3];
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;
		
		
		double dividend1 = (income) * dividendRates[0];
		double dividend2 = (income) * dividendRates[1];
		double dividend3 = (income) * dividendRates[2];

		System.out.println("Value of supply : " + valueofsupply);
		System.out.println("VAT : " + vat);
		System.out.println("Total : " +total);
		System.out.println("Expense : " + expense);
		System.out.println("Income : " + income);
		System.out.println("Dividend : " + dividend1 );
		System.out.println("Dividend : " + dividend2 );
		System.out.println("Dividend : " + dividend3 );
		
		
		
		
	}

}
