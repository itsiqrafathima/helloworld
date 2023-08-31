import java.util.Scanner;
class SudentsDetails{
	String Name;
	int age;
	int marks;
	 void playing() {
		 System.out.println(" the student plays vollyball");
	 }
}
public class Students {
	public static void main(String[] args) {
		SudentsDetails s = new SudentsDetails();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name ") ;
		s.Name = sc.nextLine();
		System.out.println("Enter your name ") ;
		s.age = sc.nextInt();
		s.playing();
		
		
	}

}
