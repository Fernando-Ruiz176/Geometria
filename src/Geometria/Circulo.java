package Geometria;

public class Circulo {

	//ATRIBUTOS (CONSTANTES)
	private double diametro;
	
	//CONSTRUCTORES
	public Circulo() {
	}

	public Circulo(double diametro) {
		this.diametro = diametro;
	}

	//CALCULOS
	public double calcularRadio() {
		return this.diametro /2;
	}
	
	public double calcularPerimetro() {
		return Math.PI * this.diametro;
	}
	
	public double calcularArea() {
		double radio = this.calcularRadio();
		return Math.pow(radio, 2) * Math.PI;
	}
		
		
	//GETTERS Y SETTERS
	public double getDiametro() {
		return diametro;
	}

	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}

		
}
