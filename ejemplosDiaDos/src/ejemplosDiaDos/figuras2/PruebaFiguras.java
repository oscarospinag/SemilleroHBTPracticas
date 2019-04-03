package ejemplosDiaDos.figuras2;

/**
 * @author Oscar Ospina
 *
 */
public class PruebaFiguras {

	public static void main(String[] args) {
		// Ejercicio 3
		Rectangulo rectangulo = new Rectangulo(3, 5);
		System.out.println(rectangulo.obtenerNombreFigura() + " Area: " + rectangulo.calcularArea() + " Perimetro: "
				+ rectangulo.calcularPerimetro());

		Circulo circulo = new Circulo(2);
		System.out.println(circulo.obtenerNombreFigura() + " Area: " + circulo.calcularArea() + " Perimetro: "
				+ circulo.calcularPerimetro());
	}

}
