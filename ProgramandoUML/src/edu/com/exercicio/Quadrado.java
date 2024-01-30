package edu.com.exercicio;

public class Quadrado {
	
	private Poligono poligono = new Poligono();

	public Quadrado() {}
	
	public Quadrado(Poligono poligono) {
		this.poligono = poligono;
	}

	public Poligono getPoligono() {
		return poligono;
	}

	public void setPoligono(Poligono poligono) {
		this.poligono = poligono;
	}

	public void calcularQuadrado(Double lado1, Double lado2) {
		double area = lado1 * lado2;
		System.out.printf("A area do quadrado é %.2f. E a sua cor é %s.%n", area, poligono.getCor());
	}

	@Override
	public String toString() {
		
		StringBuilder texto = new StringBuilder();
		texto.append("\nClasse Quadrado");
		texto.append("\nPrimeiro lado: ");
		texto.append(poligono.getLado1());
		texto.append("\nSegundo lado: ");
		texto.append(poligono.getLado2());
		texto.append("\nCor do quadrado: ");
		texto.append(poligono.getCor());
		
		return texto.toString();
	}
	
	

}
