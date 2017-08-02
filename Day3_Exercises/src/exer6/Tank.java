package exer6;

import java.util.Scanner;

public class Tank {
	static boolean isEmpty;
	static boolean isCleaned;
	
	public Tank(boolean initState) {
		System.out.println("Tank created.");
		setEmptyState(initState);		
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
	
	public static boolean finalize(Tank tangc1) {
		if(tangc1.getCleanState()) {
			System.out.println("Terminated. Tank is confirmed clean");
			return false;
		}
		else {
			System.out.println("Tank is not yet clean. Try again.");
			return true;
		}	
	}
	
	public static boolean getInitialState()
	{
		Scanner reader = new Scanner(System.in);
		System.out.println("Empty Tank? [Y/N] ");
		
		String a = reader.next(); // Scans the next token of the input as an int.
		if(a.toUpperCase() == "Y") return true;
		else if(a.toUpperCase() == "Y") return false;
		else return false;
	}
	
	public static void main(String args[]) {
		
		
		Tank tangc1;
		do {
			tangc1 = new Tank(getInitialState());
			if(tangc1.getEmptyState())tangc1.fillTank();
			else {
				System.out.println("Tank already full.");
			}
			
			if(tangc1.getEmptyState()) tangc1.cleanTank();
			else {
				tangc1.emptyTank();
				tangc1.cleanTank();
			}
		}while(finalize(tangc1));
		
	}
	
}
