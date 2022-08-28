
package invertirarreglo;


public class Invertirarreglo {
    static int R[]={3,2,1,5,7,3,0,10,5};

    public static void main(String[] args) {
        int aux;
        int cont=0;
        for(int i=0; i<R.length/2; i++){
           aux = R[i];
           R[i] = R[R.length - 1 - cont];
           R[R.length - 1 - cont] = aux;
           cont++;
        }
        
        cont=0;
        
        for(int i = 0; i < R.length; i++){
            System.out.print(R[i]);
            if(cont!=R.length-1){
                cont++;
                System.out.print(",");
            }
        }
        
        System.out.print("\n");
    }  
}
