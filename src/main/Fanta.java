package main;

public class Fanta extends Bebida{
    public Fanta(int serie){
        super(serie);
    }
    public String consumir(){
        return "fanta";
    }
    public String toString(){
        return super.toString();
    }
}
