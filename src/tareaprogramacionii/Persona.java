

package tareaprogramacionii;

import java.util.Scanner;

/**
 * Clase que representa una persona con datos personales básicos.
 * Incluye métodos para ingresar y mostrar datos, así como calcular el año de nacimiento.
 */
public class Persona {
     /** Scanner para entrada de datos */
    static Scanner  entrada = new Scanner(System.in);
       /** Número de cédula de la persona */
    protected String cedula;
      /** Nombre de la persona */
    protected String nombre;
    /** Primer apellido */
    protected String apellido;
        /** Segundo apellido */
    protected String apellido2;
      /** Edad de la persona */
    protected int edad;
        /** Correo electrónico */
    protected String correo;
    
    
    /**
     * Constructor con parámetros para inicializar todos los atributos.
     * 
     * @param cedula Número de cédula
     * @param nombre Nombre
     * @param apellido Primer apellido
     * @param apellido2 Segundo apellido
     * @param edad Edad
     * @param correo Correo electrónico
     */
    public Persona(String cedula, String nombre, String apellido, String apellido2, int edad, String correo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.apellido2 = apellido2;
        this.edad = edad;
        this.correo = correo;
    }
    
    
     /**
     * Constructor vacío que inicializa atributos con valores predeterminados.
     */
    public Persona() {
        
        this.cedula = "";
        this.nombre = "";
        this.apellido = "";
        this.apellido2 = "";
        this.edad = 0;
        this.correo = "";
    }
     /**
     * Obtiene la cédula de la persona.
     * @return cédula
     */
    public String getCedula() {
        return cedula;
    }
      /**
     * Establece la cédula de la persona.
     * @param cedula cédula a asignar
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
     /**
     * Obtiene Nombre de la persona.
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }
     
    /**
     * Establece nombre de la persona.
     * @param nombre cédula a asignar
     */
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
      /**
     * Obtiene el apellido de la persona.
     * @return apellido
     */
    public String getApellido() {
        return apellido;
    }
    /**
     * Establece apellido de la persona.
     * @param apellido cédula a asignar
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
     /**
     * Obtiene el Segundo apellido de la persona.
     * @return apellido2
     */
    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }
    
     /**
     * Obtiene la edad de la persona.
     * @return edad
     */
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
     /**
     * Obtiene el correode la persona.
     *  @return correo
     */
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    /**
     * Método para ingresar datos desde la consola, con manejo básico de excepciones.
     */
    public void ingresarDatos(){
        try {
            
      
        System.out.println("Ingrese su cedula");
        setCedula(entrada.next());
        System.out.println("Ingrese su nombre");
        setNombre(entrada.next());
        System.out.println("ingrese su primer apellido");
        setApellido(entrada.next());
        System.out.println("ingrese su segundo apellido");
        setApellido2(entrada.next());
        System.out.println("ingrese su edad");
        setEdad(entrada.nextInt());
        System.out.println("ingrese su correo electronico");
        setCorreo(entrada.next());
        
         } catch (Exception e) {
             System.out.println("Ingrese opcion valida");
             
        }
    }
    
    /**
     * Muestra en consola los datos almacenados de la persona.
     */
    public void mostrarDatos(){
    
        System.out.println("Cedula:" + getCedula());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Primer Apellido:" + getApellido());
        System.out.println("Segundo apellido" + getApellido2());
        System.out.println("Edad: " + getEdad());
        System.out.println("Correo Electronico" + getCorreo());
    
    
    }
     /**
     * Método para calcular y mostrar el año de nacimiento según la edad actual.
     * (Ejemplo simple, asume año actual 2025)
     */
    
    public void calcularEdad(){
        System.out.println("ingrese año de nacimiento");
        int anoNacimiento = entrada.nextInt();
        int edad = 2025 - anoNacimiento;
        setEdad(edad);
        System.out.println("edad calculada " + edad);
        
    
    
    }
    
    
    
    
    
}
