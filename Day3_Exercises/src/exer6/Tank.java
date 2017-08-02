package exer6;

public class Tank {
	static boolean isEmpty;
	static boolean isCleaned;
	
	public Tank() {
		System.out.println("Tank created.");
		setEmptyState(true);		
	}
	
	public void setEmptyState(boolean isEmp)
	{
		isEmpty = isEmp;
	}
	
	public static boolean getEmptyState()
	{
		return isEmpty;
	}
	
	public void setCleanState(boolean isKlin)
	{
		isCleaned = isKlin;
	}
	
	public static boolean getCleanState()
	{
		return isCleaned;
	}
	
	public void fillTank()
	{
		setEmptyState(false);
		System.out.println("Tank is Filled");
	}
	
	public void emptyTank()
	{
		setEmptyState(true);
		System.out.println("Tank is Empty");
	}
	
	public void cleanTank()
	{
		setCleanState(true);
		System.out.println("Tank is Cleaned");
	}
	
	public static void finalize(Tank tangc1) {
		if(tangc1.getCleanState()) {
			System.out.println("Terminated. Tank is confirmed clean");
		}
		else {
			System.out.println("Tank is not yet clean. Try again.");
		}	
	}
	
	public static void main(String args[]) {
		
		Tank tangc1 = new Tank();
		
		if(tangc1.getEmptyState())tangc1.fillTank();
		else {
			System.out.println("Tank already full.");
		}
		
		if(tangc1.getEmptyState()) tangc1.cleanTank();
		else {
			tangc1.emptyTank();
			tangc1.cleanTank();
		}
		
		finalize(tangc1);
		
	}
	
}
