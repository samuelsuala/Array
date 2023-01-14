package com.samuelmakambo.estruturadados.teste;

import com.samuelmakambo.estruturadados.vector.Vector;

public class Teste {

	public static void main(String[] args) {
		
		Vector vector = new Vector(10);	
		
		
		vector.adiciona("Elemento 1"); // posição 0 
		vector.adiciona("Elemento 2"); // posição 1
		vector.adiciona("Elemento 3"); // posição 2 
		vector.adiciona("Elemento 4"); // posição 3 
		
		System.out.println("Tamanho do Vector " + vector.getTamanho());
		System.out.println(" Imprimir elementos do vector " +  vector.toString());
		System.out.println("O elemento que se encontra na posição n é " + vector.busca(3));
		System.out.println("O elemento que se encontra na posição n é  " + vector.buscaSequencial("Elemento 4"));
		
		

	}

}
