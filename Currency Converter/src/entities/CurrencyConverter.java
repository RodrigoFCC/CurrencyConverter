package entities;

public class CurrencyConverter {
	
	private static double dollarValue = 5.37;
	private static double euroValue = 5.41;
	private static double japaneseYenValue = 0.037;
	
	public static double conversor(int currency, double quantity) {
		double converter = 0;
		if(currency == 1) {
			converter = dollarValue * quantity;
		} else if (currency == 2) {
			converter = euroValue * quantity; 
		} else if (currency == 3) {
			converter = japaneseYenValue * quantity;
		}
		
		return converter;
	}

}
