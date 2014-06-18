package GeometriaAbstraccion;

public abstract class Figura {

	public abstract double area();
	public abstract double perimetro();
	public String detalles() {
		return "Figura vacía";
	}
}