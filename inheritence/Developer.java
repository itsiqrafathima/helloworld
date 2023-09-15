package inheritence;

public class Developer extends Employee {
Developer(String name, int eid, double salary, String designation){
	super(name,eid,salary,designation);
}
public void code() {
	System.out.println("Codeing!!!!!");
}
public void display() {
	System.out.println("From developer");
}
}
