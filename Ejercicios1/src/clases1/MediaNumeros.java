package clases1;

import java.util.Scanner;

public class MediaNumeros {
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num =new Scanner(System.in);
		
	//	int num = Integer.parseInt(args[0]);
		int aux=0;
		int sumas=0;				
		int x=-1;
		int resul=0;
		while (x !=0) {
			System.out.print("teclea número :");
			int numero = num.nextInt();	
			
		    sumas+=numero;	// se puede añadir que los numeros negativos no computan para la media
	     	++aux;
	     	x=numero;
		    }
		  	
	     aux=aux-1;
		resul=sumas/aux;
		
		System.out.println("La media de " + aux + " es " + resul + " " + sumas);
		
	}

}
