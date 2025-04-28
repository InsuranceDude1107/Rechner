package Kalkulator;

public class test {
	public static void main(String[] args) {
		
		Umrechnungsmodul ur = new Umrechnungsmodul();
		
		System.out.println(ur.fahrenheitZuCelsius(2));
		
		System.out.println(ur.celsiusZuFahrenheit(2));
		
		System.out.println(ur.euroZuDollar(27));
		
		System.out.println(ur.dollarZuEuro(5));
		
	}
}
