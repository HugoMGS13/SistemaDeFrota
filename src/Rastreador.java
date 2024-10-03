import java.util.ArrayList;

public class Rastreador<T extends Veiculo> {

    private ArrayList<T> ListaDeVeiculosRastreados = new ArrayList<>();

    public void AdicionarVeiculos(T veiculo){
        ListaDeVeiculosRastreados.add(veiculo);
    };

    public void RegistrarEvento(T veiculo, EventoDesempenho<T> evento){
        
    }

    public void monitorarEventos(){}

    public void Marcos(){}

}

