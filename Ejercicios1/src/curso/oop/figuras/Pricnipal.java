package curso.oop.figuras;

import  curso.oop.figuras.Circulo;
import  curso.oop.figuras.Cuadrado;

public class Pricnipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// CIRCULO
		Circulo c = new Circulo();
		c.setX(1);		
		c.setY(1);
		c.setRadio(5.2);
		
		System.out.println("el valor de x es: " + c.getX());
		System.out.println("el valor de y es: " + c.getY());
		System.out.println("el valor de radio es: " + c.getRadio());
		System.out.println("la circunferencia será: " + c.circunfe());
		System.out.println("el perímetro será: " + c.perimetro());
		
		// CUADRADO
		Cuadrado cu = new Cuadrado(4);
		// cu.setLado(3);
		
		System.out.println("el area del cuadrado es : " + cu.area());
		System.out.println("el perimetro del cuadrado es: " + cu.perimetro());
	}
}
