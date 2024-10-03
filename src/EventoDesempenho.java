public class EventoDesempenho<T extends Veiculo> {
    private double ConsumoCombus;
    private String eficiencia;

    public EventoDesempenho(double ConsumoCombus, String eficiencia){
        this.ConsumoCombus = ConsumoCombus;
        this.eficiencia = eficiencia;
    }
}
