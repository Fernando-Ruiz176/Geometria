package Geometria;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculosGeometricos {
	
	private final static short OPCION_MENU_SALIR        = 5;
	private final static short OPCION_AREA_CIRCULO      = 4;
	private final static short OPCION_PERIMETRO_CIRCULO = 3;
	private final static short OPCION_RADIO_CIRCULO     = 2;
	private final static short OPCION_AREA_RECTANGULO   = 1;
	
	private static short opcionSeleccionada;

	public static void main(String[] args) {
		do {
			menu();
		}	while(opcionSeleccionada != OPCION_MENU_SALIR );	
	}
	
	private static void menu() {
		System.out.println("SELECCIONE UNA OPCION DEL MENU\n=================================\n\n");
		System.out.println("1. Calcular el area de un rectangulo");
		System.out.println("2. Calcular el radio de un circulo");
		System.out.println("3. Calcular el perimetro de un circulo");
		System.out.println("4. Calcular el area de un circulo");
		System.out.println("5. SALIR");
		
		System.out.println("Seleccione una opcion del menú: ");
		Scanner scanner = new Scanner( System.in);
		try {
			opcionSeleccionada = (short) scanner.nextInt();
		} catch(InputMismatchException ime) {
			System.out.println("Solo se permite ingresar valores numericos!!!!!");
		}
		switch ( opcionSeleccionada ) {
			case OPCION_AREA_RECTANGULO:
				calcularAreaRectangulo();
				break;
			case OPCION_RADIO_CIRCULO:
				calcularRadioCirculo();
				break;
			case OPCION_PERIMETRO_CIRCULO:
				calcularPerimetroCirculo();
				break;
			case OPCION_AREA_CIRCULO:
				calcularAreaCirculo();
				break;	
		}
	}
	
	private static void calcularAreaRectangulo() {
		Scanner scanner = new Scanner( System.in );
		try {
			System.out.println("Por favor ingrese la medida de la base del rectángulo: ");
			double base = scanner.nextDouble();
			System.out.println("Por favor ingrese la altura del rectangulo: ");
			double altura = scanner.nextDouble();
			
			Rectangulo rectangulo = new Rectangulo(base, altura);
			double area = rectangulo.calcularArea();
			System.out.printf("El area del rectangulo es %f %n%n", area);
		} catch (InputMismatchException excepcion) {
			System.out.println("Debe ingresar obligatoriamente numeros enteros o decimales con -coma-.");
		}
		
	}
	
	private static void calcularRadioCirculo() {
		Scanner scanner = new Scanner (System.in);
		try {
			System.out.println("Por favor ingrese el valor del diametro del circulo: ");
			double diametro = scanner.nextDouble();
		
			Circulo circulo = new Circulo(diametro);
			double radio = circulo.calcularRadio();
			System.out.printf("El radio del circulo es %f %n%n", radio);
		} catch (InputMismatchException excepcion) {
			System.out.println("Debe ingresar obligatoriamente numeros enteros o decimales con -coma-.");
		}
		
	}
	
	private static void calcularPerimetroCirculo() {
		Scanner scanner = new Scanner (System.in);
		try {
			System.out.println("Por favor ingrese el valor del diametro del circulo: ");
			double diametro = scanner.nextDouble();
		
			Circulo circulo = new Circulo(diametro);
			double perimetro = circulo.calcularPerimetro();
			System.out.printf("El perimetro del circulo es %f %n%n", perimetro);
		} catch (InputMismatchException excepcion) {
			System.out.println("Debe ingresar obligatoriamente numeros enteros o decimales con -coma-.");
		}

	}
	
	private static void  calcularAreaCirculo() {
		Scanner scanner = new Scanner (System.in);
		try {
			System.out.println("Por favor ingrese el valor del diametro del circulo: ");
			double diametro = scanner.nextDouble();
		
			Circulo circulo = new Circulo(diametro);
			double area = circulo.calcularArea();
			System.out.printf("El area del circulo es %f %n%n", area);
		} catch (InputMismatchException excepcion) {
			System.out.println("Debe ingresar obligatoriamente numeros enteros o decimales con -coma-.");
		}

	}
}




