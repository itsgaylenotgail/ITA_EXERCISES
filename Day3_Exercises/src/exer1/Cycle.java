package exer1;

public class Cycle {	
	
	private void ride()
	{
		System.out.println("Riding Naaaaaooo");
	}
		
	
	public static void main(String args[]) {
		BiCycle bike = new BiCycle();
		TriCycle trike = new  TriCycle();
		UniCycle uni = new  UniCycle();		
		
		((Cycle)bike).ride();
		((Cycle)trike).ride();
		((Cycle)uni).ride();
	}
}
