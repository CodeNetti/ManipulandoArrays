package models;

public class Model_Personal {
	double heigth;
	char sex;
	public double getHeigth() {
		return heigth;
	}

	public void setHeigth(double heigth) {
		this.heigth = heigth;
	}
	

	public Model_Personal( double heigth , char sex) {
		
		this.sex = sex;
		this.heigth = heigth;
	}

	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	
}
