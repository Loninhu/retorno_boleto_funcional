import com.manoelcampos.retornoboleto.ProcessadorBoletos;

import java.net.URI;
import java.net.URISyntaxException;

public class Principal {
    public static void main(String[] args) throws URISyntaxException {
        final var processadorBrasil = new ProcessadorBoletos(ProcessadorBoletos::lerBancoBrasil);
        URI caminhoBrasil = Principal.class.getResource("banco-brasil-1.csv").toURI();
        processadorBrasil.processar(caminhoBrasil);

        final var processadorBradesco = new ProcessadorBoletos(ProcessadorBoletos::lerBradesco);
        URI caminhoBradesco = Principal.class.getResource("bradesco-1.csv").toURI();
        processadorBradesco.processar(caminhoBradesco);
    }
}
