
package to;

import java.util.Date;


public class TOCampana extends TOVehiculos{
    
    private int idCampana;
    private Date inicioCampana;
    private Date fechaAlertaCampana;
    private Date fechaEjecucionCampaña;
    private int idVehiculoCampana;


    
    
    

    public TOCampana() {
    }

   
    
    
    
    
    public int getIdCampana() {
        return idCampana;
    }

    public void setIdCampana(int idCampana) {
        this.idCampana = idCampana;
    }

    public Date getInicioCampana() {
        return inicioCampana;
    }

    public void setInicioCampana(Date inicioCampana) {
        this.inicioCampana = inicioCampana;
    }

    public Date getFechaAlertaCampana() {
        return fechaAlertaCampana;
    }

    public void setFechaAlertaCampana(Date fechaAlertaCampana) {
        this.fechaAlertaCampana = fechaAlertaCampana;
    }

    public Date getFechaEjecucionCampaña() {
        return fechaEjecucionCampaña;
    }

    public void setFechaEjecucionCampaña(Date fechaEjecucionCampaña) {
        this.fechaEjecucionCampaña = fechaEjecucionCampaña;
    }

    public int getIdVehiculoCampana() {
        return idVehiculoCampana;
    }

    public void setIdVehiculoCampana(int idVehiculoCampana) {
        this.idVehiculoCampana = idVehiculoCampana;
    }
    
    
    
}
