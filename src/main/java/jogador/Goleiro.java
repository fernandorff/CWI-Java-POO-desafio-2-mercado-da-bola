package jogador;

import clube.Clube;

public class Goleiro extends Jogador{

    // RN08: o goleiro deve possuir a informação da quantidade de penaltis defendidos no ano.
    public int quantidadeDePenaltisDefendidos;

    public Goleiro (String nome, int idade, Clube clubeAtual, int reputacaoHistorica, int apetiteFinanceiro, int preco, int quantidadeDePenaltisDefendidos){
        super(nome,idade,clubeAtual,reputacaoHistorica,apetiteFinanceiro,preco);
        this.quantidadeDePenaltisDefendidos = quantidadeDePenaltisDefendidos;
    }

    // RN09: o cálculo do valor de compra do goleiro tem um acréscimo de 4% para cada penalti defendido sobre o valor do calculo padrão (RN06).
    public double getValorDeMercado() {
        return this.getPrecoComBonusDeApetiteFinanceiro() + (quantidadeDePenaltisDefendidos*4*getPrecoComBonusDeApetiteFinanceiro()/100);
    }

    public int getQuantidadeDePenaltisDefendidos(){
        return quantidadeDePenaltisDefendidos;
    }

    public void setQuantidadeDePenaltisDefendidos(int quantidadeDePenaltisDefendidos){
        this.quantidadeDePenaltisDefendidos = quantidadeDePenaltisDefendidos;
    }
}
