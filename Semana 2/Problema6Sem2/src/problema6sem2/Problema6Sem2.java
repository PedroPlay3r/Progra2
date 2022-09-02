
package problema6sem2;

class Persona{
    
    private String nombre = "TextoDelString";
    private boolean pepe;
    
    public Persona(String sech, boolean potasio){
        nombre = sech;
        pepe = potasio;
    }
    
    public boolean esCasado(){
        return pepe;
    }
    
    public String elNombre(){
        return nombre;
    }

}

public class Problema6Sem2 {


    public static void main(String[] args) {
        
        Persona sex = new Persona("elpepe", true);
        boolean potato = sex.esCasado();
        String banana = sex.elNombre();
        System.out.println(potato);
        System.out.println(banana);
    }
    
}
