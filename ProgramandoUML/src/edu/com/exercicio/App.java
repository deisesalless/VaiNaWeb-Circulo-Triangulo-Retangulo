package edu.com.exercicio;

public class App {

	public static void main(String[] args) {
		
		Circulo circulo = new Circulo("azul", 3.0);
		circulo.calcularArea(3.5);
		circulo.calcularDiametro(3.05);
		System.out.println(circulo.toString());
		
		Poligono poligono1 = new Poligono("verde", 10.2, 10.2);
		Poligono poligono2 = new Poligono("amarelo", 10.05, 10.05);
		Poligono poligono3 = new Poligono("branco", 10.78, 10.78);
		
		Quadrado quadrado = new Quadrado(poligono1);
		quadrado.calcularQuadrado(10.2, 10.2);
		System.out.println(quadrado.toString());
		
		Retangulo retangulo = new Retangulo(poligono2);
		retangulo.calcularRetangulo(10.05, 10.05);
		System.out.println(retangulo.toString());
		
		Triangulo triangulo = new Triangulo(10.78, poligono3);
		triangulo.calcularTriangulo(10.78, 10.78);
		System.out.println(triangulo.toString());
		
	}

}
