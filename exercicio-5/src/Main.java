import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo = sc.nextInt();
		int peca = sc.nextInt();
		double valor = sc.nextDouble();
		
		int codigo2 = sc.nextInt();
		int peca2 = sc.nextInt();
		double valor2 = sc.nextDouble();
		
		double valorPagar = (peca * valor) + (peca2 * valor2);
		
		System.out.printf("Valor a pagar = %.2f%n", valorPagar);
		
		sc.close();

	}

}
