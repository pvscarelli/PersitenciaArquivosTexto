package L14.model;

public class Cidade {

    private int codigoIbge;
    private String nome;
    private long populacao;
    private Estado estado;

    public int getCodigoIbge() {
        return codigoIbge;
    }

    public void setCodigoIbge(int codigoIbge) {
        this.codigoIbge = codigoIbge;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getPopulacao() {
        return populacao;
    }

    public void setPopulacao(long populacao) {
        this.populacao = populacao;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

}
