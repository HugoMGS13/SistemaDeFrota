public class Carro extends Veiculo {

    public Carro(String marca, String modelo, int ano, double quilometragem) {
        super(marca, modelo, ano, quilometragem);
    }
    

    @Override
    public void acelerar() {
        System.out.println("vrum vrum");
    }

    @Override
    public void frear() {
        System.out.println("IHNHEHEHEN");
    }

    @Override
    public void realizarManutencao() {
        System.out.println("****************************************************\nRealizando manuntenção no carro " + getModelo());
    }

    @Override
    public void realizarViagem() {
        System.out.println("Viajando usando um(a) " + getModelo());
    }

    @Override
    public void carregarCarga() {
        System.out.println("Carregando carga máxima de um carro");
    }

    @Override
    public void descarregarCarga() {
        System.out.println("Descarregando a carga");
    }


    @Override
    public int calcularConsumo(){
        int km = 1000;
        int L = 50;
        int consumopkm = km/L;
        return consumopkm;
    }


    @Override
    public int calculareficiencia() {
        return calcularConsumo()/10;
    }
    
}
