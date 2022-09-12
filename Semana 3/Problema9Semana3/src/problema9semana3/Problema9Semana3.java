
package problema9semana3;

class Moneda{
    public Moneda(){
        
    }
    
    
}

class Bebida{
    
    public Bebida(){
        
    }
    
    
    public String beber(){
        return "gluglu";
    }
}

class Expendedor{
    
    public Expendedor(){
        
    }
    
    public Bebida comprarBebida(Moneda m){
        Bebida b = new Bebida();

        return b;
    }
}

public class Problema9Semana3 {


    public static void main(String[] args) {
        
        Bebida b = new Bebida();
        Expendedor e = new Expendedor();
        Moneda m = new Moneda();
        e.comprarBebida(m);
        b.beber();
    }
    
}
