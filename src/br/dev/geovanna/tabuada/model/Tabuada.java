package br.dev.geovanna.tabuada.model;

public class Tabuada {
	
	private double multiplicando;
	private double minimoMultiplicador;
	private double maximoMultiplicador;
	

       
	public void setMultiplicando (double multiplicando) {
		this.multiplicando = multiplicando;
	}
	
	public double getMultiplicando() {
		return multiplicando;
	}
	
	public void setMinimoMultiplicador (double minimoMultiplicador) {
		this.minimoMultiplicador = minimoMultiplicador;
	}

	public double getMinimoMultiplicador() {
		return minimoMultiplicador;
	}
	
	public void setMaximoMultiplicador (double maximoMultiplicador) {
		this.maximoMultiplicador = maximoMultiplicador;
	}
	
	
	public double getMaximoMultiplicador() {
		return maximoMultiplicador;
	}
	 
	public void mostrarTabuada() {
		
		double tamanho = maximoMultiplicador - minimoMultiplicador + 1;
		
		String[] tabuada = new String[(int) tamanho];   
		
		double contador = minimoMultiplicador;
		while (contador <= maximoMultiplicador) {
			double produto = multiplicando * contador;
			System.out.println(multiplicando + " x " + contador + " = " + produto);
			    contador = contador + 1;
			 
		}
		
		System.out.println("---------------------------");
		System.out.println("");
		
	}

	
}
