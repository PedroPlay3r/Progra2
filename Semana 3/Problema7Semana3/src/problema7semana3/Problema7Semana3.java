
package problema7semana3;

class Bebida{
    
    public static final int VOLUMEN = 500;
    private int contenido;
    private int serie;
    
    public Bebida(int ser){
        contenido = 0;
        serie = ser;
    }
    
    public int getSerie(){
        return serie;
    }
    
    public void llenar(int sum){
        if(sum >= 0){
            contenido = contenido + sum;
            if(contenido > Bebida.VOLUMEN){
                contenido = Bebida.VOLUMEN;
            }
        }

    }
    
    public int beber(int res){
        int aux;
        aux = contenido;
        if(res <= contenido){
            contenido = contenido - res;
            return res;
        }
        
        contenido = 0;
        
        return aux;
    }
    
}

public class Problema7Semana3 {


    public static void main(String[] args) {
        
        Bebida pepe = new Bebida(10);   
        pepe.llenar(501);
        int l = pepe.getSerie();
        System.out.println(l);
        int s1 = pepe.beber(100);
        System.out.println(s1);

    }
    
}
