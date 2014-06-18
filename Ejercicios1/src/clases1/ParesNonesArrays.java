package clases1;

import java.util.Scanner;

public class ParesNonesArrays {
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num =new Scanner(System.in);
		
	//	int num = Integer.parseInt(args[0]);
		int i;
		int [] nume ;
		
		nume = new int[10];			
		  
		int pares=0;
		int nones=0;
		
		for (i=0; i<nume.length; i++)
			
		 {
			System.out.print("teclea número :");
			nume[i] = num.nextInt();	
		 }	
		for (i=0; i<nume.length; i++)
		{
			if (nume[i]%2 ==0) ++pares;
			      else         ++nones;
		}
		
		int[] par = new int[pares];
		int[] non = new int[nones];
		int auxp=0;
		int auxn=0;
		for (i=0; i<nume.length; i++)
			
		 {
			if (nume[i]%2 ==0)  par[auxp++]=nume[i];
				else non[auxn++]=nume[i];
					
		//	con apertura y cierre de llave	non[auxn]=nume[i];
		//	                                ++auxn;
			
		 }
		System.out.print("array pares : ");
		for (int j=0; j<par.length; j++)
		{
			System.out.print(par[j] + "; ");
					
		}
		System.out.println();
		System.out.print("array nones : ");
		for (int k=0; k<non.length; k++)
		{
			System.out.print(non[k] + "; ");
		
		}

	
	}
}


	



