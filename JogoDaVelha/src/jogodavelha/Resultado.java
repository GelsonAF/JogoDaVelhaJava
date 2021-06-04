/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodavelha;

/**
 * Verifica se alguem ganhou e indica o vencedor
 */
public class Resultado {
    
    public static void verificar(){
        
        
               String aux = "";
        // horizontal 1
        for(int i=0; i<=2;i++){
        aux += Tabuleiro.matriz[0][i];
        }
        if(("XXX".equals(aux)||("OOO".equals(aux)))){
        conferir(aux);
        }
        //horizontal 2
        for(int i=0; i<=2;i++){
        aux += Tabuleiro.matriz[1][i];
        }
        if(("XXX".equals(aux)||("OOO".equals(aux)))){
        conferir(aux);
        }
        //horizontal 3
        for(int i=0; i<=2;i++){
        aux += Tabuleiro.matriz[2][i];
        }
        if(("XXX".equals(aux)||("OOO".equals(aux)))){
        conferir(aux);
        }
        // Vertical 1
        for(int i=0; i<=2;i++){
        aux += Tabuleiro.matriz[i][0];
        }
        if(("XXX".equals(aux)||("OOO".equals(aux)))){
        conferir(aux);
        }
        // Vertical 1
        for(int i=0; i<=2;i++){
        aux += Tabuleiro.matriz[i][0];
        }
        if(("XXX".equals(aux)||("OOO".equals(aux)))){
        conferir(aux);
        }
        // Vertical 2
        for(int i=0; i<=2;i++){
        aux += Tabuleiro.matriz[i][1];
        }
        if(("XXX".equals(aux)||("OOO".equals(aux)))){
        conferir(aux);
        }
        // Vertical 3
        for(int i=0; i<=2;i++){
        aux += Tabuleiro.matriz[i][2];
        }
        if(("XXX".equals(aux)||("OOO".equals(aux)))){
        conferir(aux);
        }
        
    }
    
    public static int conferir(String verificar){
        String aux;
        switch(verificar){
            case "XXX":
                System.out.println("Player1 Ganhou!");
                break;
            case "OOO":
                System.out.println("Player2 Ganhou!");
                break;
            default:
                
        }
        return 0;
    }
}
