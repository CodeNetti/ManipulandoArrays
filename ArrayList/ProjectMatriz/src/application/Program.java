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
		while (lines != columns || lines <= 0 || columns <= 0) {
			System.out.println("Por favor, digite o mesmo numero de linhas e colunas e maior que  0");
			System.out.println("Digite a quantidade de linhas novamente");
			lines = sc.nextInt();
			System.out.println("Digite a quantidade de colunas novamente");
			columns = sc.nextInt();

		}
		System.out.println("Otimo, agora digite " + columns + " numeros em  cada linha");
		int[][] matriz = new int[lines][columns];
		for (int i = 0; i < columns; i++) {
			System.out.println("Proxima coluna");
			for (int j = 0; j < lines; j++) {
				matriz[j][i] = sc.nextInt();
			}
		}

		
		boolean conf = false;

		System.out.println(
				"Agora vamos ver quais são os numereos a esquerda, direita, acima e abaixo de um numero que você digitou na matriz");


		while (conf == false) {
			
			System.out.println("Digite um numero existente");
			int n = sc.nextInt();

			for (int c = 0; c < columns; c++) {
				for (int l = 0; l < lines; l++) {
					if (matriz[c][l] == n) {
						conf = true;
						System.out
								.println("O número " + n + " foi encontrado na coluna  " + (c) + ",  na  linha " + (l));

						if (c - 1 <= columns) {
							System.out.println("N a Esquerda " + matriz[c - 1][l]);

						} else {
							System.out.println("Não existe numeros a esquerda de " + n);

						}

						if (c + 1 < columns) {
							System.out.println("N a Direita " + matriz[c + 1][l]);
						} else {
							System.out.println("Não existe numero a direita de " + n);
						}
						if (l - 1 < lines && l - 1 >= 0) {
							System.out.println("N Acima " + matriz[c][l - 1]);
						} else {
							System.out.println("Não existe numero a acima de " + n);
						}
						if (l + 1 < lines) {
							System.out.println("N Abaixo " + matriz[c][l + 1]);
						} else {
							System.out.println("Não existe numero a abaixo de " + n);
						}
					}
					
					

				}
			}

		}
		
		sc.close();

	}

}
