package dao;

import db.ConexionDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import to.TOVehiculos;


public class DAOVehiculos {
    private final  ConexionDB con= new ConexionDB();
    private final String nombreTabla ="Vehiculos";
    private final String[] columnas = {"idVehiculo","modelo","fechaCompra","fechaConsecionarioAdquisicion","idUsuariosVehiculos"};
   
    public DAOVehiculos() {
        
        
    }
    
    
    
    
    
    public int insertVehiculo(TOVehiculos ToVehiculo){
        String[] valores = {ToVehiculo.getModelo(),ToVehiculo.getFechaCompra().toString(),ToVehiculo.getFechaConsecionarioAdquisicion().toString(),String.valueOf(ToVehiculo.getIdUsuariosVehiculos())};
        try{
           return  con.insertar(nombreTabla, columnas, valores);
            
        }catch(Exception ex){
            System.out.println("Error en DAOVehiculos.insertarVehiculo: "+ex.getMessage());
            return 0;
        }
            
    
    }
    
    
    
        public boolean actualizarVehiculo(TOVehiculos ToVehiculo){
        String[] valores = {ToVehiculo.getModelo(),ToVehiculo.getFechaCompra().toString(),ToVehiculo.getFechaConsecionarioAdquisicion().toString(),String.valueOf(ToVehiculo.getIdUsuariosVehiculos())};
        try{
            return con.actualizar(nombreTabla, columnas, valores, ToVehiculo.getIdUsuarios());
            
        }catch(Exception ex){
            System.out.println("Error en DAOVehiculos.insertarVehiculo: "+ex.getMessage());
            return false;
        }
            
    
    }
        
        
        
        public boolean eliminarVehiculo(int idVehiculo){
             try{
            return con.borrar(nombreTabla, idVehiculo);
            
        }catch(Exception ex){
            System.out.println("Error en DAOVehiculos.insertarVehiculo: "+ex.getMessage());
            return false;
        }
            
    
    }
        
        
        
        public ArrayList<TOVehiculos> consultarVehiculo(int idVehiculo){
        ArrayList<TOVehiculos> vehiculos = new ArrayList<>();
        TOVehiculos vehiculo;
        try{
            ResultSet rs = con.consultarTabla(nombreTabla);
            
            while(rs.next()){
                vehiculo = new TOVehiculos();

                vehiculo.setModelo(rs.getString("modelo"));
                vehiculo.setFechaCompra(rs.getDate("fechaCompra"));
                vehiculo.setFechaConsecionarioAdquisicion(rs.getDate("fechaConsecionarioAdquisicion"));
                vehiculo.setIdUsuariosVehiculos(rs.getInt("idUsuariosVehiculos"));
                
                
            }
            
            
            return vehiculos;
        }catch(SQLException ex){
            System.out.println("Error en DAOVehiculos.insertarVehiculo: "+ex.getMessage());
            return null;
        }catch(Exception ex){
            System.out.println("Error en DAOVehiculos.insertarVehiculo: "+ex.getMessage());
            return null;
        }
            
    
    }
}