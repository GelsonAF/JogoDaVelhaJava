/*
 * 
 */
package jogodavelha;

import java.util.Scanner;

/**
 * @author gelso
 */
public class Jogador {
    public String nome;
    public int jogada;
    Scanner teclado;

    public Jogador(String nome) {
        this.nome = nome;
        this.teclado = new Scanner(System.in);
    }
    
    
    public void setJogada(){
        //while(teclado.hasNext()){
            System.out.print("Onde quer jogar -> "+ this.nome+": ");
            this.jogada = teclado.nextInt();
        }
   // }
    public int getJogada(){
        return this.jogada;
    }
    
}
