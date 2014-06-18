package clases1;

import java.util.Scanner;

public class Pedir10Numeros {
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num =new Scanner(System.in);
		
	//	int num = Integer.parseInt(args[0]);
		int i;
		int [] nume ;
		
		nume = new int[10];			
		  
		int positiv=0;
		int negativ=0;
		int ceros=0;
		
				
		for (i=0; i<nume.length; i++)
			
		 {
			System.out.print("teclea número :");
			nume[i] = num.nextInt();	
		 }	
		for (i=0; i<nume.length; i++)
		{
			if (nume[i]<0) 		  ++negativ;
			 else if (nume[i]==0) ++ceros;
			 else                 ++positiv;
		}
		
		System.out.println("los numeros positivos son : " + positiv);
		System.out.println("los numeros negativos son : " + negativ);
		System.out.println("los numeros cero son      : " + ceros);
}
}	
	



