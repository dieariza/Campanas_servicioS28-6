
package to;

import java.util.Date;


public class TOVehiculos extends TOUsuarios{
    
    private int idVehiculo;
    private String modelo;
    private Date fechaCompra;
    private Date fechaConsecionarioAdquisicion;
    private int idUsuariosVehiculos;

    
    
    



    public TOVehiculos() {
    }



    
    
    
    
    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public Date getFechaConsecionarioAdquisicion() {
        return fechaConsecionarioAdquisicion;
    }

    public void setFechaConsecionarioAdquisicion(Date fechaConsecionarioAdquisicion) {
        this.fechaConsecionarioAdquisicion = fechaConsecionarioAdquisicion;
    }

    public int getIdUsuariosVehiculos() {
        return idUsuariosVehiculos;
    }

    public void setIdUsuariosVehiculos(int idUsuariosVehiculos) {
        this.idUsuariosVehiculos = idUsuariosVehiculos;
    }
    
    
    
    
}
