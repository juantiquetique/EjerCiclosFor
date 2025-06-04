package claseFor;

import java.util.Scanner;

public class ejercicioFor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num = new Scanner(System.in);
		System.out.println("Ingrese un número para calcular factorial: ");		
		int  Num1 = num.nextInt();
		
		int multiplo = 1;
		
		for(int i = Num1; i > 0; i--)
		{
			multiplo= multiplo * i;
			
		}
		
		System.out.println("El factorial de "+Num1+" es: "+multiplo);

	}

}
