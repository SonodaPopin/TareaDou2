import java.util.ArrayList;

public class Deposito<T>{
    private ArrayList<T> almacen;
    public Deposito(){
        almacen = new ArrayList<T>();
    }
    public void addT(T a){
        almacen.add(a);
    }
    public T getT(){
        T x = var.get(0);
        almacen.remove(0);
        return x;
    }
}
