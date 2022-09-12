
package problema5semana3;

class SumaResta{
    private float uno;
    private float dos;
    
    public SumaResta(float on, float tw){
        uno = on;
        dos = tw;
    }
    
    public float suma(){
        return uno + dos;
    }
    
    public float resta(){

        return uno - dos;
    }
}

public class Problema5Semana3 {


    public static void main(String[] args) {
        
        SumaResta pene = new SumaResta(5, 6);
        
        float h = pene.suma();
        System.out.println(h);
        
        float j = pene.resta();
        System.out.println(j);
    }
    
}
