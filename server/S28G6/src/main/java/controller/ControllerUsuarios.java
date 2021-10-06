
package controller;


import dao.DAOUsuarios; 
import java.util.ArrayList; 
import to.TOUsuarios;

public class ControllerUsuarios {

    DAOUsuarios usuariosDAO = new DAOUsuarios();
    
    public int insertarUsuario (TOUsuarios TOUsuario) {
        return usuariosDAO.insertUsuario(TOUsuario);
    }
    
    public boolean actualizarUsuario (TOUsuarios TOUsuario) {
        return usuariosDAO.actualizarUsuario(TOUsuario);
    }
    
    public boolean eliminarUsuario (int idUsuario) {
        return usuariosDAO.eliminarUsuario (idUsuario);
    }
    
    public ArrayList<TOUsuarios> consultarUsuarios() {
        return usuariosDAO.consultarUsuario();
    }

}