package ejemplosDiaDos.roedores;

public class Hamster extends Roedores{

	@Override
	public String apariencia() {
		return "Cola proporcional al resto del cuerpo.";
	}

	@Override
	public String cicloVida() {
		return "De 10 crías por camada; gestación de 21 días";
	}
}
