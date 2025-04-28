package Kalkulator;

public class Umrechnungsmodul {

	public double celsiusZuFahrenheit(double grad) {

		double fahrenheit = (grad * 9 / 5) + 32;

		return fahrenheit;
	}

	public double fahrenheitZuCelsius(double fahrenheit) {

		double celsius = (fahrenheit - 32) * 5 / 9;

		return celsius;
	}

	public double euroZuDollar(double euro) {

		double dollar = euro * 1.14 * 100;

		dollar = Math.round(dollar);

		dollar /= 100;

		return dollar;
	}

	public double dollarZuEuro(double dollar) {

		double euro = dollar * 0.88;

		euro = Math.round(euro * 100);

		euro /= 100;

		return euro;
	}
	// HAHAHAHAAH Geändert
}
