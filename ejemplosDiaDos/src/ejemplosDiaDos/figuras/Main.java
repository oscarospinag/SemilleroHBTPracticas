package ejemplosDiaDos.figuras;

/**
 * @author Oscar Ospina
 *
 */
public class Main {
	public static void main(String[] args) {
		// Ejercicio 1
		Figura[] figuras = new Figura[3];
		Cuadrado cuadrado = new Cuadrado();
		Circulo circulo = new Circulo();
		Triangulo triangulo = new Triangulo();
		figuras[0] = cuadrado;
		figuras[1] = circulo;
		figuras[2] = triangulo;

		for (Figura figura : figuras) {
			System.out.println(figura.dibujar());
		}
	}
}
