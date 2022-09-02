
package problema7sem2;

class Bebida{
    private boolean llena;
    
    public Bebida(boolean potatoes){
        llena = potatoes;
    }
    
    public String beber(){
        if(llena == false){
            return null;
        }
        
        else{
            llena = false;
            return new String("gluglu");  
        }
    }
}

public class Problema7Sem2 {


    public static void main(String[] args) {
        Bebida po = new Bebida(true);
        String so = po.beber();
        System.out.println(so);
        so = po.beber();
        System.out.println(so);
        
        
    }
    
}
