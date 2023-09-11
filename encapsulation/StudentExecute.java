package encapsulation;
import java.util.Scanner;
public class StudentExecute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String name= sc.nextLine();
		System.out.println("Enter id");
		int id = sc.nextInt();
		System.out.println("Enter marks");
		int marks= sc.nextInt();
Student s= new Student(name,id,marks);
System.out.println(s.getName());
System.out.println(s.getId());
System.out.println(s.getMarks());
	}

}
