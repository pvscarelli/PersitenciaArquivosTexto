package L14Vprofessor.view;

import L14Vprofessor.model.Cidade;
import L14Vprofessor.model.Importador;
import L14Vprofessor.model.Pais;
import L14Vprofessor.model.Estado;
import java.io.File;
import java.io.FileNotFoundException;

public class App {

    public static void main(String[] args) throws FileNotFoundException {
        Pais Brasil = new Pais();
        Importador importadorDados = new Importador(Brasil);

        importadorDados.carregarDados(new File("C:/Users/A/Desktop/L14_municipios.csv"));

        Cidade maiorPopulacao = importadorDados.getPais().obterCidadeMaiorPopulacao();
        Cidade menorPopulacao = importadorDados.getPais().obterCidadeMenorPopulacao();

        System.out.println("**** Dados Cidade Maior População **** ");
        System.out.println("Código do IBGE: " + maiorPopulacao.getCodigoIbge()
                + "\nNome Cidade: " + maiorPopulacao.getNome()
                + "\nNome Estado: " + maiorPopulacao.getEstado().getNome()
                + "\nPopulação: " + maiorPopulacao.getPopulacao());

        System.out.println("**** Dados Cidade Menor População **** ");
        System.out.println("Código do IBGE: " + menorPopulacao.getCodigoIbge()
                + "\nNome Cidade: " + menorPopulacao.getNome()
                + "\nNome Estado: " + menorPopulacao.getEstado().getNome()
                + "\nPopulação: " + menorPopulacao.getPopulacao());
    }
}
