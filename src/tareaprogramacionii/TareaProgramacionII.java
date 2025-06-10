
package tareaprogramacionii;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase principal que contiene el menú y la lógica para manejar
 * reservas y clientes de un restaurante.
 * Utiliza una matriz irregular para las reservas y un ArrayList para
 * administrar clientes.
 */
public class TareaProgramacionII {
     /** Matriz irregular para almacenar clientes según día y reserva */
    static Cliente DBC[][];
    
    /** ArrayList para CRUD de clientes */
    static ArrayList CRUD = new ArrayList<>();
     /** Scanner para entrada de datos */
    static Scanner entrada = new Scanner(System.in);
             /**
/**
 * Método principal que ejecuta el programa.
 * 
 * @param args Argumentos de línea de comandos.
 */
    public static void main(String[] args) {
       
        
        int deci;
        do {            
            
       
        System.out.println("MENU PRINCIPAL \n"
                + "1: Menu Citas\n"
                + "2: Menu Clientes \n"
                + "0 salir"  );
         deci = entrada.nextInt();
        
        
        switch (deci) {
            case 1:
                subMenCita();
                
                break;
                
                
            case 2: 
                subMenCliente();
                break;
                
            default:
                System.out.println("Digite opcion valida");
        }
        
         } while (deci != 0);
    }
    
    
    
    /**
     * Submenú para manejar las citas (reservas).
     */
    
    static public void subMenCita(){
        int decision;
        do {            
            
        
        
        
        System.out.println("Bienvenido al Menu de Citas \n"
                + "1: Ingresar cita\n"
                + "2: Mostrar Citas\n"
                + "0: Volver menu principal");
        decision = entrada.nextInt();
        
            switch (decision) {
                case 1:
                    ingresarCitas();
                    
                    break;
                    
                case 2:
                    mostrarCitas();
                    break;
                    
                    
                case 0:
                    
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Ingrese opcion valida");
            }
        } while (decision !=0);
        
        
      
    
    
    }
    
    /**
     * Método para ingresar la estructura de días y reservas (matriz irregular).
     */
    static public void ingresarCitas(){
    
        System.out.println("Ingrese Los Dias a trabajar");
        int dias = entrada.nextInt();
        DBC = new Cliente[dias][];
        for (int i = 0; i < DBC.length; i++) {
            System.out.println("Ingrese el numero de reserva para el dia " + (i + 1));
            int reserva = entrada.nextInt();
            DBC[i] = new Cliente[reserva];

        }
    }
    /**
     * Muestra todas las citas y clientes asignados en la matriz.
     */
    static public void mostrarCitas(){
        if (DBC == null) {
            System.out.println("No hay citas disponibles");
            return;
        }
        System.out.println(" CITAS DISPONIBLES : ");
         System.out.println("----------------------------");
        for (int i = 0; i < DBC.length; i++) {
            System.out.println(" DIA " + ( i + 1) + " : " );

            for (int j = 0;  j< DBC[i].length ; j++) {
                System.out.println("Reserva " + (j + i) + ":");
             
                if (DBC[i][j] == null) {
                    System.out.println(" Disponible");
                    System.out.println(" ");
                }else {
                DBC[i][j].mostrarCliente();
                
                }

            }
               System.out.println("-----------------------------");

        }
    }
    
