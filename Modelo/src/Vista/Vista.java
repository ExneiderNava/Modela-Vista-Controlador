
package Vista;
import java.util.Scanner;

public class Vista {
    
    private String colorBoton;
    private int numBotones;
    private int numLabel;
    private String colorLabel;
    private String colorFormulario;
    private Scanner objTeclado;
    
    public Vista(){
        this.colorBoton = "rojo";
        this.numBotones = 5;
        this.numLabel = 10;
        this.colorLabel = "blanco";
        this.colorFormulario = "amarillo";
    }
    
    public int mostrarMenu(){
        System.out.println("1. Registrar cliente");
        System.out.println("2. ver lista de clientes");
        System.out.println("3. Registrar proveedor");
        System.out.println("4. ver lista de proveedores");
        System.out.println("5. Salir");
        this.objTeclado = new Scanner(System.in);
        System.out.println("seleccione una opcion....");
        int opcionMenu = objTeclado.nextInt();
        return opcionMenu;
    }
    
    public String tomarRegistro_cliente(){
        this.objTeclado = new Scanner(System.in);
        System.out.println("Bienvenido al registro del cliente");
        System.out.println("digite el nombre del cliente");
        String nombreCliente = objTeclado.nextLine();
        System.out.println("digite el apellido del cliente");
        String apellidoCliente = objTeclado.nextLine();
        System.out.println("digite la cedula del cliente");
        String cedulaCliente = objTeclado.nextLine();
        return nombreCliente;    
    }
    
    public String[] datosProveedor(){
        this.objTeclado = new Scanner(System.in);
        System.out.println("Bienvenido al registro del proveedor");
        System.out.println("Nombre de la racion social del proveedor");
        String razonSocial = objTeclado.nextLine();
        System.out.println("numero de identificación del proveedor");
        String numIdentificacion = objTeclado.nextLine();
        
        return new String[]{
            razonSocial, numIdentificacion
        };
    }
}
