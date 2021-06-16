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
    
    Jogador player[] = {new Jogador("Player X", "XXX", "X"),
                        new Jogador("Player O", "OOO","O")} ;
    
    public void comecarPartida(){
        int aux = 0;
        while(this.buscaResultado()){
            this.exibir(aux);
            if(aux == 0){
                aux++;
            }else{
                aux--;
            }
        }
        Tabuleiro.exibe();
        
    }
    
    public boolean buscaResultado(){
        if(Resultado.verificar().equals(player[0].getCodigo())){
            System.out.println(player[0].getNome()+" Venceu!");
            return false;
        }
        if(Resultado.verificar().equals(player[1].getCodigo())){
            System.out.println(player[1].getNome()+" Venceu!");
            return false;
        }
        return true;
    }
    
    public void gravarJogada(int posicao, String jogador){
        if(jogador.equals("X")){
            if(!(Tabuleiro.jogada(posicao, jogador))){
                System.out.println(player[0].nome + " jogue novamente.");
                Tabuleiro.exibe();
                player[0].setJogada();
                this.gravarJogada(player[0].getJogada(), player[0].letra);
            }
         }else{
            if(!(Tabuleiro.jogada(posicao, jogador))){
                    System.out.println(player[1].nome + " jogue novamente.");
                    Tabuleiro.exibe();
                    player[1].setJogada();
                    this.gravarJogada(player[1].getJogada(),player[1].letra);
                    }
                }
    }
    
    public void exibir(int i){
        Tabuleiro.exibe();
        player[i].setJogada();
        this.gravarJogada(player[i].getJogada(), player[i].letra);
    }
    
}
