package delivery;

public class Sanduiche extends Lanche {
	private final int tempoPreparo = 15;
	private String[] ingredientes = new String[10];
	
	public String[] getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String[] ingredientes) {
		this.ingredientes = ingredientes;
	}
	
	@Override
	public int calculaTempoEntrega(int distancia) {
		return super.calculaTempoEntrega(distancia) + tempoPreparo;
	}

	
}
