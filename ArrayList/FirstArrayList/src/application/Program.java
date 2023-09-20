package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Raphael Simonetti");
		list.add("Raphaela");
		list.add("Ronaldo");
		list.add("Bruno Souza");
		list.add("Guilherme Sella");
		list.add(2, "Inxerido");
		
		System.out.println(list.size());
		
	
		
		for(String read : list) 
		{
			System.out.println(read);
		}
		System.out.println("------------------------------------");

		
		// É possivel tambem remover um dado da lista a partir
		//do seu nome String no caso, e tambem por um predicado usando lambda
		list.removeIf(read -> read.charAt(0) == 'I');
		
		for(String read : list) 
		{
			System.out.println(read);
		}
		
		System.out.println("------------------------------------");

		//Verificando quantas pessoas tem o nome na lista
	System.out.println("Index of Guilherme Sella: " + list.indexOf("Guilherme Sella"));
	System.out.println("------------------------------------");

	//Filtrando as pessoas da lista pela sua inicial
	List<String> result = list.stream().filter(read -> read.startsWith("R") || read.startsWith("r")).collect(Collectors.toList());
	

	
	for(String read : result) 
	{
		System.out.println(read);
	}
	
	System.out.println("Index of Guilherme Sella: " + list.indexOf("Guilherme Sella"));
	
	
	
	}
	
	

}
