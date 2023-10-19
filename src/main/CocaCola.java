package main;

public class CocaCola extends Bebida{
    public CocaCola(int serie){
        super(serie);
    }
    public String consumir(){
        return "cocacola";
    }
    public String toString(){
        return super.toString();
    }
}
