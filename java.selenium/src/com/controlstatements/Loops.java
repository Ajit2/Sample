package com.controlstatements;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0, i = 0;
		System.out.println("even numbers are");
		/*for (i = 0; i < 100; i++) {

			if (i % 2 == 0) {

				System.out.print("  " + i);
				count++;
				if (count % 10 == 0)
					System.out.println("\n");
			}

		}
		System.out.println("\ncount is   " + count);
*/
		/*while (i < 100) {

			if (i % 2 == 0) {

				System.out.print("  " + i);
				count++;
				if (count % 10 == 0)
					System.out.println("\n");
			}

			i++;

		}
		System.out.println("\ncount is   " + count);*/
		
		
		
		do{

			if (i % 2 == 0) {

				System.out.print("  " + i);
				count++;
				if (count % 10 == 0)
					System.out.println("\n");
			}

			i++;

		}while (i < 100) ;

	}

}
