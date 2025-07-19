package objectos;

public class Locadora {
    private int dias;

    public Locadora(int dias) {
        this.dias = dias;
    }

    public int getDias() {
        return dias;
    }

    public double alugar(Veiculo veiculo, double diaria) {
        double totalAluguer = diaria * dias;

        // Verifica se é um carro e se tem mais de 2 portas
        /*if (veiculo instanceof Carro) {
            Carro c = (Carro) veiculo;
            if (c.getQtdPortas() > 2) {
                totalAluguer += 500;
            }
        }*/
        
        if(veiculo instanceof Carro && ((Carro)veiculo).getQtdPortas()>2) {
        	totalAluguer +=500;
        }

        return totalAluguer;
    }
}
