package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		System.out.println("Olá vamos criar uma matriz");
		System.out.println("Digite primeiro a quantidade de linhas e depois a quantidade de colunas");
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de linhas");
		int lines = sc.nextInt();
		System.out.println("Digite a quantidade de colunas");
		int columns = sc.nextInt();
		int[][] matriz = new int[lines][columns];
		for (int i = 0; i < columns; i++) {
			for (int j = 0; j < lines; j++) {
				matriz[j][i] = sc.nextInt();
			}
		}
		boolean confirmation = false;
		System.out.println(
				"Agora vamos ver quais são os numereos a esquerda, direita, acima e abaixo de umm numero que você digitou na matriz");
		System.out.println("Digite o numero");
		int n = sc.nextInt();
		for (int c = 0; c < columns; c++) {
			for (int l = 0; l < lines; l++) {
				if(matriz[c][l]  == n) 
				{
					if(columns > 1 && lines > 1) 
					{
						System.out.println("O número " + n + " foi encontrado na coluna  " + (c) + ",  na  linha " + (l) );
						System.out.println("Esquerda" + matriz[1-c][l]);
						System.out.println("Direita" + matriz[1+c][l]);
						System.out.println("Acima" + matriz[c][1-l]);
						System.out.println("Abaixo" + matriz[c][1+l]);

					}
					
					confirmation = true;
					break;
				}
				else 
				{
					confirmation = false;
				}
			}
		}
		if(confirmation == false) 
		{
			System.out.println("Este numero não existe na matriz");
		}
		

	}
}
