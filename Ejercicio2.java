import java.util.Scanner;
public class Ejercicio2 {
	
	public static void main (String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Introduzca una palabra ");
		String palabra = sc.next();
		System.out.printf("La palabra en mayuscula %s y en minuscula es: %s%n ",mostrarMayuscula(palabra),mostrarMinuscula(palabra));
		System.out.printf("El numero de vocales que tiene la palabra es: %c ",mostrarVocales(palabra));
		System.out.printf("¿La palabra tiene tilde? %b",contieneTilde(palabra));
		
		sc.close();		
	}
	//metodo que devuelve la palabra en mayuscula
	public static String mostrarMayuscula(String palabra){
	return palabra.toUpperCase();	
	}
	//metodo que devuelve la palabra en minuscula
	public static String mostrarMinuscula(String palabra){
	return palabra.toLowerCase();	
	}
	//metodo que muestra las vocales que tiene una palabra
	public static char mostrarVocales(char palabra){
		
	return palabra;	
	}
	//metodo que nos muestra si una palabra tiene tilde
	public static boolean contieneTilde(String palabra){
		if
	return true;	
	}
}

