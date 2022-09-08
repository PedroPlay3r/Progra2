
package problema2sem3;

class Pelota{
    private int serie=0;
    
    public Pelota(int pepe){
        serie = serie + pepe;
    }
    
    public int dameTuSerie(){
        return serie;
    }
}


public class Problema2Sem3 {


    public static void main(String[] args) {
        
        Pelota p=new Pelota(5);
        int s = p.dameTuSerie();
        System.out.println(s);
    }
    
}
