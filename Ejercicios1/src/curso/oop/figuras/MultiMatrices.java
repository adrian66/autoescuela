package curso.oop.figuras;


public class MultiMatrices {

	public static void main(String args[]) {
	int x;
	int y;
	int[][] nume = {{5,10,3,5}, {5,10,3,5}};
	int[][] nume1;
	int[][] multi;
	
	
	nume1= new int [4][3];
	 
	nume1[0][0] = 5; 
	nume1[0][1] = 1;
	nume1[0][2] = 2;
	nume1[1][0] = 3;
	nume1[1][1] = 8;
	nume1[1][2] = -5;
	nume1[2][0] = 10;
	nume1[2][1] = -10;
	nume1[2][2] = -6;
	nume1[3][0] = 4;
	nume1[3][1]= -2;
	nume1[3][2]= 3;
	
	multi= new int [2][3];
	
	int z=0;
	for (x=0; x < nume.length; x++) {
		for (y=0; y < nume1[0].length; y++) {	
			  int aux= 0;
			  for (z=0; z<4; z++) {
		         aux+=(nume[x][z]*nume1[z][y]);
		         System.out.println("Valor" + nume[x][z] + " " + nume1[z][y]);
			  		         multi[x][y] = aux; 
		         System.out.println("Valor[" + x + "][" + y + "] =" + aux + "; ");
			  }
		}
		  
	}
		for (x=0; x < nume.length; x++) {
		      for (y=0; y < nume1[0].length; y++) {				
				    System.out.print("Valor[" + x + "][" + y + "] =" + multi[x][y]+ "; ");
		  	  }
		}
}
}