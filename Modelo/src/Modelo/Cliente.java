
package Modelo;


public class Cliente {
    private String nombreCliente;
    private String[] listaCliente;
    private int contador;
    
    public Cliente(){
        this.nombreCliente=" ";
        this.contador=0;
        this.listaCliente = new String[3];
                
    }
    
    public String getNombreCliente(){
        return nombreCliente;
    }
    
    public void setNombreCliente(String nombreCliente){
        this.nombreCliente = nombreCliente;
    }
    
    public String[] getListaClientes(){
        return listaCliente;
    
    }
    
    public void guardarCliente(String datonombre){
        if(this.contador<this.listaCliente.length){
            this.listaCliente[this.contador]=datonombre;
            this.contador++;
            System.out.println("informacion guardada...");
        }
    }
    
    public void imprimirClientes(){
        for(int i=0; i<this.listaCliente.length; i++){
            System.out.println("xxxx: " + this.listaCliente[i]);
        }
    }
}
