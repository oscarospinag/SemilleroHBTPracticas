package ejemplosDiaDos.figuras2;

public class Circulo implements IFigura {

	private int radio;
	
	public Circulo(int radio) {
		super();
		this.radio = radio;
	}

	@Override
	public String obtenerNombreFigura() {
		return "circulo";
	}

	@Override
	public double calcularArea() {
		return 3.1416*Math.pow(radio, 2);
	}

	@Override
	public double calcularPerimetro() {
		return 2*3.1416*radio;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

}
