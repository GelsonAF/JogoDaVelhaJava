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
    public String codigo;
    public int jogada;
    Scanner teclado;



    public Jogador(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
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
        public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
