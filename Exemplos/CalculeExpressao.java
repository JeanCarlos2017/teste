/*4. Escreva  um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e calcule a seguinte express�o: D = (R + S)/2
, onde  R = (A+B)^2 e S = (B+C)^2 */


package ProjetoJava;

import java.util.Scanner;

public class CalculeExpressao {

	public static void main (String args[]) {
		
		Scanner ler = new Scanner(System.in);
		double A,B,C,D,R,S;
		
		System.out.println("Ol�, informe o primeiro n�mero: ");
		A = ler.nextInt();
		
		System.out.println("Informe o segundo n�mero: ");
		B = ler.nextInt();		

		System.out.println("Informe o terceiro n�mero: ");
		C = ler.nextInt();
		
		R = A+B;
		S = B+C;
		
		D = (Math.pow(R, 2) + Math.pow(S, 2))/2;
		
		System.out.printf("O resultado � %2.4f",D);
	}
}
