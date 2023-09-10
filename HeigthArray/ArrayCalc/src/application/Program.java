package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Locale.setDefault(Locale.US);
		System.out.println("Digite o tamanho do grupo de pessoas?");
		int n = sc.nextInt();
		double[] v = new double[n];
		System.out.println("Digite a altura destas pessoas");
		double media = 0;

		for (int i = 0; i < n; i++) {
			v[i] = sc.nextDouble();

			media += v[i];
		}

		media = media / n;

		System.out.printf("A media de altura entre elas é de: %.2f%n", media);
	}

}
