package MethodOveriding;

public class Son extends Father {
	String FirstName = "sonu";

	public void bloodGroup() {
		System.out.println(" Son is AB-ve");
		
	}
	public void eyes() {
		System.out.println(" color of eyes is blue");
	}
	public static void main(String[] args) {
		
		Son s = new Son();
		Father f = new Father();
		System.out.println(s.FirstName + f.LastName);
		Father f1 = s;// method Overriding
		s.eyes();
		s.bloodGroup();
		f1.eyes();
		f1.bloodGroup();
		f.bloodGroup();
		f.eyes();
		
		
		
	}

}
