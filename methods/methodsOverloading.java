package methods;

public class methodsOverloading {
public static int a;
public static int b;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 sum(10,20);
 sum(30,40,50);
 sum();
	}
public static void sum() {
	int sum = a+b;
	System.out.println(sum);
}
public static void sum(int a ,int b ) {
	int sum =a+b;
	System.out.println(sum);
}
public static void sum(int a ,int b, int c ) {
	int sum =a+b+c;
	System.out.println(sum);
}
}
