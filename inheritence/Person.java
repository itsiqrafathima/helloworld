package inheritence;

public class Person  {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Developer d1 = new Developer("iqra", 01,2000,"developer");
		TestEngineer te = new TestEngineer("fathima", 02,30000,"test");
d1.display();
te.display();

System.out.println(d1.getName());
System.out.println(d1.getEid());
System.out.println(d1.getDesignation());
System.out.println(d1.getSalary());
System.out.println(te.getName());
System.out.println(te.getEid());
System.out.println(te.getDesignation());
System.out.println(te.getSalary());

	}
	}

