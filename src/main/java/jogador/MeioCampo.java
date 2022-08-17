package jogador;

import clube.Clube;

public class MeioCampo extends Jogador{

    private double penalidadeDeIdadeNoValorDeMercado = 0.7;

    public MeioCampo (String nome, int idade, Clube clubeAtual, int reputacaoHistorica, int apetiteFinanceiro, int preco){
        super(nome,idade,clubeAtual,reputacaoHistorica,apetiteFinanceiro,preco);
    }

    @Override
    public double getValorDeMercado() {
        // RN11: o cálculo do valor de compra do meio-campo tem um desconto de 30% sobre o valor do calculo padrão (RN06), mas apenas para atletas com mais de 30 anos.
        if (this.getIdade() > 30){
            return this.getPrecoComBonusDeApetiteFinanceiro()*penalidadeDeIdadeNoValorDeMercado;
        }
        return this.getPrecoComBonusDeApetiteFinanceiro();

    }

    @Override
    public boolean interesseEmSerVendidoParaOClube(Clube clube) {
        // RN12: meio-campista tem interesse em mudar de clube somente quando a reputação histórica do time é, no minimo, 2 pontos menores que a sua. (Sim, só aceita trocar pra um time pior, por algum motivo)
        return  (clube.getReputacaoHistorica() <= (this.getReputacaoHistorica() - 2));
    }

}
