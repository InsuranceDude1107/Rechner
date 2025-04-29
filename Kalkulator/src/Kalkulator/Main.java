package Kalkulator;

public class Main {
	public static void main(String[] args) {

		Matrix3x3 a = new Matrix3x3(1, 2, 3, 2, 4, 5, 3, 5, 6);
		Matrix3x3 b = new Matrix3x3(7, 2, 5, 1, 9, 6, 2, 4, 8);
		System.out.println(a);
		System.out.println(b);
		System.out.println(Matrixmodul.MatrixMultiplikation(a, b));
		System.out.println(Matrixmodul.MatrixAddition(a, b));

	}
}
