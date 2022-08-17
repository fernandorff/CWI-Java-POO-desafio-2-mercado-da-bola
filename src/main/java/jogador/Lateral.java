package jogador;

import clube.Clube;

public class Lateral extends Jogador{

    // RN13: o lateral deve possuir a informação da quantidade de cruzamentos certeiros no ano.
    public int cruzamentosCerteirosNoAno;

    public Lateral (String nome, int idade, Clube clubeAtual, int reputacaoHistorica, int apetiteFinanceiro, int preco){
        super(nome,idade,clubeAtual,reputacaoHistorica,apetiteFinanceiro,preco);
    }


    public double getValorDeMercado() {
        // RN14: o cálculo do valor de compra do lateral tem um acréscimo de 2% para cada cruzamento certeiro calculado sobre o valor do calculo padrão (RN06).
        // RN15: o cálculo do valor de compra do lateral tem um desconto de 30% sobre o valor calculado com os acréscimos da RN14, mas apenas para atletas com mais de 28 anos. (Primeiro contrato da historia onde o cara recebe menos por jogar melhor)
        if (idade > 28){
            return (this.getPrecoComBonusDeApetiteFinanceiro() + (this.getPrecoComBonusDeApetiteFinanceiro()*cruzamentosCerteirosNoAno*2/100))*0.7;
        }
        return this.getPrecoComBonusDeApetiteFinanceiro() + (this.getPrecoComBonusDeApetiteFinanceiro()*cruzamentosCerteirosNoAno*2/100);

    }

}