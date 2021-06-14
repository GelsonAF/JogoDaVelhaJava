/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodavelha;

import java.util.Scanner;

/**
 * Controle do fluxo do Jogo
 */
public class Controle {
    Jogador player1 = new Jogador("Player 1", "XXX");
    Jogador player2 = new Jogador("Player 2", "OOO");
    
    public void checar(){
        
    }
    
    public void comecarPartida(){
        Tabuleiro.exibe();
        player1.setJogada();
        this.gravarJogada(player1.getJogada(),"X");
        //Tabuleiro.disponivel()
        Tabuleiro.exibe();
        player1.setJogada();
        this.gravarJogada(player1.getJogada(),"X");
        Tabuleiro.exibe();
        player1.setJogada();
        this.gravarJogada(player1.getJogada(),"X");
        this.buscaResultado();
        
        
    }
    
    public boolean buscaResultado(){
        if(Resultado.verificar().equals(player1.getCodigo())){
            System.out.println(player1.getNome()+" Venceu!");
            Tabuleiro.exibe();
        }
        if(Resultado.verificar().equals(player2.getCodigo())){
            System.out.println(player2.getNome()+" Venceu!");
            Tabuleiro.exibe();
        }
        return true;
    }
    
    public void gravarJogada(int posicao, String jogador){
        if(jogador.equals("X")){
            if(!(Tabuleiro.jogada(posicao, jogador))){
                System.out.println(player1.nome + " jogue novamente.");
                Tabuleiro.exibe();
                player1.setJogada();
                this.gravarJogada(player1.getJogada(),"X");
            }
         }else{
            if(!(Tabuleiro.jogada(posicao, jogador))){
                    Tabuleiro.exibe();
                    player2.setJogada();
                    Tabuleiro.jogada(player1.getJogada(),"O");
                    }
                }
    }
    
}
