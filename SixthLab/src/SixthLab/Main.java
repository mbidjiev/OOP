package SixthLab;

import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner (System.in);
		 System.out.print("Enter the lenght of the lines: ");
		 int x = sc.nextInt(); 
		 System.out.println("Enter the number of the lines: ");
		 int n = sc.nextInt();
		 Create numlines = new Create(n);
		 numlines.Create();
		 Geometry<Integer> lines = new Geometry<Integer>(x);
		 for(int i = 0; i < n; i++) {
			 lines.drawLine();
			 System.out.println("");
		 	}
	 }
}
