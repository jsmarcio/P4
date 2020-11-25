package fibonacci;

public class Fibonacci {

	public static int calculaFibonacci(int n) {

		int cont = 0;

		if (cont < n) {
			int[] Fibo = new int[n];
		}

			if (cont == 0) {
				cont++;
				calculaFibonacci(n);
			} else if (cont == 1) {
				Fibo[cont] = 1;
				cont++;
				calculaFibonacci(n);
			} else {
				Fibo[cont] = (calculaFibonacci(Fibo[cont - 1])) + (calculaFibonacci(Fibo[cont - 2]));
				cont++;
				calculaFibonacci(n);
			}
		
		return n;
	}
}
