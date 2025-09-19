package business;

public class Carro extends Veiculo{
    private int qtdPortas;

    public Carro (String modelo, String fabricante, int ano, int qtdPortas) {
        super(modelo, fabricante, ano);
        this.qtdPortas = qtdPortas;
    }

    public void acelerar() {
        vAtual += 10;
        super.limitarMax();
    }
}
