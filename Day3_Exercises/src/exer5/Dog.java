package exer5;

public class Dog {
	public Dog() {
		
	}
	
	
	private void bark(String a)
	{
		System.out.println("aw aw");
	}
	
	private void bark(int a)
	{
		System.out.println("arf arf");
	}
	private void bark(Boolean a)
	{
		System.out.println("woof woof");
	}
	private void bark(int a, String b)
	{
		System.out.println("awooooooo");
	}
	
	public static void main(String args[]) {
		
		Dog aso = new Dog();
		
		aso.bark("a");
		aso.bark(1);
		aso.bark(true);
		aso.bark(1,"a");
		
	}
	
}
