package clases1;

import java.util.Scanner;

public class Pedir10letrasEliminar {
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num =new Scanner(System.in);
		
	
		int i;
		int aux=0;
		String [] letras ;
		String [] letras1;
		letras = new String[10];			
		letras1 = new String[9];  
		int nume=0;
		Scanner sc = new Scanner(System.in);
//		int ceros=0;
		
				
		for (i=0; i<letras.length; i++)
			
		 {
			System.out.print("teclea letra :");
			letras[i] = sc.next();	
		 }	
		System.out.print("teclea número :");
		nume= num.nextInt();
			
		for (i=0; i<letras.length; i++)
			
		 {
			if (i != nume) {
			letras1[aux] = letras[i];	
		 	++aux;
			} 
				
			
		 }
		for (int j = 0; j < letras1.length; j++) {
			System.out.print(letras1[j] + "; ");
							
		}
	}
}	
	



