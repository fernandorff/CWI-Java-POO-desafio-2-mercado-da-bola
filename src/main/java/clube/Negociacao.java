package clube;

import jogador.Jogador;

public class Negociacao {

    // RN20: na negociação deve ser verificado se o jogador possui interesse em jogar pelo clube ofertante.
    // RN21: na negociação deve ser verificado se o clube tem como pagar o valor de compra do jogador.
    public boolean negociar(Clube clubeInteressado, Jogador jogadorDeInteresse) {
        return (clubeInteressado.getSaldoDisponivel() >= jogadorDeInteresse.getValorDeMercado()) && jogadorDeInteresse.interesseEmSerVendidoParaOClube(clubeInteressado);
    }

    public void transferir(Clube clubeComprador, Jogador jogadorVendido) {

        // RN22: a transferencia de clube do jogador deve ocorrer na **Negociacao**, desde que as RN20 e RN21 sejam positivas.
        if (negociar(clubeComprador, jogadorVendido)) {
            jogadorVendido.setClubeAtual(clubeComprador);

            // RN23: se efetuada a trasnferência, o saldo disponível em caixa do clube deve ser atualizado.
            clubeComprador.saldoDisponivel -= jogadorVendido.getValorDeMercado();
        }

    }

}
