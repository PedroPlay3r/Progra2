
package rotacion;

    class ComoStruct {
       int ar[]={3,2,1,5,7,3,0,10,5};
    }

public class Rotacion {

    public static void main(String[] args) {
      
        ComoStruct cs = new ComoStruct();
        int aux = 0;
        for(int i=0; i<cs.ar.length; i++){
            if(i==0){
                aux = cs.ar[0]; 
            }
            if(i!=0){
                cs.ar[i-1] = cs.ar[i];
                
                if(i==cs.ar.length-1){
                    cs.ar[cs.ar.length-1] = aux;
                }
            }
            
        }
        
        for(int i=0; i<cs.ar.length; i++){
            System.out.print(cs.ar[i]);
            if(i<cs.ar.length-1){
                System.out.print(",");
            }
        }
        
        System.out.print("\n");
    }
    
}
