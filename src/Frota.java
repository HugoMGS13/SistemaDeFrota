import java.util.ArrayList;

public class Frota{

    public void manuntencao(Veiculo veiculo){
        veiculo.realizarManutencao();
    }

    public void CriarViagem(String origem, String destino, double distancia, Veiculo veiculo){
        Viagem viagem = new Viagem<Veiculo>(origem, destino, distancia, veiculo);

        viagem.iniciarViagem();
        veiculo.carregarCarga();
        veiculo.descarregarCarga();
    }

    public static void main(String[] args) throws Exception {

        Veiculo moto = new Moto("Fiat", "CPX", 2023, 0);

        Veiculo carro = new Carro("Fiat", "Uno", 2010, 0);

        new Frota().manuntencao(carro);

        new Frota().CriarViagem("Belém", "Mosqueiro",400, carro);    

        new Frota().manuntencao(moto);

        new Frota().CriarViagem("Belém", "Castanhal",200, moto);        
    }
}
