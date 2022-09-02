
package problema8sem2;

class Promediador{
    private int s;
    private int n;
    
    public Promediador(){
        s = 0;
        n = 0;
    }
    
    public void agregaNumero(int num){
        s = s + num;
        n++;
    }
    
    public float promedio(){
        return (float)s/(float)n;
    }
    
    public int numero(){
        return n;
    }
    
    
    
}

public class Problema8Sem2 {


    public static void main(String[] args) {
        Promediador pepe = new Promediador();
        pepe.agregaNumero(69);
        pepe.agregaNumero(420);
        pepe.agregaNumero(69420);
        float p = pepe.promedio();
        int SanMarino = pepe.numero();
        System.out.println(p);
        System.out.println(SanMarino);
        
    }
    
}
