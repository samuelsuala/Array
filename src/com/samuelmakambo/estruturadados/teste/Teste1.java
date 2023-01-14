package com.samuelmakambo.estruturadados.teste;

import com.samuelmakambo.estruturadados.vector.Vector;

public class Teste1 {
	
	public static void main(String args []) {
		
		Vector vetor = new Vector(10);
		
		vetor.adiciona("B");
		vetor.adiciona("C");
		vetor.adiciona("E");
		vetor.adiciona("F");
		vetor.adiciona("G");
		
		
		System.out.println(vetor);
		
		vetor.adiciona("A");
		
		System.out.println(vetor);
		
		vetor.adicionarQualquerPosicao(3, "D");
		
		System.out.println(vetor);
	}

}
