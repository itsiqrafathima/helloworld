package inheritence;

public class TestEngineer extends Employee {
	TestEngineer(String name, int eid, double salary, String designation){
		super(name,eid,salary,designation);
	}
	public void test() {
		System.out.println("Testing");
	}
	public void display() {
		System.out.println("From tester");
	}
}
