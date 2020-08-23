package delivery;

public abstract class Massa extends Lanche {
	private final int tempoPreparo = 30;
	private String molho;
	
	public String getMolho() {
		return molho;
	}
	public void setMolho(String molho) {
		this.molho = molho;
	}
	
	@Override
	public int calculaTempoEntrega(int distancia) {
		return super.calculaTempoEntrega(distancia) + tempoPreparo;
	}
	
}
