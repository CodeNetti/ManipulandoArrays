package models;

public class employe {
	
	String name;
	Double salary;
	public static  Integer id;
	
	public employe(String name, Double salary) {
		
		this.name = name;
		this.salary = salary;
	}
	
	public String toString() 
	{
        return "ID " + id +", Name: " + name + ", Salary: " + salary ;

	}
	 
	
	
	public static Integer getId() {
		return id;
	}
	public static void setId(Integer id) {
		employe.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	

}
