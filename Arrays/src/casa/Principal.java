package casa;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Casa c = new Casa();
		
		System.out.print("Cor da casa: ");
		c.setCor(sc.next());
		c.getCor();
		
	}
	

	
}
