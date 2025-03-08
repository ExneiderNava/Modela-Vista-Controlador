
package Controlador;

import Modelo.Cliente;
import Modelo.Proveedor;
import Vista.Vista;

public class Controlador {
    private Vista ObjFormulario_registro;
    private Cliente ObjModelo_cliente;
    private Proveedor objProveedor;
    
    public Controlador(Cliente objCliente, Vista objFormulario, Proveedor objProveedor){
        this.ObjModelo_cliente = objCliente;
        this.ObjFormulario_registro = objFormulario;
        this.objProveedor = objProveedor;
    }
    
    public void iniciarFormulario(){
        int opcion = 0;
        do{
            opcion = this.ObjFormulario_registro.mostrarMenu();
            switch (opcion) {
                case 1:
                    String auxNombre = this.ObjFormulario_registro.tomarRegistro_cliente();
                    this.ObjModelo_cliente.guardarCliente(auxNombre);
                    break;
                case 2:
                    this.ObjModelo_cliente.imprimirClientes();
                    break;
                case 3:
                    String[] auxpro = this.ObjFormulario_registro.datosProveedor();
                    this.objProveedor.guardarProveedor(auxpro[0], auxpro[1]);
                    break;
                case 4:
                    this.objProveedor.imprimirProveedor();
                    break;
                case 5:
                    System.out.println("saliendo");
                    break;
                default:
                    System.out.println("opcion no valida");
            }
        }  while(opcion != 5);     
        
    }
}
