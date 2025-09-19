package business;

public abstract class Veiculo {
    private String modelo, fabricante;
    private int ano;
    protected int vAtual;
    public Veiculo(String modelo, String fabricante, int ano) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.ano = ano;
        vAtual = 0;
    }

    @Override
    public String toString() {
        return String.format("Veculo: %s\nVelocidade: %dkm/h", modelo, vAtual);
    }

    public void setvAtual(int vAtual) {
        this.vAtual = vAtual;
    }

    public void acelerar() {
        vAtual += 5;
        limitarMax();
    }

    public void desaclerar() {
        vAtual -= 5;
        limitarMin();
    }

    public void parar(){
        vAtual = 0;
    }

    protected void limitarMax(){
        if(vAtual > 180){
            vAtual = 180;
        }
    }

    protected void limitarMin(){
        if(vAtual < 0){
            vAtual = 0;
        }
    }
}
