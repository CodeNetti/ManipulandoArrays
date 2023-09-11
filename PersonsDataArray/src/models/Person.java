package models;

public class Person {
String name;	
int age;
double heigth;
public Person(String name, int age, double heigth) {
	super();
	this.name = name;
	this.age = age;
	this.heigth = heigth;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public double getHeigth() {
	return heigth;
}
public void setHeigth(double heigth) {
	this.heigth = heigth;
}



}
