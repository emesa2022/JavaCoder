package com.coderhouse;

public class Clase01 {

	public static void main(String[] args) {
		
		//respuesta variables
		int edad;
		final int DIA_SEMANA;
		double precioProducto;
		boolean estudianteAprobado;
		char inicialNombre;
		double[] notas = new double[5];
		String nombreCompleto;
		float peso;
		
		
		
		//respuesta ejercicio constante
		final double PI = 3.14;
		final int CANTIDADALUMNOS ;
		
		//respuesta operadores
		int numero1 = 5;
		int numero2 = 5;
		System.out.println(numero1 + numero2);
		
		
		double numero3 = 6;
		double numero4 = 5;
		System.out.println(numero3 - numero4);
		
		int numero5 = 5;
		int numero6 = 5;
		System.out.println(numero5 * numero6);
		
		double numero7 = 6;
		double numero8 = 5;
		
		if(numero7 != 0) {
			System.out.println(numero7 % numero8);
		}
		
		//operaciones relacionales
		
		if(numero5 > numero6) {
			System.out.println("A es mayor que B");
		}
		
		if( numero7 / 2 == 0) {
			System.out.println("El numero es par");
		}
		
		String nombre1 = "pepe";
		String nombre2 = "pepe";
		if(nombre1 == nombre2) {
			System.out.println("El nombre es igual!");
		}
		
		int nota = 11;
		if(nota >= 6 && nota <= 10) {
			System.out.println("Estas aprobado con: "+nota);
		}else if (nota <= 5 && nota >=1) {
			System.out.println("estas desaprobado con: "+nota);
		}else {
			System.out.println("Nota no valida");
		}
		
		int numero = 11;
		if(numero <= 10 && numero >=1) {
			System.out.println("es menor de 10 y mayor que 1: "+numero);
		}else {
			System.out.println("numero no valida");
		}
		
		
		
		
		
		
	}

}
