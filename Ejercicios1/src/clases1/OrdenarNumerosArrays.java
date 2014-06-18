package clases1;

import java.util.Scanner;

public class OrdenarNumerosArrays {
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num =new Scanner(System.in);
		
	//	int num = Integer.parseInt(args[0]);
		int i;
		int j;
		int k;
        int l;
		int n;
		int [] nume1 ;
		int [] nume2 ;
		int [] nume3 ;
		int aux1=0;
		int aux2=0;
		
		nume1 = new int[10];			
		nume2 = new int[10];  
		nume3 = new int[20];
		
		System.out.print("teclea número1 :");
					
		nume1[0] = num.nextInt();
		aux1 = nume1[0];
		
		for (i=1; i<nume1.length; i++)
		 {
			System.out.print("teclea número1 :");
			
			int a =  num.nextInt();
			if (a <=  aux1)  {
				System.out.println("Número menor que el anterior:");
				--i;
			} else {
				nume1[i] = a;
				aux1 = nume1[i];
			}
		 }
//		for ( i = 0; i < nume1.length; i++) {
//			System.out.println(nume1[i]);
//		}
	

	//		carga segunda array    

		System.out.print("teclea número2 :");
        nume2[0] = num.nextInt();
        aux2 = nume2[0];
        
  		for (j=1; j<nume2.length; j++)
		{
			System.out.print("teclea número2 :");
			
			int b =  num.nextInt();
			if (b <= aux2) { 
					System.out.println("Número menor que el anterior:");
				    --j;
				}  else {
					nume2[j] = b;
					aux2 = nume2[j];
				}
		} 
//  		n=0;
//  		for ( j = 0; j < nume2.length; j++) {
//			System.out.println(nume2[j]);
//		}
//  		for ( k = 0; k < nume1.length; k++) {
//  			System.out.println(nume1[k]);
//  			
//  		for ( l = 0; l < nume2.length; l++) {
//  	  			System.out.println(nume2[l]);
//  	  	
//  	  			if (nume1[k] < nume2[l]) {
//  	  				nume3[n] = nume1[k];
//  	  				++n;
//  	  				
//  	  			}
//  	  			if (nume1[k] > nume2[l]) {
//	  				nume3[n] = nume1[l];
//	  				++n;
//	  				
//	  			}	
//  		}
//  		}
//		array 3 de 20 posiciones
  		
  		i=0;
  		
        while ( (aux1 + aux2) < (20)) {

			if (nume1[aux1] <= nume2[aux2]) {
				nume3[aux1+aux2]= nume1[aux1++];
			} else {
        	    nume3[aux1+aux2] = nume2[aux2++];
			}
			
			if (aux1==20) {
				for (i= aux1+aux2; i < nume3.length; i++) {
					nume1[i] = nume2[aux2++];
				}
				break;
			}
			
			if (aux2== 20) {
				for (i = aux1+aux2; i < nume3.length; i++) {
					nume1[i] = nume2[aux1++];
				}
				break;
			}
        }
        
        System.out.println("ARRAY FINAL ORDENADO");
        System.out.print(aux1 + " " + aux2);
        
        for (j= aux1+aux2; j < nume3.length; j++) {
        	System.out.println(nume3[j] + " ");
        	
				}
        num.close();
			}

	}
	


	
	


