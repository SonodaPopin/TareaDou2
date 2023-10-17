import java.util.ArrayList;

public class DepositoM{
    private ArrayList<Moneda> var;
    public DepositoM(){
        var = new ArrayList<Moneda>();
    }
    public void addMoneda(Moneda a){
        var.add(a);
    }
    public Moneda getMoneda(){
        if(var.size() <= 0){
            return null;
        }
        else{
            Moneda aux = var.get(0);
            var.remove(0);
            return aux;
        }
    }
}