     /**
     * Submenú para gestionar clientes (CRUD).
     */
    static public void subMenCliente(){
    int decision;
    
        do {            
            
       
        System.out.println("Sub Menu Cliente\n"
                + "1:Ingresar Cliente\n"
                + "2: Modificar Cliente\n"
                + "3: Eliminar Cliente\n"
                + "4: Mostrar todos los Clientes\n"
                + "0: Volver Menu Principal");
        decision = entrada.nextInt();
        
            switch (decision) {
                case 1:
                  
                    
                    ingresarCliente();
                    
                    break;
                    
                    
                case 2:
                  modificarCliente();
                    
                    break;
                    
                case 3 :
                    eliminarCliente();
                    break;
                    
                    
                case 4:
                    mostrarCliente();
                    break;
                    
                    
                case 0: System.out.println("saliendo");
                break;
                default:
                    System.out.println("Ingrese opcion valida");
            }
     } while (decision!=0);
        
        
    }
    
    
     /**
     * Método para ingresar un cliente en un día y reserva específica.
     */
    static public void ingresarCliente(){
       if (DBC == null) {
            System.out.println(" No hay citas agendadas, intente de nuevo ");
        return;
        }
       
        System.out.println("Para qué día desea realizar la reserva? (1 - " + DBC.length + ")");
        int dia = entrada.nextInt();
        
        if (dia < 1 || dia > DBC.length) {
        System.out.println("Día inválido.");
        return;
    }
        
       int diaIndex = dia - 1;
       
        System.out.println("Reservas disponibles para el dia " + dia + ":");
        boolean hayDisponible = false;
        
        for (int i = 0; i < DBC[diaIndex].length; i++) {
            if (DBC[diaIndex][i] == null) {
                System.out.println("Reserva " + (i + 1 ) + " esta disponible");
                hayDisponible = true;
            }
        }
        
        if (!hayDisponible) {
            System.out.println("no hay reservas para ese dia");
            return;
        }
    
        System.out.println("Ingrese el numero de reserva que sea ocupar");
        int reserva = entrada.nextInt();
        
        if (reserva < 1 || reserva > DBC[diaIndex].length) {
            System.out.println("Numero de reserva invalido");
            return;
        }
        int reservaIndex = reserva -1;
        
        if (DBC[diaIndex][reservaIndex] != null) {
            System.out.println("esta reserva ya esta ocupada");
            return;
        }
        
        Cliente c = new Cliente();
        System.out.println("Ingrese los datos del cliente para la reserva");
        c.ingresarCliente();
        DBC[diaIndex][reservaIndex] = c;
        CRUD.add(c);
        
        System.out.println("Reserva asignada correctamente para el dia " + dia + ", reserva " + reserva);
    
        
        
        
        
        
    }
      /**
     * Muestra todos los clientes registrados en el ArrayList.
     */
    static public void mostrarCliente(){
      
        
        if (CRUD.isEmpty()) {
            System.out.println("no hay clientes");
            
        }else{
            for (int i = 0; i < CRUD.size(); i++) {
               
             Cliente c = (Cliente) CRUD.get(i);  
                System.out.println("Cliente Numero : " + (i + 1) );
            System.out.println("---------------------");
            c.mostrarCliente();
            }
            System.out.println(" ");
        
        }
         
    
    }
    /**
     * Modifica los datos de un cliente existente.
     */
    static public void modificarCliente(){
        if (CRUD.isEmpty()) {
            System.out.println("No hay cliente");
            return;
        }
        System.out.println("ingrese El id del cliente a modificar");
        String idClient = entrada.next();
        boolean encontrado = false;
        
        for (int i = 0; i < CRUD.size(); i++) {
            Cliente c = (Cliente) CRUD.get(i);
            if (c.getIdCliente().equals(idClient)) {
                System.out.println("Cliente encontrado");
                c.mostrarCliente();
                System.out.println(" ");
                System.out.println("Ingrese los nuevos Datos");
                c.ingresarCliente();
                System.out.println(" ");
                System.out.println("cliente modificado correctamente");
                encontrado = true;
                break;
            }
            
        }
    
    }
      /**
     * Elimina un cliente del ArrayList y libera su reserva en la matriz.
     */
    static public void eliminarCliente(){
         if (CRUD.isEmpty()) {
             System.out.println("No hay cliente");
            return;
        }
         boolean encontrado = false;
         System.out.println("Ingrese El id Cliente para Eliminar ");
         String clienteEli = entrada.next();
        for (int i = 0; i < CRUD.size(); i++) {
          
            Cliente c = (Cliente) CRUD.get(i);
          
            if (c.getIdCliente().equals(clienteEli)) {
                System.out.println("Cliente encontrado correctamente");
                c.mostrarCliente();
                System.out.println("");
                System.out.println("Desea eliminar? 1. si 2. no");
                int deci = entrada.nextInt();
                
                if (deci == 1) {
                    CRUD.remove(i);
                    System.out.println("Cliente eliminado Correctamente");
                   
                    
                     for (int dia = 0; dia < DBC.length; dia++) {
                    for (int reserva = 0; reserva < DBC[dia].length; reserva++) {
                        if (DBC[dia][reserva] != null && DBC[dia][reserva].getIdCliente().equals(clienteEli)) {
                            DBC[dia][reserva] = null;
                            System.out.println("Cita liberada para el día " + (dia + 1) + ", reserva " + (reserva + 1));
                        }
                    }
               }
                    
                    
                    
                     encontrado = true;
                }else{
                    System.out.println("Eliminacion Cancelada");
                
                
                }
                break;
                
            }
            
            if (!encontrado) {
                System.out.println("no se encontro el cliente con ID " + clienteEli);
            }
            
        }
    
    
    }
    
    
}
