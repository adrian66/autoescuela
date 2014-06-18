package curso.oop.figuras;


public class SumarMatrices3X3 {

	public static void main(String args[]) {
	int x;
	int y;
	int[][] nume = {{5,10,3}, {25,11,12}, {13,14,55}};  // 1ª matriz inicializada
	int[][] nume1;
	int[][] matsuma;
	
	
	nume1= new int [3][3];  // 2ª matriz inicializada
	nume1[0][0] = 10; 
	nume1[0][1] = 1;
	nume1[0][2] = 5;
	nume1[1][0] = 25;
	nume1[1][1] = 30;
	nume1[1][2] = -5;
	nume1[2][0] = 10;
	nume1[2][1] = -10;
	nume1[2][2] = -55;
	
	matsuma= new int [3][3];
	
	for (x=0; x < nume.length; x++) {
		  for (y=0; y < nume[x].length; y++) {				
		    matsuma[x][y]=nume[x][y]+nume1[x][y];
		  }
	}
		for (x=0; x < nume.length; x++) {
		  for (y=0; y < nume[x].length; y++) {				
		    matsuma[x][y]=nume[x][y]+nume1[x][y];
	
		    System.out.println("Valor" + x + " " + y + "=" + matsuma[x][y]);
	}
}
}
}