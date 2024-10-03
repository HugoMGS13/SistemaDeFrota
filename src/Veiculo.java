public abstract class Veiculo implements OperacaoVeiculo {
    private String marca;
    private String modelo;
    private int ano;
    private double quilometragem;

    public Veiculo(String marca, String modelo, int ano, double quilometragem){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.quilometragem = quilometragem;
    }

    public abstract void acelerar();
    public abstract void frear();
    public abstract void realizarManutencao();

    //Getters n Setters
    public int getAno() {
        return ano;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public double getQuilometragem() {
        return quilometragem;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }
}
