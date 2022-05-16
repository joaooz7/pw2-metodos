
public class TestaAtleta {

	public static void main(String[] args) {
		double imc;
		Atleta at = new Atleta();
		at.altura = 1.74;
		at.peso = 68;
		
		
		at.obterIMC(at.altura, at.peso);
		
	}

}
