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
		System.out.println("Ok, agora digite " + n + "números");
		double resultado = 0;
		double contador = 0;
		for(int i=0; i<n; i++) {
			contador = sc.nextDouble();
			if(contador > resultado) {
				resultado = contador;			
			}
			else {
				continue;
			}
			
		}
		System.out.println("O maior valor é " + resultado);

	}

}
