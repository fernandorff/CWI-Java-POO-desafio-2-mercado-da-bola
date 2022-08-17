import clube.Clube;
import clube.Negociacao;
import jogador.*;
import org.junit.Assert;
import org.junit.Test;

public class MercadoDaBolaTest {

    @Test
    public void deveSerPossivelNegociarUmGoleiroComUmClubeQueTemSaldoEmCaixa() {

        Negociacao negociacao = new Negociacao();

        Clube clube = new Clube("Grêmio", 10, 1680);

        Goleiro goleiro = new Goleiro("Marcelo Grohe", 33, null, 8, 1, 1000, 5);

        boolean foiPossivelNegociar = negociacao.negociar(clube, goleiro);

        Assert.assertTrue(foiPossivelNegociar);

    }

    @Test
    public void naoDeveSerPossivelNegociarUmAtacanteComUmClubeQueTemReputacaoHistoricaMenorQueASua() {

        Negociacao negociacao = new Negociacao();

        Clube clube = new Clube("Internacional", 3, 10000);

        Atacante atacante = new Atacante("Cristiano Ronaldo", 35, null, 9, 1, 1000, 20);

        boolean foiPossivelNegociar = negociacao.negociar(clube, atacante);

        Assert.assertFalse(foiPossivelNegociar);

    }

    @Test
    public void naoDeveSerPossivelNegociarPorFaltaDeCaixaDisponivel() {

        Negociacao negociacao = new Negociacao();

        Clube clube = new Clube("Internacional", 3, 10);

        Zagueiro zagueiro = new Zagueiro("Cafu", 35, null, 7, 1, 1000);

        boolean foiPossivelNegociar = negociacao.negociar(clube, zagueiro);

        Assert.assertFalse(foiPossivelNegociar);

    }

    @Test
    public void deveCalcularCorretamenteOPrecoDoMeioCampoComMenosDeTrintaAnos() {

        MeioCampo kaka = new MeioCampo("Kaka", 28, null, 6, 0, 1000);

        Assert.assertEquals(1000, kaka.getValorDeMercado(), 0.01);

    }

    @Test
    public void deveCalcularCorretamenteOPrecoDoMeioCampoComMaisDeTrintaAnos() {

        MeioCampo kaka = new MeioCampo("Kaka", 35, null, 6, 0, 1000);

        MeioCampo kiki = new MeioCampo("Kiki", 35, null, 6, 0, 2000);

        Assert.assertEquals(700, kaka.getValorDeMercado(), 0.01);
        Assert.assertEquals(1400, kiki.getValorDeMercado(), 0.01);

    }

    @Test
    public void clubeTest(){

        Clube clube = new Clube("Vasco",6,10000);

        clube.setNome("Flamengo");

        Assert.assertEquals("Flamengo",clube.getNome());

        clube.setReputacaoHistorica(8);

        Assert.assertEquals(8,clube.getReputacaoHistorica());

        clube.setSaldoDisponivel(20000);

        Assert.assertEquals(20000,clube.getSaldoDisponivel(),0.01);

    }

    @Test
    public void lateralTest(){

        Lateral lateral = new Lateral("Roberto Carlos",31,null,5,1,1000,10);


        Assert.assertEquals(1176,lateral.getValorDeMercado(),0.01);
    }



}
