package inheritence;
import java.util.Scanner;
public class Employee extends Person {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.println(i);
		System.out.println(Person.i);
		test();
		Employee.test();
	}
	}


