
package Modelo;


public class Proveedor {
    private String nombreProveedor, numIdentificacion;
    private String[] listaProveedores, listaNumeros;
    private int contador1, contador2;
    
    public Proveedor(){
        this.nombreProveedor = " ";
        this.numIdentificacion = " ";
        this.contador1 = 0;
        this.contador2 = 0;
        this.listaProveedores = new String[3];
        this.listaNumeros = new String[3];
    }
    
    public String getIdentificaionProveedor(){
        return numIdentificacion;
    }
    
    public String getNombreProveedor(){
    return nombreProveedor;
    }
    
    public void setIdentificacionProveedor(String numIdentificacion){
        this.numIdentificacion = numIdentificacion;
    }
    
    public void setNombreProveedor(String nombreProveedor){
        this.nombreProveedor = nombreProveedor;
    }
    
    public String[] getlistaNumeros(){
        return listaNumeros;
    }
    
    public String[] getListaProveedor(){
        return listaProveedores;
    }
    
    public void guardarProveedor(String nombreProveedor, String numeroIdentificacion){
        if(this.contador1 < this.listaProveedores.length){
            this.listaProveedores[this.contador1] = nombreProveedor;
            this.contador1++;
            System.out.println("informacion guardada");           
        }
        
        if(this.contador2 < this.listaNumeros.length){
            this.listaNumeros[this.contador2] = numeroIdentificacion;
            this.contador2++;
            System.out.println("informacion guardada");
        }
    }
    
    public void imprimirProveedor(){
        for(int i=0; i<listaProveedores.length; i++){
            for(int j=0; i<listaNumeros.length; i++){
               System.out.println("Proveedor: " + this.listaProveedores[i] + "NIT: " + this.listaNumeros[j]); 
            }
        }
        
            
    }
}
