package clube;

public class Clube {

    protected double saldoDisponivel;
    private String nome;
    private int reputacaoHistorica;

    public Clube(String nome, int reputacaoHistorica, double saldoDisponivel) {
        this.setNome(nome);
        this.setSaldoDisponivel(saldoDisponivel);
        this.setReputacaoHistorica(reputacaoHistorica);
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
        // reputacao historica maxima = 10
        this.reputacaoHistorica = Math.min(10, reputacaoHistorica);
    }

    public double getSaldoDisponivel() {
        return saldoDisponivel;
    }

    public void setSaldoDisponivel(double saldoDisponivel) {
        this.saldoDisponivel = saldoDisponivel;
    }


}
