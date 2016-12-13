import java.util.Scanner;
/** programa que nos pide 
 * 3 numeros donde
 * el primero es el numero 
 * por el que empieza la cadena
 * el segundo el numero que incrementa la cadena
 * y el tercero las columnas de la cadena
 * hasta 10 numeros
 * @author Juan Isaac
 * @version 1.0
 * */
public class Ejercicio1 {
	
	public static void main (String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Introduzca tres numeros ");
		int numero = sc.nextInt();
		//tercer numero de la cadena
		int numero1= numero%10;
		//segundo numero de la cadena
		int numero2= numero%100/10;
		//primer numero de la cadena
		int numero3= numero/100;
		int suma= numero3+numero2;
		int contador=10;
		int resultado= suma+numero2;
		for(int i=0;i<numero3;i++)
		{
			i=resultado;
			if (suma<=(numero2*9))
				suma= numero3+numero2;
				resultado =suma+numero2;
			 System.out.printf("%2d %d %d ",numero3,suma,resultado);
		}
				if(resultado%numero3==0)
					System.out.println();
	}
}

