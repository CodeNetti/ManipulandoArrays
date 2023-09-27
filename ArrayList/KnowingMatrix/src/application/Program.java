package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		System.out.println("Vamos Criar Nossa Primeira Matriz");
		System.out.println("Digite o tamno dessa matriz 'lINHAS E Colunas'");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] mat = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println("Diagonal principal");
		int j = 0;
		for (int i = 0; i < n; i++) {
			System.out.print(mat[i][j]);
			j++;
		}
		System.out.println("");
		System.out.println("Quantidade de numeros negativos:");
		int contador = 0;
		for (int[] linha : mat) {
			for (int leitor : linha) {
				if(leitor < 0) 
				{
					contador++;
				}

			}
		}
		System.out.println(contador);

	}
}
