
package Principal;
import Controlador.Controlador;
import Modelo.Cliente;
import Vista.Vista;

public class Principal {

   
    public static void main(String[] args) {
        
        Cliente objCliente = new Cliente();
        Vista objFormulario = new Vista();
        Controlador objControlador = new Controlador(objCliente, objFormulario);
        objControlador.iniciarFormulario();
       
    }
    
}
