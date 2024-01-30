package edu.com.exercicio;

public abstract class Figura {
	
	private String cor;
	
	public Figura() {}

	public Figura(String cor) {
		this.cor = cor;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String toString() {
		
		StringBuilder texto = new StringBuilder();
		texto.append("\nClasse Figura");
		texto.append("\nCor: " + this.cor);
		
		return texto.toString();
	}
	
}
