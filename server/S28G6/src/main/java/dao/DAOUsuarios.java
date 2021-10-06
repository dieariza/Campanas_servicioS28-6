
package dao;

import db.ConexionDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import to.TOUsuarios;


public class DAOUsuarios {
    private  ConexionDB con= new ConexionDB();
    private final String nombreTabla ="Usuarios";
    private final String[] columnas = {"tipoIdentificacion","identificacion","nombres","apellidos","fechaExpedicionDocumento","lugarExpedicionDocumento","ciudadResidencia","direccion","telefono","usuario","clave"};
   
    public DAOUsuarios() {
        
        
    }
    
    
    
    
    
    public int insertUsuario(TOUsuarios ToUsuario){
        String[] valores = {ToUsuario.getTipoIdentificacion(),ToUsuario.getIdentificacion(),ToUsuario.getNombres(),ToUsuario.getApellidos(),ToUsuario.getFechaExpedicionDocumento().toString(),ToUsuario.getLugarExpedicionDocumento(),ToUsuario.getCiudadResidencia(),ToUsuario.getDireccion(),ToUsuario.getTelefono(),ToUsuario.getUsuario(),ToUsuario.getClave()};
        try{
            
           return  con.insertar(nombreTabla, columnas, valores);
            
        }catch(Exception ex){
            System.out.println("Error en DAOUsuarios.insertarUsuario: "+ex.getMessage());
            return 0;
        }
            
    
    }
    
    
    
        public boolean actualizarUsuario(TOUsuarios ToUsuario){
        String[] valores = {ToUsuario.getTipoIdentificacion(),ToUsuario.getIdentificacion(),ToUsuario.getNombres(),ToUsuario.getApellidos(),ToUsuario.getFechaExpedicionDocumento().toString(),ToUsuario.getLugarExpedicionDocumento(),ToUsuario.getCiudadResidencia(),ToUsuario.getDireccion(),ToUsuario.getTelefono(),ToUsuario.getUsuario(),ToUsuario.getClave()};
        try{
            return con.actualizar(nombreTabla, columnas, valores, ToUsuario.getIdUsuarios());
            
        }catch(Exception ex){
            System.out.println("Error en DAOUsuarios.insertarUsuario: "+ex.getMessage());
            return false;
        }
            
    
    }
        
        
        
        public boolean eliminarUsuario(int idUsuario){
             try{
            return con.borrar(nombreTabla, idUsuario);
            
        }catch(Exception ex){
            System.out.println("Error en DAOUsuarios.insertarUsuario: "+ex.getMessage());
            return false;
        }
            
    
    }
        
        
        
        public ArrayList<TOUsuarios> consultarUsuario(){
        ArrayList<TOUsuarios> usuarios = new ArrayList<>();
        TOUsuarios usuario;
        try{
            ResultSet rs = con.consultarTabla(nombreTabla);
            
            while(rs.next()){
                usuario = new TOUsuarios();
                usuario.setTipoIdentificacion(rs.getString("tipoidentificacion"));
                usuario.setIdentificacion(rs.getString("identificacion"));
                usuario.setNombres(rs.getString("nombres"));
                usuario.setApellidos(rs.getString("apellido"));
                usuario.setFechaExpedicionDocumento(rs.getDate("fechaexpediciondocumento"));
                usuario.setLugarExpedicionDocumento(rs.getString("lugarexpediciondocumento"));
                usuario.setCiudadResidencia(rs.getString("ciudadresidencia"));
                usuario.setDireccion(rs.getString("direccion"));
                usuario.setTelefono(rs.getString("telefono"));
                usuario.setUsuario(rs.getString("usuario"));
                usuario.setClave(rs.getString("clave"));
                
            }
            
            
            return usuarios;
        }catch(SQLException ex){
            System.out.println("Error en DAOUsuarios.insertarUsuario: "+ex.getMessage());
            return null;
        }catch(Exception ex){
            System.out.println("Error en DAOUsuarios.insertarUsuario: "+ex.getMessage());
            return null;
        }
            
    
    }
}
