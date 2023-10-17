import java.util.ArrayList;

public class Deposito{
    private ArrayList<Bebida> var;
    public Deposito(){
        var = new ArrayList<Bebida>();
    }
    public void addBebida(Bebida a){
        var.add(a);
    }
    public Bebida getBebida(){
        if(var.size() <= 0){
            return null;
        }
        else{
            Bebida aux = var.get(0);
            var.remove(0);
            return aux;
        }
    }
}
