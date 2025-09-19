package business;

public class Moto extends Veiculo{
    public Moto(String modelo, String fabricante,int ano){
        super(modelo, fabricante,ano);
    }
    private boolean descansoAcionado;

    public void acelerar() {
        super.acelerar();
        descansoAcionado = false;
    }

    public void desaclerar() {
        super.desaclerar();
        descansoAcionado = (vAtual == 0);
    }

    public void parar(){
        super.parar();
        descansoAcionado = true;
    }
}
