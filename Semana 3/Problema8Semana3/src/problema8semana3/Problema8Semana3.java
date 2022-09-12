
package problema8semana3;
import java.util.ArrayList;

class Bebida{
    private int serie;
    
    public Bebida(int s){
        serie = s;
    }
    
    public int getSerie(){
        return serie;
    }
    
    public void beber(){

    }
}

class Deposito{
    
    private ArrayList <Bebida> xd;
    
    public Deposito(){
        xd = new ArrayList <Bebida>();
    }
    
    public void addBebida(Bebida b){
        xd.add(b);
    }
    
   public Bebida getBebida(){
       if(xd.size() == 0){
           return null;
       }
       else{
          return xd.remove(0);  
       }
       
   }
}

public class Problema8Semana3 {


    public static void main(String[] args) {

        Deposito d = new Deposito();
        d.addBebida(null);
        Bebida b = d.getBebida();

        
    }
    
}
