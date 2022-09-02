
package problema1sem2;

 class ComoStructM {
       int ar[][]={{3,2,0,-1,-2},{4,8,1,-3,-4},{6,9,5,-9,-7}};
   }

public class Problema1Sem2 {

    public static void main(String[] args) {

        ComoStructM cs = new ComoStructM();
        
        int aux=0;
        
        for(int i=0; i<cs.ar[0].length; i++){
            
            aux = cs.ar[cs.ar.length-1][i];
            
            cs.ar[cs.ar.length-1][i] = cs.ar[0][i];
            
            cs.ar[0][i] = aux;

        }
        
        int cont=0;
        
        for(int i=0; i<cs.ar[0].length; i++){
            
            System.out.print(cs.ar[0][i]);
            
            if(i<cs.ar[0].length-1){
                System.out.print(",");
            }
            
            
            
        }
        System.out.print("\n");
        
        for(int j=0; j<cs.ar[0].length; j++){
            
            System.out.print(cs.ar[1][j]);
            if(j<cs.ar[0].length-1){
                System.out.print(",");
            }
            
        }
        System.out.print("\n");
        
        for(int k=0; k<cs.ar[0].length; k++){
            
            System.out.print(cs.ar[2][k]);
            
            if(k<cs.ar[0].length-1){
                System.out.print(",");
            }
        }
        System.out.print("\n");
        
        if(cs.ar.length>3){
            for(int l=0; l<cs.ar[0].length; l++){
            
                System.out.print(cs.ar[3][l]);
            
                if(l<cs.ar[0].length-1){
                    System.out.print(",");
                }
            }
            System.out.print("\n");
        }
        
         
    }
    
}
