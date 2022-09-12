
package problema10semana3;

import java.util.ArrayList;

class Moneda{
    public Moneda(){
        
    }
    
    
}

class Bebida{
    private int serie;
    
    public Bebida(int s){
        serie = s;
    }
    
    public int getSerie(){
        return serie;
    }
    
    
    public String beber(){
        return new String("gluglu");
    }
}

class Expendedor{
    
    private Deposito d;
    
    public Expendedor(int e){
        d = new Deposito();
        
        for(int i=0; i<e; i++){
            d.addBebida(new Bebida(i));
        }
 
    }
    
    public Bebida comprarBebida(Moneda m){
        return d.getBebida();
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

public class Problema10Semana3 {


    public static void main(String[] args) {
       Expendedor a = new Expendedor(1);
       Moneda b = new Moneda();
       a.comprarBebida(null);
    }
    
}
