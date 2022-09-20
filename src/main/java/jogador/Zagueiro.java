package jogador;

import clube.Clube;

public class Zagueiro extends Jogador {

    private double penalidadeDeIdadeNoValorDeMercado = 0.8;

    public Zagueiro(String nome, int idade, Clube clubeAtual, int reputacaoHistorica, int apetiteFinanceiro, int preco) {
        super(nome, idade, clubeAtual, reputacaoHistorica, apetiteFinanceiro, preco);
    }

    @Override
    public double getValorDeMercado() {
        // RN10: o cálculo do valor de compra do zagueiro tem um desconto de 20% sobre o valor do calculo padrão (RN06), mas apenas para atletas com mais de 30 anos.
        if (this.getIdade() > 30) {
            return getPrecoComBonusDeApetiteFinanceiro() * penalidadeDeIdadeNoValorDeMercado;
        }
        return this.getPreco() + (getPreco() * 0.4 * this.getApetiteFinanceiro());

    }

}
