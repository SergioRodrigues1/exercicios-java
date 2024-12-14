import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numFunc = sc.nextInt();
		int horas = sc.nextInt();
		double valor = sc.nextDouble();
		
		double salario = horas * valor;
		
		System.out.println("Número = " + numFunc);
		System.out.printf("Salário = R$ %.2f%n", salario);
		
		sc.close();

	}

}
