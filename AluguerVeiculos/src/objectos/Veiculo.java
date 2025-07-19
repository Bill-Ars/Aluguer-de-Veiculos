package objectos;

public class Veiculo {
	private String marca;
	private String modelo;
	private double preco;
	
	
	public Veiculo (String marca, String modelo, double preco) {
		this.marca=marca;
		this.modelo=modelo;
		this.preco=preco;}


	public String getMarca() {
		return marca;
	}


	public String getModelo() {
		return modelo;
	}


	public double getPreco() {
		return preco;
	}


	@Override
	public String toString() {
		return "Veiculo [marca=" + marca + ", modelo=" + modelo + ", preco=" + preco + "]";
	}
	
	

}
