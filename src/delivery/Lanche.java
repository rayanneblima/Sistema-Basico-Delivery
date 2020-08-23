package delivery;

public abstract class Lanche {
	private double preco;
	private int tempo;

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public float getDistancia() {
		return tempo;
	}

	public void setDistancia(int tempo) {
		this.tempo = tempo;
	}
	
	public int calculaTempoEntrega(int distancia) {
		return distancia * 10;
	}
	
}

