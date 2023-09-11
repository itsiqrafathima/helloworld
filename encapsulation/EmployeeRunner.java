package encapsulation;

public class EmployeeRunner {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
Employee e = new Employee(01,"iqra","sales",100000);
System.out.println(e);
System.out.println(e.getEid());
System.out.println(e.getName());
System.out.println(e.getSalary());
System.out.println(e.getDesignation());
e.setSalary(2000);
System.out.println(e.getSalary());
	}

}
