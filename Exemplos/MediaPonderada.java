/*5. Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste aluno. Considerar que a m�dia � 
 ponderada e que o peso das notas �: 2,3 e 5, respectivamente. */

package ProjetoJava;

import java.util.Scanner;

public class MediaPonderada {

		public static void main (String args[]) {
			
			
			Scanner ler = new Scanner(System.in);
			
			float nota1,nota2,nota3,mp1,mp2,mp3,c;
			
			System.out.println("Ol�, por favor digite a primeira nota: ");
			nota1= ler.nextFloat();
			
			System.out.println("Digite a segunda nota: ");
			nota2= ler.nextFloat();
			
			System.out.println("Digite a terceira nota: ");
			nota3= ler.nextFloat();
			
			
			mp1=nota1*2;
			mp2=nota2*3;
			mp3=nota3*5;
			
			c = (mp1+mp2+mp3)/3;
			
			System.out.printf("A m�dia das notas � %2.2f",c);
			
		}
		
	
}
