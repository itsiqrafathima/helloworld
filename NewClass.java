
public class NewClass {
	static int a =67;// static variable 
	static int b=90;
	int c =0;// instance variable
	
	int add() {
		int a=99;// a declared as local variable
		int c= a+b;// local variable
		return c;
	}
	int sub() {
		int c = a-b;
		return c;
	}
	int mul() {
		int c = a*b;
		return c;
	}
	public static void main(String[] args) {
		int data = 55;
		NewClass cl = new NewClass();
		cl.add();
		cl.sub();
		cl.mul();
		System.out.println(cl.sub());
		System.out.println(cl.add());
		System.out.println(cl.mul());
		System.out.println(data);// printing instance variable
		
	}

}
