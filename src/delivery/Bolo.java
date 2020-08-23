package delivery;

public class Bolo extends Lanche {
	private final int tempoPreparo = 10;
	private String massa;
	private String recheio;
	private String cobertura;
	

	public String getMassa() {
		return massa;
	}

	public void setMassa(String massa) {
		this.massa = massa;
	}

	public String getRecheio() {
		return recheio;
	}

	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}

	public String getCobertura() {
		return cobertura;
	}

	public void setCobertura(String cobertura) {
		this.cobertura = cobertura;
	}
	
	@Override
	public int calculaTempoEntrega(int distancia) {
		return super.calculaTempoEntrega(distancia) + tempoPreparo;
	}
}
