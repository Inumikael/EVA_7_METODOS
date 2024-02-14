/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva_7_metodos;

/**
 *
 * @author invitado
 */
public class Persona {
   /*Nombre, apellidos, edad*/
    private String nombre;
    private String apellidos;
    private int edad;
   
    
    //Get Set
    public String getNombre() {
        return nombre;
    }
    
     public String setNombre() {
        return nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    
    public String setApellidos() {
        return apellidos;
    }
    
    public int getEdad() {
        return edad;
    }
    
     public int setEdad(int valor) {
        return edad;
    }
     
     //reglas para el nombre de los métodos en java
     //es un verbo, empieza en minúsculas
     
     public String generarNombrecom(){
        return nombre + " " + apellidos;
         
     }
 
     //calcular año de nacimientos
     public int calcularAnnioNac(){
        return 2024 - edad;
         
     }
}

