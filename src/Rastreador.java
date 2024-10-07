import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Rastreador<T extends Veiculo> {

    private ArrayList<T> listaDeVeiculosRastreados = new ArrayList<>();
    private Map<T, String> eventosPorVeiculo = new HashMap<>();

    public void registrarEvento(T veiculo, EventoDesempenho<T> evento) {
        /* Adiciona o evento à lista de eventos registrados para o veículo */ 
        eventosPorVeiculo.put(veiculo, evento.toString());
        System.out.println("Evento registrado para o veículo: " + veiculo.getModelo());
    }

    public void listarEventos(T veiculo) {
        System.out.println("Eventos desse veículo:");
        for (Map.Entry<T, String> entry : eventosPorVeiculo.entrySet()) {
            veiculo = entry.getKey();
            String evento = entry.getValue();
            System.out.println("Veículo: " + veiculo.getModelo() + " da marca: " + veiculo.getMarca() );
            System.out.println("Evento: " + evento);
        }
    }

    public void listarEventosGerais() {
        System.out.println("Eventos registrados por veículo:");
        for (Map.Entry<T, String> entry : eventosPorVeiculo.entrySet()) {
            T veiculo = entry.getKey();
            String evento = entry.getValue();
            System.out.println("Veículo: " + veiculo.getModelo() + " da marca: " + veiculo.getMarca() );
            System.out.println("  Evento: " + evento);
        }
    }
    

    public void adicionarVeiculo(T veiculo) {
        listaDeVeiculosRastreados.add(veiculo);
        eventosPorVeiculo.putIfAbsent(veiculo, ""); // Inicializa a lista de eventos se o veículo não estiver no mapa
    }
    
    public void monitorarEventos() {
    }

    public void marcos() {
    }

}
