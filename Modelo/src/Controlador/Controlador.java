
package Controlador;

import Modelo.Cliente;
import Vista.Vista;

public class Controlador {
    private Vista ObjFormulario_registro;
    private Cliente ObjModelo_cliente;
    
    public Controlador(Cliente objCliente, Vista objFormulario){
        this.ObjModelo_cliente = objCliente;
        this.ObjFormulario_registro = objFormulario;
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
                    System.out.println("saliendo");
                    break;
                default:
                    System.out.println("opcion no valida");
            }
        }  while(opcion != 3);     
        
    }
}
