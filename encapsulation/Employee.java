package encapsulation;

public class Employee {

private int eid;
private String name;
private String designation;
private double salary;

public Employee(int eid, String name, String designation, double salary) {
	super();
	this.eid = eid;
	this.name = name;
	this.designation = designation;
	this.salary = salary;
}


/*
public Employee(int eid, String name,String designation,double salary) {
	this.eid=eid;
	this.name=name;
	this.designation=designation;
	this.salary=salary;
	
}
*/
/*
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid=eid ;
}
public String getName() {
	return name;
	
}
public String getDesignation() {
	return designation;
}
public double setSalary() {
	return salary;
}
public void setName(String name) {
	this.name= name;
}
public void setDesignation(String designation) {
	this.designation= designation;
	
}
public void setSalary(double salary) {
	this.salary=salary;
}
*/
public void setEid(int eid) {
	this.eid = eid;
}
public void setName(String name) {
	this.name = name;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public int getEid() {
	return eid;
}
public String getName() {
	return name;
}
public String getDesignation() {
	return designation;
}
public double getSalary() {
	return salary;
}
	
}
