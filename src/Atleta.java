
public class Atleta {
	public double altura, peso;
	
	public double obterIMC(double alt, double pes) {
		return pes /(alt * alt);
	}
	
	public void classificar(double imc) {
		if(imc < 18.5) {
			System.out.println("Classificação: Abaixo do peso.");
		}
		else if(imc >= 18.5 && imc < 25) {
			System.out.println("Classificação: Peso normal.");
		}
		else if(imc >= 25 && imc < 30) {
			System.out.println("Classificação: Pré-obesidade.");
		}
		else if(imc >= 30 && imc < 35) {
			System.out.println("Classificação: Obesidade Grau I.");
		}
		else if(imc >= 35 && imc < 40) {
			System.out.println("Classificação: Obesidade Grau II");
		}
		else if(imc > 40) {
			System.out.println("Classificação: Obesidade Grau III.");
		}
	}
	public void obterRisco(double imc) {
		if(imc < 18.5) {
			System.out.println("Risco de saúde: Muito alto.");
		}
		else if(imc >= 18.5 && imc < 25) {
			System.out.println("Risco de saúde: Baixo.");
		}
		else if(imc >= 25 && imc < 30) {
			System.out.println("Risco de saúde: Médio.");
		}
		else if(imc >= 30 && imc < 35) {
			System.out.println("Risco de saúde: Alto.");
		}
		else if(imc >= 35 && imc < 40) {
			System.out.println("Risco de saúde: Muito alto.");
		}
		else if(imc > 40) {
			System.out.println("Risco de saúde: Muitíssimo alto.");
		}	
	}
}
