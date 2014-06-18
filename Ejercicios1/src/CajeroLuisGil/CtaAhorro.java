package CajeroLuisGil;


	public class CtaAhorro extends Cuenta {
		
		public double interesIngresos;
		public double penalizacionRetirada;
		
		public CtaAhorro(String dni, String nombre, String ncta, int edad,
				double saldo, double interesIngresos,
				double penalizacionRetirada) {
			super(dni, nombre, ncta, edad, saldo);
			
			this.interesIngresos = interesIngresos;
			this.penalizacionRetirada = penalizacionRetirada;
		}

		public double getInteresIngresos() {
			return interesIngresos;
		}

		public void setInteresIngresos(double interesIngresos) {
			this.interesIngresos = interesIngresos;
		}

		public double getPenalizacionRetirada() {
			return penalizacionRetirada;
		}

		public void setPenalizacionRetirada(double penalizacionRetirada) {
			this.penalizacionRetirada = penalizacionRetirada;
		}

		public double retirarFondos(double cantidad) {
			// TODO Auto-generated method stub
			saldo-=saldo*(interesIngresos/100)-cantidad;
			return saldo;
		}

		public double ingresarFondos(double cantidad) {
			// TODO Auto-generated method stub
			saldo+=saldo*(interesIngresos/100)+cantidad;
			return saldo;
		}	
		public String toString() {
			String res="cuenta de Ahorrro\n";
			res+=super.toString();
			return res;
		}
	  	
	}	