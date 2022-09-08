
package problema1sem3;

class Balde{
    private int contenido=0;
    private int capacidad=0;
    
    public Balde(int cap){
        capacidad = capacidad + cap;
    }
    
    public void llenar(int litros){
        if(litros<0){
            litros = 0;
        }
        contenido = contenido + litros;
        if(contenido>capacidad){
            contenido = capacidad;
        }
        
      
        
    }
    
    public int verificar(){
        return contenido;
        
    }
    
    public int vaciar(int vac){
        if(vac < 0){
            return 0;
        }
        if(vac>=0){
            contenido = contenido - vac;
            
            if(contenido<0){
                contenido = 0;
            }
        }
        
        return contenido;
    }
}

public class Problema1Sem3 {
    
    


    public static void main(String[] args) {
        
        Balde b = new Balde(5);
        b.llenar(3);
        int s = b.vaciar(2);
        System.out.println(s);
        System.out.println(b.verificar());
        
        
        
    }
    
}
