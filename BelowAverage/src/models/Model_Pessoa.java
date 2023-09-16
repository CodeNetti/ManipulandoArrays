package models;

public class Model_Pessoa {
	String name;
	double n1;
	double n2;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getN1() {
		return n1;
	}

	public void setN1(double n1) {
		this.n1 = n1;
	}

	public double getN2() {
		return n2;
	}

	public void setN2(double n2) {
		this.n2 = n2;
	}

	

	public Model_Pessoa(String name, double n1, double n2) {
		
		this.name = name;
		this.n1 = n1;
		this.n2 = n2;
	}
public Model_Pessoa() {
		
		
	}
	
}
