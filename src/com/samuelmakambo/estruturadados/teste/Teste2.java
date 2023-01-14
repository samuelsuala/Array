package com.samuelmakambo.estruturadados.teste;

import com.samuelmakambo.estruturadados.vector.Vector;

public class Teste2 {

	public static void main(String args[]) {

		Vector vetor = new Vector(3);

		vetor.adiciona("B");
		vetor.adiciona("C");
		vetor.adiciona("E");
		vetor.adiciona("F");
		vetor.adiciona("G");
		
		System.out.println(vetor);
		
		vetor.remover(1);
		
		System.out.println(vetor);
		
		
	}

}
