
package jogodavelha;


public class Tabuleiro {
    
 public static String[][] matriz = {{"1","2","3"},{"4","5","6"},{"7","8","9"}};
    
    
    public static void exibe(){
        int x = 0;
        for(int i=0; i<=2; i++){
            System.out.println("");
            for(int z=0; z<=2; z++){
                System.out.print(matriz[i][z]);
                x++;
                if(x <=2){
                 System.out.print(" | ");   
                }else{
                    x=0;
                }
                
            }
        }
        System.out.println("\n");
    }
    
    public static boolean jogada(int jogada, String marcador){
        int aux=1;
        int posicao = jogada;
        int j=0;
        int k=0;
        
        if((posicao <1)||(posicao>9)){//verifica se o numero digitado está entre 1 e 9
            System.out.println("o nùmero digitado não é uma posiçao válida");
            System.out.println("Tente jogue novamente ");
            return false;
            }
            if(aux != posicao){// 
                aux=0;
                for(int i=0;((i<=2)&&(aux != posicao));i++){

                    for(int z=0;((z<=2)&&(aux != posicao));z++){
                        aux++;
                        k=z;
                        }
                        j=i;
                    }
                }

            if(Tabuleiro.matriz[j][k].equals("X")||Tabuleiro.matriz[j][k].equals("O")){
            System.out.println("Posição não está disponível");
            return false;
            }else{
            Tabuleiro.matriz[j][k]= marcador; 
                }          

        return true;
            
    }
    
    public static boolean disponivel(){
        
        for(int i = 0; i<=2; i++){
            for(int z=0; z<=2; z++){
                if(!(Tabuleiro.matriz[i][z].equals("X")) || !(Tabuleiro.matriz[i][z].equals("O"))){
                    return true;
                }
            }
        }
        
        return false;
    }
    
    public static String getPosicao(int i, int z){
        return Tabuleiro.matriz[i][z];
    }
    
    public static void zerarTabuleiro(){
        //Tabuleiro.matriz = {{"1","2","3"},{"4","5","6"},{"7","8","9"}};
    }
    
}
        

    
