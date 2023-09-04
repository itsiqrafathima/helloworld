package arrays;
import java.util.Scanner;
public class Arrays {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println(" enter the number of array");
		int n = sc.nextInt();
		// TODO Auto-generated method stub
		int[] arr =new int[n];
		for(int i =0 ;i<n;i++)
		{
			System.out.println("Enter the array elements");
			arr[i]= sc.nextInt();
		}
		
		System.out.println("The number of array elements are" );
		for(int i =0 ;i<n;i++) {
			System.out.println(	arr[i]);
		}
		double total=0;
		for(int i =0 ;i<=n;i++) {
		total += arr [i];
		System.out.println(total);
		}
		}
		
		
		

	}


