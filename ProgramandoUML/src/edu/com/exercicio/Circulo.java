package edu.com.exercicio;

public class Circulo extends Figura {
	
	private Double raio;
	
	public Circulo() {}

	public Circulo(String cor, Double raio) {
		super(cor);
		this.raio = raio;
	}

	public Double getRaio() {
		return raio;
	}

	public void setRaio(Double raio) {
		this.raio = raio;
	}
	
	public void calcularArea(Double raio) {
		double resultado = (raio * 2) * 3.14;
		System.out.printf("A area do raio é %.2f%n", resultado);
	}
	
	public void calcularDiametro(Double raio) {
		double diametro = raio * 2;
		System.out.printf("O diametro do circulo é %.2f", diametro);
	}
	
	@Override
	public String toString() {
		
		StringBuilder texto = new StringBuilder();
		texto.append("\nClasse Circulo");
		texto.append("\nRaio: ");
		texto.append(this.raio);
		texto.append("\nCor do circulo: ");
		texto.append(getCor());
		
		return texto.toString();
	}
	
	
	
	

}
