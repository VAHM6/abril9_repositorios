package abril9_repositorios;

import java.util.Scanner;

//a�adimos comentario para simular cambios en nuestro proyecto.

//a�adimos segundo comentario... otra version del proyecto

//segunda version de c�digo

public class Esprimo {

	private static Scanner teclado;

	public static void main (String [] ar){
		int numero;
		boolean resultado;
		teclado = new Scanner (System.in);
		System.out.print("por favor introduzca un n�mero entero positivo  :: ");
		numero=teclado.nextInt();
		resultado = Esprimo.esprimo(numero);
		if (resultado == true){
			System.out.print("El n�mero introducido es PRIMO");
		}
		else{
			System.out.print("El n�mero introducido NO es primo");
		}
	}
	
	public static boolean esprimo(int num){
		if (num>0){
			boolean primo=true;
			for (int i=2; i<num; i++){
				if (num%i==0){primo=false;}	
			}
			return primo;
		}
		else{
			Esprimo.error("n�mero negativo");
			
			return false;}
	}
	
	public static void error(String s){
		System.out.print(s);
	}
}


