package com.controlstatements;

public class Test {

	static void month(int i) {

		if (i == 1)
			System.out.println("month is january");
		else
			System.out.println("ddjfjdls");
	}

	public static void main(String[] args) {
		
		month(2);
		
		int month=81;
		
		switch(month) {
		
		case 1:
			System.out.println("january");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("MArch");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("MAy");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("August");
			break;
		default:
			System.out.println("Inavlid Month");
			break;
			
		
		
		}

	}
	
	
	

}
