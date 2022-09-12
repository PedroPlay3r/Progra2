
package problema3semana3;

    class Pelota{
        private int serie = 0;
    
        public Pelota(int pepe){
            serie = serie + pepe;
        }
    
        public int dameTuSerie(){
            return serie;
        }
    }

    class EnvaseCarton{
        private Pelota pel;
        
        public EnvaseCarton(){
            pel = null;
        }
        
        public Pelota metePelota(Pelota pepe){
            Pelota t = pel;
            if(pel == null){
                pel = pepe;
                return null;
            }
            
            if(pel != null){
                
                return pepe;
            }
            if(t != null){
                pel = pepe;
                pepe = t;
                    
            }    
                
            
            return pepe;
        }
        
        public Pelota damePelota(){
            Pelota ay = pel;
            Pelota sech = pel;
            pel = null;
            if(sech == null){
                pel = ay ;
                return null;
            }
            
            if(pel != null && ay == null){
                pel = sech;
                return sech;
            }
            
            return ay;
            
        }
              
    }

public class Problema3Semana3 {


    public static void main(String[] args) {
        
          EnvaseCarton ec = new EnvaseCarton();   
          Pelota p1 = new Pelota(5);                
          Pelota r1 = ec.metePelota(p1);    
          if(p1 == r1)System.out.println("NO entro"+": "+p1.dameTuSerie()); 
          else System.out.println("SI entro"+": "+p1.dameTuSerie()); 
          Pelota p2 = new Pelota(6); 

          Pelota r2 = ec.metePelota(p2); 
          if(p2 == r2)System.out.println("NO entro"+": "+p2.dameTuSerie()); 
          else System.out.println("SI entro"+": "+p2.dameTuSerie());  
              
          Pelota saca1 = ec.damePelota();  
          if(saca1!=null)System.out.println(saca1.dameTuSerie()); 
          else System.out.println(saca1);   
          Pelota saca2 = ec.damePelota();   
          if(saca2!=null)System.out.println(saca2.dameTuSerie());
          else System.out.println(saca2);   
    }
    
}
