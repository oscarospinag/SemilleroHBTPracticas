package ejemplosDiaDos.roedores;

/**
 * @author Oscar Ospina
 *
 */
public class Main {
	public static void main(String[] args) {

		//Ejercicio 2
		Roedores[] roedores = new Roedores[3];
		Hamster hamster = new Hamster();
		Raton raton = new Raton();
		Gerbo gerbo = new Gerbo();
		roedores[0] = hamster;
		roedores[1] = raton;
		roedores[2] = gerbo;
		
		for (Roedores roedor : roedores) {
			System.out.println(roedor.apariencia() + " " + roedor.cicloVida());
		}
	}
}
