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
    public static boolean status;
    
    public static String verificar(){ // verificar se há um vencedor
        
        // verificar colunas
        for(int linha=0; linha<3;linha++){
            if((Tabuleiro.matriz[linha][0]+ Tabuleiro.matriz[linha][1]+ Tabuleiro.matriz[linha][2]).equals("XXX")){
                return "XXX";
            }
        }
        for(int linha=0; linha<3;linha++){
            if((Tabuleiro.matriz[linha][0]+ Tabuleiro.matriz[linha][1]+ Tabuleiro.matriz[linha][2]).equals("OOO")){
                return "OOO";
            }
        }
                // verificar linhas
        for(int coluna=0; coluna<3;coluna++){
            if((Tabuleiro.matriz[0][coluna]+ Tabuleiro.matriz[1][coluna]+ Tabuleiro.matriz[2][coluna]).equals("XXX")){
                return "XXX";
            }
        }
        for(int coluna=0; coluna<3;coluna++){
            if((Tabuleiro.matriz[0][0]+ Tabuleiro.matriz[coluna][1]+ Tabuleiro.matriz[2][coluna]).equals("OOO")){
                return "OOO";
            }
        }
            // diagonal 1
        if((Tabuleiro.matriz[0][0]+ Tabuleiro.matriz[1][1]+ Tabuleiro.matriz[2][2]).equals("XXX")){
            return "XXX";
        } 
        if((Tabuleiro.matriz[0][0]+ Tabuleiro.matriz[1][1]+ Tabuleiro.matriz[2][2]).equals("OOO")){
            return "OOO";
        } 
            //diagonal 2
        if((Tabuleiro.matriz[2][0]+ Tabuleiro.matriz[1][1]+ Tabuleiro.matriz[0][2]).equals("XXX")){
            return "XXX";
        } 
        if((Tabuleiro.matriz[2][0]+ Tabuleiro.matriz[1][1]+ Tabuleiro.matriz[0][2]).equals("OOO")){
            return "OOO";
        } 
        
        return "0";
    }
    
    public static int conferir(String verificar){
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
    
    
    //Getter e Setter

    public static boolean getStatus() {
        return status;
    }

    public static void setStatus(boolean status) {
        Resultado.status = status;
    }
    
    
}
