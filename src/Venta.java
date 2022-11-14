import java.util.Date;
public class Venta {
     private int cantCuotas;
     private String nombre;
     private Date  fechaVenta;

     public int getCantCuotas() {
          return cantCuotas;
     }

     public void setCantCuotas(int cantCuotas) {
          this.cantCuotas = cantCuotas;
     }
     public void setNombre(String nombre) {
          this.nombre = nombre;
     }

     public String getNombre() {
          return nombre;
     }

     public Date getFechaVenta() {
          return fechaVenta;
     }

     public void setFechaVenta(Date fechaVenta) {
          this.fechaVenta = fechaVenta;
     }

}
