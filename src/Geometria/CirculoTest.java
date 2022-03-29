package Geometria;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CirculoTest {
	
	
	//anotaciones
	@Test
	// Caso 1
	void testCalculoRadio() {
		Circulo circulo1 = new Circulo(100);
		circulo1.getDiametro();
		double radio1 = circulo1.calcularRadio();
		assertEquals(50.0, radio1);
		
	// Caso 2	
		Circulo circulo2 = new Circulo(50);
		double radio2 = circulo2.calcularRadio();
		assertEquals(25.000, radio2);
			
	// Caso 3
		Circulo circulo3 = new Circulo();
		circulo3.setDiametro(20);
		double radio3 = circulo3.calcularRadio();
		assertEquals(10.00, radio3);
				
	}
		
	@Test
		
	// Caso 4
	void testCalculoPerimetro() {
		Circulo circulo1 = new Circulo(65);
		double perimetro1 = circulo1.calcularPerimetro();
		perimetro1 = Math.round(perimetro1);
		assertEquals(204.0, perimetro1);
	// Caso 5
			
		Circulo circulo2 = new Circulo(28);
		double perimetro2 = circulo2.calcularPerimetro();
		perimetro2 = Math.round(perimetro2);
		assertEquals(88.0, perimetro2);
	// Caso 6
		
		Circulo circulo3 = new Circulo();
		double perimetro3 = circulo3.calcularPerimetro();
		perimetro3 = Math.round(perimetro3);
		assertEquals(0, perimetro3);
			
			
	}
	
	@Test
	
	// Caso 7
	void testCalculoArea() {
		Circulo circulo1 = new Circulo(0.0002);
		double area1 = circulo1.calcularArea();
		area1 = Math.round(area1);
		assertEquals(0.000000, area1);
		
	//Caso 8
		Circulo circulo2 = new Circulo(2);
		double area2 = circulo2.calcularArea();
		area2 = Math.round(area2);
		assertEquals(3, area2);
		
		Circulo circulo3 = new Circulo(4);
		double area3 = circulo3.calcularArea();
		area3 = Math.round(area3);
		assertEquals(13, area3);
		
	}
	
	
	
	
}
