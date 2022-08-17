package clube;

public class Clube {

    private String nome;
    private int reputacaoHistorica;
    protected double saldoDisponivel;

    public Clube (String nome, int reputacaoHistorica, double saldoDisponivel){
        this.nome = nome;
        this.reputacaoHistorica = reputacaoHistorica;
        this.saldoDisponivel = saldoDisponivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public int getReputacaoHistorica() {
        return reputacaoHistorica;
    }

    public void setReputacaoHistorica(int reputacaoHistorica) {
        this.reputacaoHistorica = reputacaoHistorica;
    }

    public double getSaldoDisponivel() {
        return saldoDisponivel;
    }

    public void setSaldoDisponivel(int novoSaldoDisponivel) {
        this.saldoDisponivel = novoSaldoDisponivel;
    }


}
