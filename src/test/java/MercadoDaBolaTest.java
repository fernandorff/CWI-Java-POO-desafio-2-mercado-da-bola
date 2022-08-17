import clube.Clube;
import jogador.Goleiro;
import jogador.Zagueiro;
import jogador.Atacante;
import jogador.Lateral;
import jogador.MeioCampo;
import negociacao.Negociacao;
import org.junit.Assert;
import org.junit.Test;

public class MercadoDaBolaTest {

    @Test
    public void deveSerPossivelNegociarUmGoleiroComUmClubeQueTemSaldoEmCaixa() {

        Negociacao negociacao = new Negociacao();
        Clube clube = new Clube("Grêmio", 10, 1680);
        Goleiro goleiro = new Goleiro("Marcelo Grohe", 33, null, 8, 1,1000 , 5);

        boolean foiPossivelNegociar = negociacao.negociar(clube, goleiro);

        Assert.assertEquals(foiPossivelNegociar, true);
    }

    @Test
    public void naoDeveSerPossivelNegociarUmAtacanteComUmClubeQueTemReputacaoHistoricaMenorQueASua() {

        Negociacao negociacao = new Negociacao();
        Clube clube = new Clube("Internacional", 3, 10000);
        Atacante atacante = new Atacante("Cristiano Ronaldo", 35, null, 9, 1, 1000, 20);

        boolean foiPossivelNegociar = negociacao.negociar(clube, atacante);

        Assert.assertEquals(foiPossivelNegociar, false);
    }

    @Test
    public void naoDeveSerPossivelNegociarPorFaltaDeCaixaDisponivel() {

        Negociacao negociacao = new Negociacao();
        Clube clube = new Clube("Internacional", 3, 10);
        Zagueiro zagueiro = new Zagueiro("Cafu", 35, null, 7, 1, 1000);

        boolean foiPossivelNegociar = negociacao.negociar(clube, zagueiro);

        Assert.assertEquals(foiPossivelNegociar, false);
    }

    @Test
    public void deveCalcularCorretamenteOPrecoDoMeioCampoComMenosDeTrintaAnos() {

        MeioCampo kaka = new MeioCampo("Kaka",28,null,6,0, 1000);

        double valorDeMercadoEsperado = 1000;

        Assert.assertEquals(kaka.getValorDeMercado(), valorDeMercadoEsperado,0.01);


    }

    @Test
    public void deveCalcularCorretamenteOPrecoDoMeioCampoComMaisDeTrintaAnos() {

        MeioCampo kaka = new MeioCampo("Kaka",35,null,6,0, 1000);

        double valorDeMercadoEsperado = 700;

        Assert.assertEquals(kaka.getValorDeMercado(), valorDeMercadoEsperado,0.01);


    }





}
