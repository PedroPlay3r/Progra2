
package problema2sem2;

class Balde{
    private int contenido=0;
    
    public Balde(){
        
    }
    
    public void llenar(int litros){
        contenido = contenido + litros;
        if(contenido>=13){
            contenido = 12;
        }
    }
    
    public int verificar(){
        return contenido;
        
    }
}

public class Problema2Sem2 {
    
    
    
    public static void main(String[] args) {
        int litros = 0;
        Balde b = new Balde();
        b.llenar(litros);
        int verificacion = b.verificar();
        System.out.println(verificacion);
        
        
    }
    
}
