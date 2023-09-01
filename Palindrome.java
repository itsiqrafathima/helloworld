import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String rev ="";
	Scanner sc = new Scanner (System.in);
	System.out.println(" enter the String");
	String str = sc.nextLine();
	for (int i =str.length()-1; i>=0;i--) 
		rev= rev +str.charAt(i);
		{
			if(str.equals(rev) ) {
				System.out.println("string is palindrome");
			}
			else
			{
				System.out.println("string is not palindrom");
			}
		}
	}
}




