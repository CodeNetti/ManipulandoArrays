package models;

public class employe {
	
	String name;
	Double salary;
	 Integer id = 0;
	
	public employe( int id, String name, Double salary) {
		
		this.name = name;
		this.salary = salary;
		this.id = id;
	}
	
	public String toString() 
	{
        return "ID " + id +", Name: " + name + ", Salary: " + salary ;

	}
	 
	
	
	public  Integer getId() {
		return id;
	}
	public  void setId(Integer id) {
		this.id = id;
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
