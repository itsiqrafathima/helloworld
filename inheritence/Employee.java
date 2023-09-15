package inheritence;

public class Employee {
	private String name;
	private int eid;
	private double salary;
	private String designation;
	 Employee(String name, int eid, double salary, String designation){
		 this.name = name;
		 this.eid = eid;
		 this.salary= salary;
		 this.designation = designation;
	 }
	public String getName() {
		return name;
	}
	public int getEid() {
		return eid;
	}
	public double getSalary() {
		return salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	 
	}


