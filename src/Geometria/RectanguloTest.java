package Geometria;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectanguloTest {

	@Test
	void testcalculoArea() {
		Rectangulo rectangulo1 = new Rectangulo(2,6);
		rectangulo1.getBase();
		rectangulo1.getAltura();
		double area1 = rectangulo1.calcularArea();
		assertEquals(12, area1);
		
		Rectangulo rectangulo2 = new Rectangulo(8,12);
		double area2 = rectangulo2.calcularArea();
		assertEquals(96, area2);
		
		Rectangulo rectangulo3 = new Rectangulo();
		rectangulo3.setBase(6);
		rectangulo3.setAltura(7);
		double area3 = rectangulo3.calcularArea();
		assertEquals(42, area3);
		
		
		
	}

}
