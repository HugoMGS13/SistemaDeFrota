public class Teste {
    public static void main(String[] args) throws Exception {

        Veiculo motonull = new Moto(null, null, 0, 0);

        new Frota().manuntencao(motonull);

        Frota frota = new Frota();

        Veiculo moto = new Moto("Fiat", "CPX", 2023, 0);

        Veiculo carro = new Carro("Fiat", "Uno", 2010, 0);

        frota.adicionarnaFrota(carro);

        Rastreador rastreador = new Rastreador<>();

        rastreador.listarEventos(carro); //Colocar erro de listagem de eventos de objetos sem eventos

        EventoDesempenho evento = new EventoDesempenho<Veiculo>(moto, moto.calcularConsumo(), moto.calculareficiencia());

        rastreador.registrarEvento(moto, evento);

        rastreador.listarEventos(moto);


        new Frota().manuntencao(carro);

        new Frota().CriarViagem("Belém", "Mosqueiro",400, carro);    

        new Frota().manuntencao(moto);

        new Frota().CriarViagem("Belém", "Castanhal",200, moto);        
    }
}
