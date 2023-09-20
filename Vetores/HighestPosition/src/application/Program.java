package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Vamos calcular quaal é o maior número dentro do vetor");
		System.out.println("Quantos números deseja digitar");
		int n = sc.nextInt();
		System.out.println("Ok, agora digite " + n + " números");
		double result = 0;
		int position = 0;
		double[] v = new double[n];
		for (int i = 0; i < n; i++) {
			v[i] = sc.nextDouble();
		}
		for (int i = 0; i < n; i++) {
			if (v[i] > result) {
               result = v[i];
               position = i;
			}
			else {
				continue;
			}
		}
		System.out.println("O maior valor é " + result);
        System.out.println("O maior valor esta na posição " + position + " do vetor" );
	}

}
