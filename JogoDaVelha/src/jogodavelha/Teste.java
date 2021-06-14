/*
 * To change this license header, choose License Headers in Project Properties.
 */
package jogodavelha;

/**
 * Teste
 */
public class Teste {
    
    public static String verificar(){
        for(int i=0; i<3;i++){
            if((Tabuleiro.matriz[i][0]+ Tabuleiro.matriz[i][1]+ Tabuleiro.matriz[i][2]).equals("XXX")){
                return "XXX";
            }
        }
        for(int i=0; i<3;i++){
            if((Tabuleiro.matriz[i][0]+ Tabuleiro.matriz[i][1]+ Tabuleiro.matriz[i][2]).equals("OOO")){
                return "OOO";
            }
        }
        return "0";
    }
    
    public static void apresentandoVencedor(){
        System.out.println("Venceu XXX");
    }
}
