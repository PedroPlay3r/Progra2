
package problema6semana3;

class SumaResta{
    private float uno;
    private float dos;
    
    public SumaResta(float po, float pu){

        uno = po;
        dos = pu;
    }
    
    public float suma(){
        return uno + dos;
    }
    
    public float resta(){

        return uno - dos;
    }
    
    public float getUno(){
        return uno;
    }
    
    public float getDos(){
        return dos;
    }
}

class CuatroOperaciones{
    private SumaResta elpepe;
    
    public CuatroOperaciones(float on, float tw){
        elpepe = new SumaResta(on,tw);
    }
    
    public float multiplica(){
        return elpepe.getUno()*elpepe.getDos();
    }
    
    public float divide(){
        return elpepe.getUno()/elpepe.getDos();
    }
    
    public float suma(){
        return elpepe.suma();
    }
    
    public float resta(){
        return elpepe.resta();
    }
    
}

public class Problema6Semana3 {


    public static void main(String[] args) {
        
        CuatroOperaciones pene = new CuatroOperaciones(5, 6);
        
        float h = pene.suma();
        System.out.println(h);
        
        float j = pene.resta();
        System.out.println(j);
        
        float k = pene.multiplica();
        System.out.println(k);
        
        float l = pene.divide();
        System.out.println(l);
    }
    
}
