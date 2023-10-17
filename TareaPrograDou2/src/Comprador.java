public class Comprador{
    private String sonido;
    private int vuelto;
    public Comprador(Moneda m, int cualBebida, Expendedor exp){
        Bebida bebida = exp.comprarBebida(m, cualBebida);
        vuelto = 0;
        if (bebida != null) {
            m = exp.getVuelto();
            while (m != null) {
                vuelto += m.getValor();
                m = exp.getVuelto();
            }
            sonido = bebida.beber();
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
    public String queBebiste(){
        return sonido;
    }
}
