import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		double pi = 3.14159;
		
		double triangulo = A * C / 2.0;
		double circulo = pi * C * C;
		double trapezio = (A + B) / 2.0 * C;
		double quadrado = B * B;
		double retangulo = A * B;
	
		
		System.out.printf("Triangulo = %.3f%n", triangulo);
		System.out.printf("Circulo = %.3f%n", circulo);
		System.out.printf("Trapezio = %.3f%n", trapezio);
		System.out.printf("Quadrado = %.3f%n", quadrado);
		System.out.printf("Retangulo = %.3f%n", retangulo);
		
		sc.close();

	}

}
