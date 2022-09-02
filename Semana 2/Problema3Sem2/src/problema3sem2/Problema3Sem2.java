
package problema3sem2;

class PrimeraClase{
    
    
    private String se;
    
    public PrimeraClase(String elpepe){
        se = elpepe;
    }

    public String getString(){
        return se;
    }
    
}

public class Problema3Sem2 {


    public static void main(String[] args) {
        PrimeraClase p = new PrimeraClase("blabla");
        String s = p.getString();
        System.out.println(s);
    }
    
}
