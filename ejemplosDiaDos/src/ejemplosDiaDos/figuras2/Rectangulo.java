package ejemplosDiaDos.figuras2;

public class Rectangulo implements IFigura {
	
	private int base;
	
	private int altura;
	
	public Rectangulo(int base, int altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	@Override
	public String obtenerNombreFigura() {
		return "Rectangulo";
	}

	@Override
	public double calcularArea() {
		return base * altura;
	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return 2*(altura + base);
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
}
