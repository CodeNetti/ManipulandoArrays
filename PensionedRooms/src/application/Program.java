package application;

import java.util.Locale;
import java.util.Scanner;

import models.Rooms;


public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		String name;
		String email;
		int room = 0;
		

		System.out.println("Olá Somos o Hotel Simonetti, temos disponibilidade para o aluguel de 9 quartos");
		System.out.println("Quantos quartos gostaria de alocar? Depois nos informe o seu nome o seu E-mail e o numero do quarto");
		Rooms[] v = new Rooms[9];
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
            System.out.println("Aluguel #" + (i+1));
			sc.nextLine();
			System.out.println("Nome:");
			name = sc.nextLine();
			System.out.println("Email:");
			email = sc.nextLine();
			System.out.println("Quarto:");
			room = sc.nextInt();
			v[room] = new Rooms(name, email, room);
			
		}
		
		System.out.println("Quartos alocados");
		for (int i = 0; i < v.length; i++) {
			
			if(v[i] != null) 
			{
				System.out.println(v[i].getRoom()+": " + v[i].getName() + ", " + v[i].getEmail());
				

			}
			
		
           
		}
	
		
		

	}

}
