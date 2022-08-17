package jogador;

import clube.Clube;

public class Jogador {

    private Clube clubeAtual;
    private String nome;
    private int idade;
    private int reputacaoHistorica;
    private int apetiteFinanceiro;
    private double preco;



    public Jogador(String nome, int idade, Clube clubeAtual, int reputacaoHistorica, int apetiteFinanceiro, int preco) {

        this.setNome(nome);
        this.setIdade(idade);
        this.setPreco(preco);
        this.setApetiteFinanceiro(apetiteFinanceiro);
        this.setReputacaoHistorica(reputacaoHistorica);
        this.setClubeAtual(clubeAtual);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // RN02: a reputação histórica do atleta deve estar em uma faixa de zero (baixa reputatação) à dez (alta reputação).
    public int getReputacaoHistorica() {
        return reputacaoHistorica;
    }

    public void setReputacaoHistorica(int reputacaoHistorica) {
        // reputacao historica maxima = 10
        this.reputacaoHistorica = Math.min(10,reputacaoHistorica);
    }

    public int getApetiteFinanceiro() {
        return apetiteFinanceiro;
    }

    public void setApetiteFinanceiro(int apetiteFinanceiro) {
        // apetite financeiro maximo = 2
        this.apetiteFinanceiro = Math.min(2,apetiteFinanceiro);
    }

    // RN06: o jogador deve possuir um método que retorna o seu valor de compra e, por padrão, o cálculo do valor de compra do jogador retorna o seu preço acrescido pelo percentual correspondente ao seu apetite financeiro.
    public double getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    // RN03: o apetite finaceiro do jogador deve ser, somente, de três tipos. São eles:
    //
    //    0. INDIFERENTE: o valor da oferta deve ser de, no mínimo, o mesmo o valor do seu preço.
    //
    //    1. CONSERVADOR: o valor da oferta deve ser de, no mínimo, 40% acima do seu preço.
    //
    //    2. MERCENARIO: o valor da oferta deve ser de, no mínimo, 80% acima do seu preço.
    public double getPrecoComBonusDeApetiteFinanceiro() {
        return preco + (preco * 0.4 * apetiteFinanceiro);
    }

    public double getValorDeMercado() {
        return getPrecoComBonusDeApetiteFinanceiro();
    }

    // RN04: o jogador deve possuir um método que, dado um clube de entrada, retorne uma informação que determine se o jogador possui interesse em ser transferido para o clube em questão e, por padrão, o jogador só deve estar interessado em jogar por um clube que tenha uma reputação histórica de, no mínimo, 1 ponto.
    public boolean interesseEmSerVendidoParaOClube(Clube clube) {
        return (clube.getReputacaoHistorica() > 1);

    }

    public Clube getClubeAtual() {
        return clubeAtual;
    }

    // RN07: o jogador deve possuir um método para transferencia de clube que, por consequencia, irá atualizar seu clube atual.
    // RN01.: o jogador deve possuir um método que retorna o nome do clube que está atuando. Se o atleta estiver sem clube, deve retornar _Sem Clube_.
    public void setClubeAtual(Clube clubeAtual) {
        if (clubeAtual == null) {
            Clube semClube = new Clube("_Sem Clube_", 0, 0);
            this.clubeAtual = semClube;
        } else {
            this.clubeAtual = clubeAtual;
        }
    }


}
