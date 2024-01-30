package edu.com.exercicio;

public class Retangulo {
	
	private Poligono poligono = new Poligono();
	
	public Retangulo() {}

	public Retangulo(Poligono poligono) {
		this.poligono = poligono;
	}

	public Poligono getPoligono() {
		return poligono;
	}

	public void setPoligono(Poligono poligono) {
		this.poligono = poligono;
	}
	
	public void calcularRetangulo(Double base, Double altura) {
		double resultado = base * altura;
		System.out.printf("A area do quadrado é %.2f. E a sua cor é %s.%n", resultado, poligono.getCor());
	}

	@Override
	public String toString() {
		
		StringBuilder texto = new StringBuilder();
		texto.append("\nClasse Retangulo");
		texto.append("\nBase: ");
		texto.append(poligono.getLado1());
		texto.append("\nAltura: ");
		texto.append(poligono.getLado2());
		texto.append("\nCor do retangulo: ");
		texto.append(poligono.getCor());
		
		return texto.toString();
	}
	
	
	
	

}
