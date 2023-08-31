
	class Launch{
		String color;
		int age;
		 void barking() {
			 System.out.println("the dog barks and color is" + this.color);
		 }
	}
	public class Dog{
		public static void main(String[] args) {
			Launch l = new Launch();
			l.age = 12;
			l.color= "blue";
			l.barking();
					
			
		}
	}
