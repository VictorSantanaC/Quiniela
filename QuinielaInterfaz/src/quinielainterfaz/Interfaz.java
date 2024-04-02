package quinielainterfaz;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
//import java.rmi.RemoteException;

public interface Interfaz extends Remote{
    //Agregar los metodos de la clase Metodos del servidor aquí
    public int iniciarSesion(String nombreUsuario, String password) throws RemoteException;//Metodo para validar el inicio de sesión
    public boolean registrarEquipo(String nombreEquipo) throws RemoteException;//Registrar nuevo equipo, return true si fue exitoso el registro si no false.
    public ArrayList<String> obtenerEquipos() throws RemoteException;//Obtener lista de todos los equipos registrados
    public ArrayList<String> obtenerUsuariosActivos() throws RemoteException;//Obtener lista de usuarios activos.
    public ArrayList<String> obtenerUsuariosInactivos() throws RemoteException;//Obtener lista de usuarios inactivos.
    public boolean registrarUsuario(String nombreUsuario, String password) throws RemoteException;//Registrar nuevo usuario.
    public boolean habilitarUsuario(int idUsuario) throws RemoteException;//Habilitar usuario
    public boolean habilitarUsuarios(ArrayList<Integer> idsUsuarios) throws RemoteException;//Habilitar todos los usuarios
    
}
