import java.util.ArrayList;

public class Deposito{
    private ArrayList<Producto> var;
    public Deposito(){
        var = new ArrayList<Producto>();
    }
    public void addProducto(Producto a){
        var.add(a);
    }
    public Producto getProducto(){
        if(var.size() <= 0){
            return null;
        }
        else{
            Producto aux = var.get(0);
            var.remove(0);
            return aux;
        }
    }
}
