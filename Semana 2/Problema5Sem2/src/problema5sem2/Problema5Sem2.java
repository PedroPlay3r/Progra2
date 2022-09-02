
package problema5sem2;

class OtraClase{
    private int sech=0;
    
    public OtraClase(int pepe){
        
        sech = pepe;
        
    }
    
    public int sacaDato(){
        return sech;
    }
}

public class Problema5Sem2 {


    public static void main(String[] args) {
        OtraClase puntero = new OtraClase(0);
        int potaxio = puntero.sacaDato();
        System.out.println(potaxio);
    }
    
}

