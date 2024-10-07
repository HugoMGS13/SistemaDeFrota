public class EventoDesempenho<T extends Veiculo> {
    private T veiculo;
    private double consumoCombustivel; 
    private double eficiencia; 

    public EventoDesempenho(T veiculo, double consumoCombustivel, double eficiencia) {
        this.veiculo = veiculo;
        this.consumoCombustivel = consumoCombustivel;
        this.eficiencia = eficiencia;
    }

    public EventoDesempenho(){};

    public String getVeiculo() {
        return veiculo.getModelo();
    }

    public double getConsumoCombustivel() {
        return consumoCombustivel;
    }

    public double getEficiencia() {
        return eficiencia;
    }

    @Override
    public String toString() {
        return "EventoDesempenho{" +
                "veiculo=" + veiculo.getModelo() +
                ", consumoCombustivel=" + consumoCombustivel +
                ", eficiencia=" + eficiencia +
                '}';
    }
}
