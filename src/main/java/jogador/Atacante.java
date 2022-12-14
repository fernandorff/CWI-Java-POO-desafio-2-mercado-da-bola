package jogador;

import clube.Clube;

public class Atacante extends Jogador {

    // RN16: o atacante deve possuir a informação da quantidade de gols feitos no ano.
    private int golsMarcadosNoAno;
    private double penalidadeDeIdadeNoValorDeMercado = 0.75;

    public Atacante(String nome, int idade, Clube clubeAtual, int reputacaoHistorica, int apetiteFinanceiro, int preco, int golsMarcadosNoAno) {
        super(nome, idade, clubeAtual, reputacaoHistorica, apetiteFinanceiro, preco);
        this.setGolsMarcadosNoAno(golsMarcadosNoAno);
    }

    @Override
    public double getValorDeMercado() {
        // RN17: o cálculo do valor de compra do atacante tem um acréscimo de 1% para cada gol sobre o valor do calculo padrão (RN06).
        // RN18: o cálculo do valor de compra do atacante tem um desconto de 25% sobre o valor do calculado e com os acréscimos (RN18), mas apenas para atletas com mais de 30 anos.
        if (this.getIdade() > 30) {
            return (this.getPrecoComBonusDeApetiteFinanceiro() + (this.getPrecoComBonusDeApetiteFinanceiro() * this.getGolsMarcadosNoAno() / 100)) * penalidadeDeIdadeNoValorDeMercado;
        }
        return this.getPrecoComBonusDeApetiteFinanceiro() + (this.getPrecoComBonusDeApetiteFinanceiro() * golsMarcadosNoAno / 100);

    }

    @Override
    public boolean interesseEmSerVendidoParaOClube(Clube clube) {
        // RN19: atancante tem interesse em mudar de clube somente quando a reputação histórica do clube é maior que a sua.
        return (clube.getReputacaoHistorica() > this.getReputacaoHistorica());
    }

    public int getGolsMarcadosNoAno() {
        return golsMarcadosNoAno;
    }

    public void setGolsMarcadosNoAno(int golsMarcadosNoAno) {
        this.golsMarcadosNoAno = golsMarcadosNoAno;
    }

}