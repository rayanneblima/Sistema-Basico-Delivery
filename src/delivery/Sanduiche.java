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
	
	public String imprimirIngredientes() {
		String ingredientesEscolhidos = "";
		for(int i = 0; i < getIngredientes().length; i++) {
			if(getIngredientes()[i].equals("0")) {
				return ingredientesEscolhidos;
			}
			ingredientesEscolhidos += "\n\t" + getIngredientes()[i];
		}
		return ingredientesEscolhidos;
	}
 
	@Override
	public int calculaTempoEntrega(int distancia) {
		return super.calculaTempoEntrega(distancia) + tempoPreparo;
	}

	@Override
	public String toString() {
		return "Sanduiche {ingredientes = " + imprimirIngredientes() + "\n\t}";
	}

}
