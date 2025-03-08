
package Principal;
import Controlador.Controlador;
import Modelo.Cliente;
import Vista.Vista;
import Modelo.Proveedor;

public class Principal {

   
    public static void main(String[] args) {
        
        Cliente objCliente = new Cliente();
        Vista objFormulario = new Vista();
        Proveedor objProveedor = new Proveedor();
        
        
        Controlador objControlador = new Controlador(objCliente, objFormulario, objProveedor);
        objControlador.iniciarFormulario();
       
    }
    
}
