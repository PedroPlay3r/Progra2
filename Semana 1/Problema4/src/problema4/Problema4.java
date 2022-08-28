
package problema4;


public class Problema4 {


    public static void main(String[] args) {
        int R[]={3,2,1,5,7,3,0,10};
        int aux=0;
        for(int i=1; i<R.length; i++){
            aux = R[0];
            if(R[i]>aux){
                aux = R[i];
            }
        }
        
        System.out.print(aux + "\n");
    }
    
}
