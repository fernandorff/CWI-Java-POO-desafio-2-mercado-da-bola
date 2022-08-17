package jogador;

import clube.Clube;

public class Jogador {

    private String nome;
    private int idade;
    protected Clube clubeAtual;
    private int reputacaoHistorica;
    private int apetiteFinanceiro;
    private double preco;

    Clube semClube = new Clube("_Sem Clube_", 0, 0);

    public Jogador(String nome, int idade, Clube clubeAtual, int reputacaoHistorica, int apetiteFinanceiro, int preco) {
        this.nome = nome;
        this.idade = idade;
        this.preco = preco;

        // RN01.: o jogador deve possuir um método que retorna o nome do clube que está atuando. Se o atleta estiver sem clube, deve retornar _Sem Clube_.
        if (clubeAtual == null) {
            this.clubeAtual = semClube;

        } else {
            this.clubeAtual = clubeAtual;
        }

        // apetite financeiro maximo = 2
        if (apetiteFinanceiro > 2){
            this.apetiteFinanceiro = 2;
        }
        else{
            this.apetiteFinanceiro = apetiteFinanceiro;
        }

        // reputacao historica maxima = 10
        if (reputacaoHistorica > 10){
            this.reputacaoHistorica = 10;
        }
        else{
            this.reputacaoHistorica = reputacaoHistorica;
        }


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
        this.reputacaoHistorica = reputacaoHistorica;
    }

    public int getApetiteFinanceiro() {
        return apetiteFinanceiro;
    }

    public void setApetiteFinanceiro(int apetiteFinanceiro) {
        this.apetiteFinanceiro = apetiteFinanceiro;
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

    public double getValorDeMercado(){
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
    public void setClubeAtual(Clube clube) { this.clubeAtual = clube;

    }


}
