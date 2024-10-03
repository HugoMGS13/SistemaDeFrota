public class Viagem<T extends Veiculo> {
    private String origem;
    private String destino;
    private double distancia;
    private T veiculo;

    public Viagem(String origem, String destino, double distancia, T veiculo){
        this.origem = origem;
        this.destino = destino;
        this.distancia = distancia;
        this.veiculo = veiculo;
    }

    public void iniciarViagem(){
        System.out.println("****************************************************\nViajando de " + origem + " para " + destino + ". A distância da viagem é de " + distancia + " km.");
        veiculo.realizarViagem();
    }

    // Getters n Setters
    public String getDestino() {
        return destino;
    }
    public double getDistancia() {
        return distancia;
    }
    public String getOrigem() {
        return origem;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }
    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
    public void setOrigem(String origem) {
        this.origem = origem;
    }

}
