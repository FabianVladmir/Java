package ejemploherencia;
import java.util.Date;

public class Cliente extends Persona {
    private int idCliente;
    private java.util.Date fecha;
    private boolean vip;
    private static int contCliente;

    public Cliente(Date fecha, boolean vip){
        this.idCliente = ++contCliente;
        this.fecha = fecha;
        this.vip = vip;
    }

    public int getIdCliente(){
        return idCliente;
    }
    public Date getFecha(){
        return fecha;
    }
    public boolean isVip(){
        return vip;
    }
    public void setVip(boolean vip){
        this.vip = vip;
    }

    @Override
    public String toString(){
        return super.toString() +"Cliente{ "+  "idCLiente"+idCliente+", fechaRegistro" +fecha+", vip" +vip+']';
    }
}
