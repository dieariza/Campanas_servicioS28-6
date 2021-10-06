
package to;

import java.util.Date;

public class TOUsuarios {

    private  int idUsuarios ;
    private  String tipoIdentificacion ;
    private  String identificacion ;
    private  String nombres ;
    private  String apellidos ;
    private  Date fechaExpedicionDocumento ;
    private  String lugarExpedicionDocumento ;
    private  String ciudadResidencia ;
    private  String direccion ;
    private  String  telefono ;
    private  String usuario ;
    private  String clave;

    public TOUsuarios(int idUsuarios, String tipoIdentificacion, String identificacion, String nombres, String apellidos, Date fechaExpedicionDocumento, String lugarExpedicionDocumento, String ciudadResidencia, String direccion, String telefono, String usuario, String clave, int idVehiculo, String modelo, Date fechaCompra, Date fechaConsecionarioAdquisicion, int idUsuariosVehiculos, int idCampana, Date inicioCampana, Date fechaAlertaCampana, Date fechaEjecucionCampaña, int idVehiculoCampana) {
      
        this.idUsuarios = idUsuarios;
        this.tipoIdentificacion = tipoIdentificacion;
        this.identificacion = identificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaExpedicionDocumento = fechaExpedicionDocumento;
        this.lugarExpedicionDocumento = lugarExpedicionDocumento;
        this.ciudadResidencia = ciudadResidencia;
        this.direccion = direccion;
        this.telefono = telefono;
        this.usuario = usuario;
        this.clave = clave;
    }



    public TOUsuarios() {
    }

   

    
    
    
    
    public int getIdUsuarios() {
        return idUsuarios;
    }

    public void setIdUsuarios(int idUsuarios) {
        this.idUsuarios = idUsuarios;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFechaExpedicionDocumento() {
        return fechaExpedicionDocumento;
    }

    public void setFechaExpedicionDocumento(Date fechaExpedicionDocumento) {
        this.fechaExpedicionDocumento = fechaExpedicionDocumento;
    }

    public String getLugarExpedicionDocumento() {
        return lugarExpedicionDocumento;
    }

    public void setLugarExpedicionDocumento(String lugarExpedicionDocumento) {
        this.lugarExpedicionDocumento = lugarExpedicionDocumento;
    }

    public String getCiudadResidencia() {
        return ciudadResidencia;
    }

    public void setCiudadResidencia(String ciudadResidencia) {
        this.ciudadResidencia = ciudadResidencia;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    
    
    
    
}
