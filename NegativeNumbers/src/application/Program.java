package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos numeros você vai digitar? , Por favor digite ao menos 1 número negativo");
		int n = sc.nextInt();
		int[] v = new int[n];
		System.out.println("Digite " + n + " números");
		boolean negativeOrnot = false;
		for (int i = 0; i < n; i++) {
			v[i] = sc.nextInt();
		}
		System.out.println("Números negativos:");
		for (int i = 0; i < n; i++) {

			if (v[i] < 0) {
				System.out.println(v[i]);
				negativeOrnot = true;

			}

		}
		if(negativeOrnot == false) 
		{
			System.out.println("Não existem números negativos");
		}

	}

}
