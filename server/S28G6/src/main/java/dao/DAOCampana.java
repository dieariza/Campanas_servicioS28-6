package dao;

import db.ConexionDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import to.TOCampana;


public class DAOCampana {
    private final ConexionDB con= new ConexionDB();
    private final String nombreTabla ="Campana";
    private final String[] columnas = { "inicioCampana", "fechaAlertaCampana", "fechaEjecucionCampa├▒a", "idVehiculoCampana"};
   
    public DAOCampana() {
         
    }
    

    public int insertCampana(TOCampana TOCampana){
        String[] valores = {TOCampana.getInicioCampana().toString(),TOCampana.getFechaAlertaCampana().toString(),TOCampana.getFechaEjecucionCampa├▒a().toString(),String.valueOf(TOCampana.getIdVehiculoCampana())};
        try{
           return  con.insertar(nombreTabla, columnas, valores);
            
        }catch(Exception ex){
            System.out.println("Error en DAOCampana.insertCampana: "+ex.getMessage());
            return 0;
        }
            
    
    }
    
    
    
        public boolean actualizarCampana(TOCampana TOCampana){
        String[] valores = {TOCampana.getInicioCampana().toString(),TOCampana.getFechaAlertaCampana().toString(),TOCampana.getFechaEjecucionCampa├▒a().toString(),String.valueOf(TOCampana.getIdVehiculoCampana())};
        try{
            return con.actualizar(nombreTabla, columnas, valores, TOCampana.getIdCampana());
            
        }catch(Exception ex){
            System.out.println("Error en DAOCampana.actualizarCampana: "+ex.getMessage());
            return false;
        }
            
    
    }
        
        
        
        public boolean eliminarCampana(int idCampana){
             try{
            return con.borrar(nombreTabla, idCampana);
            
        }catch(Exception ex){
            System.out.println("Error en DAOCampana.eliminarCampana: "+ex.getMessage());
            return false;
        }
            
    
    }
        
        
        
        public ArrayList<TOCampana> consultarCampanas(){
        ArrayList<TOCampana> campanas = new ArrayList<>();
        TOCampana campana;
        try{
            ResultSet rs = con.consultarTabla(nombreTabla);
            
            while(rs.next()){
                campana = new TOCampana();
                campana.setInicioCampana(rs.getDate("inicioCampana"));
                campana.setFechaAlertaCampana(rs.getDate("fechaAlertaCampana"));
                campana.setFechaEjecucionCampa├▒a(rs.getDate("fechaEjecucionCampa├▒a"));
                campana.setIdVehiculoCampana(rs.getInt("idVehiculoCampana"));
                
            }
           
            return campanas;
        }catch(SQLException ex){
            System.out.println("Error en DAOCampanas.consultarCampanas: "+ex.getMessage());
            return null;
        }catch(Exception ex){
            System.out.println("Error en DAOCampanas.consultarCampanas: "+ex.getMessage());
            return null;
        }
            
    
    }
}