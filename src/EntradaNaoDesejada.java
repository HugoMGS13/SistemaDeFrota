import java.io.IOException;

public class EntradaNaoDesejada extends IOException {
    public EntradaNaoDesejada(String mensagem){
        super(mensagem);
    }
}
