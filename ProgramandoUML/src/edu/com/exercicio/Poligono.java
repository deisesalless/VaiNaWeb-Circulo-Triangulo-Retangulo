package edu.com.exercicio;

public class Poligono extends Figura {
	
	 private Double lado1;
	 private Double lado2;
	 
	 public Poligono() {}
	 
	public Poligono(String cor, Double lado1, Double lado2) {
		super(cor);
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	public Double getLado1() {
		return lado1;
	}

	public void setLado1(Double lado1) {
		this.lado1 = lado1;
	}

	public Double getLado2() {
		return lado2;
	}

	public void setLado2(Double lado2) {
		this.lado2 = lado2;
	}

	@Override
	public String toString() {
		
		StringBuilder texto = new StringBuilder();
		texto.append("\nClasse Poligono");
		texto.append("\nPrimeiro lado: ");
		texto.append(this.lado1);
		texto.append("\nSegundo lado: ");
		texto.append(this.lado2);
		texto.append("\nCor do quadrado: ");
		texto.append(getCor());
		
		return texto.toString();
	}
	
	
	 
	 
}
