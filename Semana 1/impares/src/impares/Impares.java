
package impares;

    class ComoStruct {
       int ar[]={3,2,1,5,7,3,0,10,5};
    }
public class Impares {
    
   

    public static void main(String[] args) {
      ComoStruct cs = new ComoStruct();
      
      for(int i=0; i<cs.ar.length; i++){
          
          if(cs.ar[i]%2!=0){
              System.out.print(cs.ar[i]);
              if(i<cs.ar.length-1){
                  System.out.print(",");
              }
          }
          
      }
      
      System.out.print("\n");
    }
    
}
