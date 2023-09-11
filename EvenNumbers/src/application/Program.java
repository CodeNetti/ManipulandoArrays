package application;

import java.util.Locale;
import java.util.Scanner;



public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.println("Vamos verificar quais numeros que você digitar vão ser pares");
		int n = sc.nextInt();
		int v[] = new int[n];

		System.out.println("Digite os números");
		
		for (int i = 0; i < n; i++) {
			v[i] = sc.nextInt();
		}
		int result = 0;
		System.out.println("Números Pares: ");
		Boolean evenOrnot = false;
		
	    for (int i=0; i<n; i++) {
	        if (v[i] % 2 == 0) {
	        	System.out.printf("%d  ", v[i]);
	            result++;
	            evenOrnot = true;
	        }
	    }
	    if(evenOrnot == false) 
	    {
	    	System.out.println("Não existem números pares");
	    }
	    System.out.println("");
		
		System.out.println("Quantidade de números pares dentro do Array: " + result);
	}

}
