package GeometriaAbstraccion;

// import GeometriaAbstraccion.IPruebaInterface;

// public class Circunferencia extends  Figura implements IPruebaInterface{

public class Circunferencia extends  Figura {
	private int radio;
	
	public Circunferencia(int radio) {
		this.radio = radio;
			}	
	public int getRadio() {
		return radio;
	}
	public void setRadio(int radio) {
		this.radio = radio;
	}
	
	
	
	public double area() {
	
		return Math.PI*Math.pow(radio,  2);
	}
	public double perimetro() {
	
		return 2*Math.PI*radio;
	}
	public String detalles() {
		return "soy un círculo de radio"+radio;
	}
	public void ponerColor(String codigo) {
		// TODO Auto-generated method stub
		
	}
	public int pintar(Figura grafica) {
		// TODO Auto-generated method stub
		return 0;
	}	
}
