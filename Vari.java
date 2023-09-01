
public class Vari {
	
	 static int m=100;//static variable 
	 
	    void method()  
	    {    
	        int n=90;//local variable 
	        
	        System.out.println(n);
	        
	    }  
public static void main(String[] args) {
	int data=50;//instance variable 
	Vari v = new Vari();
	System.out.println(v.m);
	v.method();
	System.out.println(data);
}
}
