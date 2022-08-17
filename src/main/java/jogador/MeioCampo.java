package jogador;

import clube.Clube;

public class MeioCampo extends Jogador{

    public MeioCampo (String nome, int idade, Clube clubeAtual, int reputacaoHistorica, int apetiteFinanceiro, int preco){
        super(nome,idade,clubeAtual,reputacaoHistorica,apetiteFinanceiro,preco);
    }


    public double getValorDeMercado() {
        // RN11: o cálculo do valor de compra do meio-campo tem um desconto de 30% sobre o valor do calculo padrão (RN06), mas apenas para atletas com mais de 30 anos.
        if (this.getIdade() > 30){
            return this.getPrecoComBonusDeApetiteFinanceiro()*0.7;
        }
        return this.getPrecoComBonusDeApetiteFinanceiro();

    }

    public boolean interesseEmSerVendidoParaOClube(Clube clube) {
        // RN12: meio-campista tem interesse em mudar de clube somente quando a reputação histórica do time é, no minimo, 2 pontos menores que a sua. (Sim, só aceita trocar pra um time pior, por algum motivo)
        if (clube.reputacaoHistorica <= (this.getReputacaoHistorica() - 2)) {
            return true;
        }
        return false;

    }

}
