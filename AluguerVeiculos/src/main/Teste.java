package main;
import objectos.*;


public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Veiculo vculo1 = new Veiculo ("MBW", "KMT", 5000);
		Veiculo  vculo2 = new Veiculo ("TOYOTA", "KT", 9000);
		Veiculo vculo3 = new Veiculo ("MBW", "KMT", 5000);
		
		
		Carro carro1 = new Carro ("HILUX","tjd", 750, 5);
		Carro carro2 = new Carro ("HONDA","mguert", 400, 2);
		Carro carro3 = new Carro ("Lamborgini","e64", 792, 3);
		
		
		
		Locadora lc = new Locadora(5);
		
		System.out.println(lc.alugar(vculo1, 450));
	    System.out.println(lc.alugar(vculo3, 450));
		
		
		System.out.println(lc.alugar(carro1, 500));
		System.out.println(lc.alugar(vculo2, 500));
		
		
		

	}

}
