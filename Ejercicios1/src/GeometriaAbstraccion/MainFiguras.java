package GeometriaAbstraccion;

public class MainFiguras {

	public static void main(String[] arg) {
		
		Figura f = new Rectangulo(6, 8);
		Figura ff = new Circunferencia(3);
		 
		System.out.println(f.detalles());
		System.out.println(f.area());
		System.out.println(f.perimetro());
	}
	
	
}
