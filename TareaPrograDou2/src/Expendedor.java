public class Expendedor{
    private Deposito coca;
    private Deposito sprite;
    private DepositoM monVu;
    private int precioBebidas;
    public static final int COCA=1;
    public static final int SPRITE=2;
    public Expendedor(int numBebidas, int precioBebidas){
        this.precioBebidas = precioBebidas;
        coca = new Deposito();
        sprite = new Deposito();
        for(int i = 0; i < numBebidas; i++){
            coca.addBebida(new CocaCola(i));
        }
        for(int i = 0; i < numBebidas; i++){
            sprite.addBebida(new Sprite(i));
        }
        monVu = new DepositoM();
    }
    public Bebida comprarBebida(Moneda m, int cual) {
        if(m == null){
            return null;
        }
        int valorMoneda = m.getValor();
        if (valorMoneda < this.precioBebidas) {
            while(valorMoneda != 0){
                monVu.addMoneda(new Moneda100());
                valorMoneda -= 100;
            }
            return null;
        }
        else{
            if(cual == COCA){
                Bebida b = coca.getBebida();
                if(b != null) {
                    if(valorMoneda == this.precioBebidas){
                        return b;
                    }
                    else {
                        valorMoneda -= this.precioBebidas;
                        while (valorMoneda != 0) {
                            monVu.addMoneda(new Moneda100());
                            valorMoneda = valorMoneda - 100;
                        }
                        return b;
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
                Bebida b = sprite.getBebida();
                if(b != null) {
                    if(valorMoneda == this.precioBebidas){
                        return b;
                    }
                    else {
                        valorMoneda -= this.precioBebidas;
                        while (valorMoneda != 0) {
                            monVu.addMoneda(new Moneda100());
                            valorMoneda = valorMoneda - 100;
                        }
                        return b;
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
