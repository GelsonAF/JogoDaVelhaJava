
package jogodavelha;


public class Tabuleiro {
    
 public static String[][] matriz = {{"1","2","3"},{"4","5","6"},{"7","8","9"}};
 //public static int[][] matriz = {{1,2,3},{4,5,6},{7,8,9}};
  //public static String[][] matriz = new String [3][3];
    
    
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
    
    public static void jogada(int jogada, String marcador){
        int aux=1;
        int posicao = jogada;
        int j=0;
        int k=0;
      
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
        System.out.println("Posção não disponível");
        }else{
            Tabuleiro.matriz[j][k]= marcador; 
        }       
    
    }
    
    public static String getPosicao(int i, int z){
        return Tabuleiro.matriz[i][z];
    }
    
}
        

    
