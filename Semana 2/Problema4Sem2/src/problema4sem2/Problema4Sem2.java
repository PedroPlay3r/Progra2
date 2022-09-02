
package problema4sem2;

class Bebida{
    

    
    public Bebida(){
        
    }
    
    public String beber(){
        return new String("gluglu");
    }
}

public class Problema4Sem2 {


    public static void main(String[] args) {
        
        Bebida pepe = new Bebida();
        System.out.println(pepe.beber());

    }
    
}
