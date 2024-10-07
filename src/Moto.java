public class Moto extends Veiculo{

    public Moto(String marca, String modelo, int ano, double quilometragem) {
        super(marca, modelo, ano, quilometragem);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void acelerar() {
        System.out.println("VRUM VRUM");
    }

    @Override
    public void frear() {
        System.out.println("INHINHEHEN");
    }

    @Override
    public void realizarManutencao() {
        System.out.println("****************************************************\nRealizando manuntenção na moto "+ getModelo());
    }

    @Override
    public void realizarViagem() {
        System.out.println("Viajando usando uma " + getModelo());
    }

    @Override
    public void carregarCarga() {
        System.out.println("Carregando a carga máxima para uma moto");
    }

    @Override
    public void descarregarCarga() {
        System.out.println("Descarregando a carga");
    }

    @Override
    public int calcularConsumo() {
        int km = 1000;
        int L = 30;
        int consumopkm = km/L;
        return consumopkm;
    }

    @Override
    public int calculareficiencia() {
        return calcularConsumo()/10;
    }
    
}
