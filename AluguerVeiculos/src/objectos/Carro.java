package objectos;

public class Carro extends Veiculo {
	
	private int qtdPortas;
	
	public Carro(String marca, String modelo, double preco, int qtdPortas) {
		super(marca,  modelo,  preco);
		this.qtdPortas=qtdPortas;
		
	}

	public int getQtdPortas() {
		return qtdPortas;
	}
	
	
	@Override
	public String toString() {
return super.toString()+"Numero de portas: "+qtdPortas;

	}
	
	
	

}
