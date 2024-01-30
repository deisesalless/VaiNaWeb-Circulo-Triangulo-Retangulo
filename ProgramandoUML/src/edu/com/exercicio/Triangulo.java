package edu.com.exercicio;

public class Triangulo {
	
	private Double lado3;
	private Poligono poligono = new Poligono();
	
	public Triangulo() {}

	public Triangulo(Double lado3, Poligono poligono) {
		this.lado3 = lado3;
		this.poligono = poligono;
	}

	public Double getLado3() {
		return lado3;
	}

	public void setLado3(Double lado3) {
		this.lado3 = lado3;
	}

	public Poligono getPoligono() {
		return poligono;
	}

	public void setPoligono(Poligono poligono) {
		this.poligono = poligono;
	}
	
	public void calcularTriangulo(Double base, Double altura) {
		double resultado = (base * altura) / 2;
		System.out.printf("A area do quadrado é %.2f. E a sua cor é %s.%n", resultado, poligono.getCor());
	}

	@Override
	public String toString() {
		
		StringBuilder texto = new StringBuilder();
		texto.append("\nClasse Triangulo");
		texto.append("\nBase: ");
		texto.append(poligono.getLado1());
		texto.append("\nAltura: ");
		texto.append(poligono.getLado2());
		texto.append("\nCor do triangulo: ");
		texto.append(poligono.getCor());
		
		return texto.toString();
	}
	
	

}
