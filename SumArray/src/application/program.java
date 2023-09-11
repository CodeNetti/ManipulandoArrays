package application;

import java.util.Locale;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double sum = 0;
		Locale.setDefault(Locale.US);
		System.out.println("Digite quantos números você deseja somar");
		int n = sc.nextInt();
		double[] v = new double[n];
		System.out.println("Digite " + n + " números");

		for (int i = 0; i < n; i++) {
			v[i] = sc.nextDouble();

		}
		System.out.print("Valores digitados = ");
		for (int i = 0; i < n; i++) {
			System.out.print(v[i]);
			System.out.print(" ");
			sum += v[i];

		}
		System.out.println("");
		System.out.println("Soma = " + sum);
		System.out.println("Media = " + sum / n);

	}

}
