package jogodavelha;

public class JogoDaVelha {


    public static void main(String[] args) {
        Jogador player1 = new Jogador("Player 1");
        Jogador player2 = new Jogador("Player 2");
        Tabuleiro.exibe();
        player1.setJogada();
        Tabuleiro.jogada(player1.getJogada(),"X");
        Tabuleiro.exibe();
        player2.setJogada();
        Tabuleiro.exibe();
        Tabuleiro.jogada(player2.getJogada(),"O");
        Tabuleiro.exibe();
        player1.setJogada();
        Tabuleiro.jogada(player1.getJogada(),"X");
        Tabuleiro.exibe();
        player1.setJogada();
        Tabuleiro.jogada(player1.getJogada(),"X");
        Tabuleiro.exibe();
        Resultado.verificar();
    }
    
}
