
package problema4semana3;

class Pelota {

    private int serie;

    public Pelota(int ingreso) {
        serie = ingreso;
    }

    public int dameTuSerie() {
        return serie;
    }
}

class Tubo {

    private Pelota A;
    private Pelota B;

    public Tubo() {
        A = null;
        B = null;
    }

    public Pelota meteA(Pelota p) {

        if (A == null) {
            A = p;
            return null;
        } else {
            if (B == null) {
                B = A;
                A = p;
                return null;
            } else {
                Pelota aux = B;
                B = A;
                A = p;
                return aux;
            }
        }
    }

    public Pelota meteB(Pelota p) {

        if (B == null) {
            B = p;
            return null;

        } else {
            if (A == null) {
                A = B;
                B = p;
                return null;
            } else {
                Pelota aux = A;
                A = B;
                B = p;
                return aux;
            }
        }
    }

    public void verTubo() {
        if(A == null){
            System.out.print("A:[null,");
        }else{
             System.out.print("A:[" + A.dameTuSerie()+ ",");
        }
        
        if(B== null){
            System.out.println("null]:B");
        }else{
            System.out.println(B.dameTuSerie() + "]:B");
        }
       
    }
}


public class Problema4Semana3 {


    public static void main(String[] args) {
        
        Tubo t = new Tubo();
        Pelota sale;
        Pelota nueva;
        t.verTubo();
        nueva = new Pelota(1001);
        sale = t.meteB(nueva);
        if (sale != null) {
            System.out.print(sale.dameTuSerie() + "<-");
        } else {
            System.out.print(sale + "<-");
        }
        System.out.println("[       ]<-" +1001);
        t.verTubo();
        nueva = new Pelota(5001);
        sale = t.meteA(nueva);
        System.out.print(5001 + "->[       ]");
        if (sale != null) {
            System.out.println("->" + sale.dameTuSerie());
        } else {
            System.out.println("->" + sale);
        }
        t.verTubo();
        for (int i = 0; i < 5; i++) {
            int s = 13 + i;
            nueva = new Pelota(s);
            sale = t.meteB(nueva);
            if (sale != null) {
                System.out.print(sale.dameTuSerie() + "<-");
            } else {
                System.out.print(sale + "<-");
            }
            System.out.println("[       ]<-" + s);
            t.verTubo();
        }
        for (int i = 0; i < 5; i++) {
            int s = 53 + i;
            nueva = new Pelota(s);
            sale = t.meteA(nueva);
            System.out.print(s + "->[       ]");
            if (sale != null) {
                System.out.println("->" + sale.dameTuSerie());
            } else {
                System.out.println("->" + sale);
            }
            t.verTubo();
        }

    
        
    }
    
}
