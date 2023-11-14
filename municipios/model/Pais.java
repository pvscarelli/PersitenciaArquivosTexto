package L14.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Pais {

    private ArrayList<Estado> estados;
    private ArrayList<Cidade> cidades;

    public Pais() {
        estados = new ArrayList<>();
        cidades = new ArrayList<>();
    }

    public ArrayList<Estado> getEstados() {
        return estados;
    }

    public ArrayList<Cidade> getCidades() {
        return cidades;
    }

    public void incluirEstado(Estado estado) {
        estados.add(estado);
    }

    public void incluirCidade(Cidade cidade) {
        cidades.add(cidade);
    }

    public Cidade obterCidadeMenorPopulacao() {
        Cidade cidadeMenorPopulacao = cidades.get(0);

        for (Cidade c : cidades) {
            if (c.getPopulacao() < cidadeMenorPopulacao.getPopulacao()) {
                cidadeMenorPopulacao = c;
            }
        }
        return cidadeMenorPopulacao;
    }

    public Cidade obterCidadeMaiorPopulacao() {
        Cidade cidadeMaiorPopulacao = cidades.get(0);

        for (Cidade c : cidades) {
            if (c.getPopulacao() > cidadeMaiorPopulacao.getPopulacao()) {
                cidadeMaiorPopulacao = c;
            }
        }
        return cidadeMaiorPopulacao;
    }

    public Estado procurarEstado(String nomeEstado) {
        for (Estado e : estados) {
            if (e.getNome().equals(nomeEstado)) {
                return e;
            }
        }
        return null;
    }
}
