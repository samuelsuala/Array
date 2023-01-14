package com.samuelmakambo.estruturadados.vector;

// TODO: Auto-generated Javadoc
/**
 * The Class Vector.
 */
public class Vector {

	/** The elementos. */
	private String[] elementos;

	/** The tamanho. */
	private int tamanho;

	/**
	 * Instantiates a new vector.
	 *
	 * @param capacidade the capacidade
	 */
	public Vector(int capacidade) {

		this.elementos = new String[capacidade];
		this.tamanho = 0;

	}

	/**
	 * Adiciona.
	 *
	 * @param elemento the elemento
	 * @return true, if successful
	 */
	public boolean adiciona(String elemento) {
		
		this.aumentaCapaciade();
		
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}

	/**
	 * Busca.
	 *
	 * @param posicao the posicao
	 * @return the string
	 */
	public String busca(int posicao) {

		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição Inválida");
		}
		return this.elementos[posicao];
	}

	/**
	 * Busca sequencial.
	 *
	 * @param elemento the elemento
	 * @return the int
	 */
	public int buscaSequencial(String elemento) {

		for(int i = 0; i < this.tamanho; i++) {
			if(this.elementos[i].equals(elemento))
				return i;
		}
		return -1;
	}
	
	/**
	 * Adicionar qualquer posicao.
	 *
	 * @param posicao the posicao
	 * @param elemento the elemento
	 * @return true, if successful
	 */
	public boolean adicionarQualquerPosicao(int posicao, String elemento) {
		
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição Inválida");
		}
		
		
		this.aumentaCapaciade();
		
		// mover todos os elementos 
		for (int i = this.tamanho - 1; i >= posicao; i--) {
			this.elementos[i+1] = this.elementos[i];
		}
		
		this.elementos[posicao] = elemento;
		
		return false;
	}
	
	/**
	 * Aumenta capaciade.
	 */
	private void aumentaCapaciade() {
		if(this.tamanho == this.elementos.length) {
			String[] elementosNovos = new String[this.elementos.length * 2];
			for(int i = 0; i < this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			
			this.elementos = elementosNovos;
		}
	}
	
	/**
	 * Remover.
	 *
	 * @param posicao the posicao
	 */
	public void remover(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição Inválida");
		}
		for(int i = posicao; i < this.tamanho - 1; i++) {
			this.elementos[i] = this.elementos[i+1];
		}
		this.tamanho--;
	}

	/**
	 * Gets the tamanho.
	 *
	 * @return the tamanho
	 */
	public int getTamanho() {

		return this.tamanho;

	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	public String toString() {

		StringBuilder s = new StringBuilder();
		s.append("[");

		for (int i = 0; i < this.tamanho - 1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}

		if (this.tamanho > 0) {
			s.append(this.elementos[this.tamanho - 1]);
		}

		s.append("]");

		return s.toString();
	}

}
