public class Expendedor{
    private Deposito coca;
    private Deposito sprite;
    private DepositoM monVu;
    private int precioProducto;
    public static final int COCA=1;
    public static final int SPRITE=2;
    public Expendedor(int numProductos, int precioProducto){
        this.precioProducto = precioProducto;
        coca = new Deposito();
        sprite = new Deposito();
        for(int i = 0; i < numProductos; i++){
            coca.addProducto(new CocaCola(i));
        }
        for(int i = 0; i < numProductos; i++){
            sprite.addProducto(new Sprite(i));
        }
        monVu = new DepositoM();
    }
    public Producto comprarProducto(Moneda m, int cual) {
        if(m == null){
            return null;
        }
        int valorMoneda = m.getValor();
        if (valorMoneda < this.precioProducto) {
            while(valorMoneda != 0){
                monVu.addMoneda(new Moneda100());
                valorMoneda -= 100;
            }
            return null;
        }
        else{
            if(cual == COCA){
                Producto p = coca.getProducto();
                if(p != null) {
                    if(valorMoneda == this.precioProducto){
                        return p;
                    }
                    else {
                        valorMoneda -= this.precioProducto;
                        while (valorMoneda != 0) {
                            monVu.addMoneda(new Moneda100());
                            valorMoneda = valorMoneda - 100;
                        }
                        return p;
                    }
                }
                else{
                    while(valorMoneda != 0){
                        monVu.addMoneda(new Moneda100());
                        valorMoneda -= 100;
                    }
                    return null;
                }
            }
            else if(cual == SPRITE){
                Producto p = sprite.getProducto();
                if(p != null) {
                    if(valorMoneda == this.precioProducto){
                        return p;
                    }
                    else {
                        valorMoneda -= this.precioProducto;
                        while (valorMoneda != 0) {
                            monVu.addMoneda(new Moneda100());
                            valorMoneda = valorMoneda - 100;
                        }
                        return p;
                    }
                }
                else{
                    while(valorMoneda != 0){
                        monVu.addMoneda(new Moneda100());
                        valorMoneda -= 100;
                    }
                    return null;
                }
            }
            else{
                while(valorMoneda != 0) {
                    monVu.addMoneda(new Moneda100());
                    valorMoneda -= 100;
                }
                return null;
            }
        }
    }
    public Moneda getVuelto(){
        return monVu.getMoneda();
    }
}