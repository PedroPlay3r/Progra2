
package problema3;


public class Problema3 {


    public static void main(String[] args) {
        int cont=0;
        int cont2=0;
        int suma=0;
        for(int i=0; i<500; i++){
            cont++;
            if(cont%2!=0){
                cont2++;
                suma = suma + cont;
            }
            if(cont2==100){
                break;
            }
            
            
        }
        
        System.out.print("La suma es: " + suma + "\n");
    }
    
}
