package fibonacci;

import java.util.Scanner;

public class Principal {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Tamanho da sequencia: ");
		int n = sc.nextInt();
				
		System.out.println(Fibonacci.calculaFibonacci(n));
	}

}
