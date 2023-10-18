public class Comprador{
    private String sonido;
    private int vuelto;
    public Comprador(Moneda m, int cualProducto, Expendedor exp){
        Producto producto = exp.comprarProducto(m, cualProducto);
        vuelto = 0;
        if (producto != null) {
            m = exp.getVuelto();
            while (m != null) {
                vuelto += m.getValor();
                m = exp.getVuelto();
            }
            sonido = producto.consumir();
        }
        else {
            if(m == null){
                vuelto = 0;
                sonido = null;
            }
            else {
                m = exp.getVuelto();
                while (m != null) {
                    vuelto += m.getValor();
                    m = exp.getVuelto();
                }
                sonido = null;
            }
        }
    }
    public int cuantoVuelto(){
        return vuelto;
    }
    public String queconsumiste(){
        return sonido;
    }
}
