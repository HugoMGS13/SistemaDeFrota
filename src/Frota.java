import java.util.ArrayList;

public class Frota{

    private ArrayList<Veiculo> ListadeFrota;

    public Frota(){
        this.ListadeFrota = new ArrayList<>();
    }

    public void adicionarnaFrota(Veiculo veiculo){
        try{   
            if(veiculo == null){
                System.out.println(new Entradanula("A entrada não pode ser nula"));

            }else if(veiculo.getMarca() == null || veiculo.getModelo() == null){

                System.out.println(new Entradanula("A entrada não pode ser nula"));
            }
            else{this.ListadeFrota.add(veiculo);}
        }
        catch(Exception e){
            System.out.println("Erro não identificado na adição desse veículo a frota.");
        }
    }

    public void manuntencao(Veiculo veiculo){
        if (veiculo.getMarca() == null || veiculo.getModelo() == null){
            System.out.println(new Entradanula("Entrada para manutenção não pode ser nula"));
        }else{
            veiculo.realizarManutencao();
        }
        
    }

    public void CriarViagem(String origem, String destino, double distancia, Veiculo veiculo){
        Viagem viagem = new Viagem<Veiculo>(origem, destino, distancia, veiculo);

        try{
            viagem.iniciarViagem();
            veiculo.carregarCarga();
            veiculo.descarregarCarga();
        }
        catch (NullPointerException e){
            System.out.println(new Entradanula("Entrada não pode ser nula"));
        }
        catch(Exception e){
            System.out.println("Erro não identificado na criação da Viagem");
        }
    }


    public void listarEventos(Veiculo veiculo, Rastreador rastreador) {
        rastreador.listarEventos(veiculo);
    }

}
