package clases1;

public class DiasMeses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	
		int mes = Integer.parseInt(args[0]);
		int anos = Integer.parseInt(args[1]);
				
		

		switch (mes) {
		    case 1:	
			
			System.out.println("mes de enero tiene 30 d�as");
			break;
		    case 2:
			if (anos % 4 ==0)	// ademas debe cumplirse divisible por 400 y no divisible por 100
			{
			System.out.println("mes de febrero tiene 29 d�as");
			break;
	                } else {
	 		System.out.println("mes de febrero tiene 28 d�as");
		        break;
			}
		    case 3:	
				
				System.out.println("mes de marzo tiene 31 d�as");
				break;
			    case 4:	
				
				System.out.println("mes de abril tiene 30 d�as");
				break;

			    case 5:	
				
				System.out.println("mes de mayo tiene 31 d�as");
				break;	
			    case 6:	
				
				System.out.println("mes de junio tiene 30 d�as");
				break;	
			    case 7:	
				
				System.out.println("mes de julio tiene 31 d�as");
				break;	
			    case 8:	
				
				System.out.println("mes de agosto tiene 31 d�as");
				break;	
			    case 9:	
				
				System.out.println("mes de septiembre tiene 30 d�as");
				break;	
			    case 10:	
				
				System.out.println("mes de octubre tiene 31 d�as");
				break;	
			    case 11:	
				
				System.out.println("mes de noviembre tiene 30 d�as");
				break;	
			    case 12:	
				
				System.out.println("mes de diciembre tiene 31 d�as");
				break;	
		            default:
				System.out.println("mes incorrecto");
		        }
			}
			
		}
		

