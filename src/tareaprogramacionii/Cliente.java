
package tareaprogramacionii;

/**
 * Clase Cliente que hereda de Persona y agrega un identificador único.
 */
public class Cliente extends Persona {
    private String idCliente;
     /**
     * Constructor con parámetros.
     * 
     * @param idCliente Identificador del cliente
     * @param cedula Cédula heredada
     * @param nombre Nombre heredado
     * @param apellido Primer apellido heredado
     * @param apellido2 Segundo apellido heredado
     * @param edad Edad heredada
     * @param correo Correo heredado
     */
    public Cliente(String idCliente, String cedula, String nombre, String apellido, String apellido2, int edad, String correo) {
        super(cedula, nombre, apellido, apellido2, edad, correo);
        this.idCliente = idCliente;
    }
    /**
     * Constructor vacío que inicializa el idCliente en vacío.
     */
    public Cliente() {
        this.idCliente = "";
    }
     /**
     * Obtiene el ID del cliente.
     * @return idCliente
     */
    public String getIdCliente() {
        return idCliente;
    }
    /**
     * Establece el ID del cliente.
     * @param idCliente Identificador a asignar
     */
    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }
   
    /**
     * Método para ingresar datos del cliente (heredando los de Persona).
     */
    public void ingresarCliente(){
    ingresarDatos();
        try {
            
       
        System.out.println("Ingrese el id Cliente");
        setIdCliente(entrada.next());
        
         } catch (Exception e) {
             System.out.println("ingrese opcion valida");
        }
        
    
    }
    /**
     * Muestra los datos completos del cliente, incluyendo ID.
     */
    
    public void mostrarCliente(){
    mostrarDatos();
        System.out.println("ID Cliente: " + getIdCliente());
    
    }
    
    
    
    
    
    
}
