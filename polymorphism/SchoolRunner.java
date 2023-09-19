package polymorphism;

public class SchoolRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
School s1= new Carmel();
School s2 = new DelhiPublic();
System.out.println(s1.getPhoneNumber());
System.out.println(s2.getPhoneNumber());
	}

}
