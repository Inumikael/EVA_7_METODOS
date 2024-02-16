/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva_7_metodos;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA_7_METODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona perso = new Persona();
        perso.setNombre("Juan");
        perso.setApellidos("Pérez");
        perso.setEdad(50);
        
        System.out.println("El nombre es " + perso.generarNombrecom());
        System.out.println("Nació en el año; " + perso.calcularAnnioNac());
        //-------
        Persona[] grupo = new Persona[5];
        // Hay que crear cada objeto para poderlo usar
        
        for(int i = 0; i < grupo.length; i++) {
            Scanner input = new Scanner(System.in);
            grupo[i] = new Persona();
            // Una vez creado el objeto, hay que llenarlo:
            System.out.println("Introudice el nombre:");
            String nombre = input.nextLine();
            grupo[i].setNombre(nombre);
            
            System.out.println("Introduce el apellido;");
            String ape = input.nextLine();
            
            System.out.println("Introduce la edad");
            int edad = input.nextInt();
            grupo[i].setEdad(edad);
        }
            //Leer
            for(int i = 0; i < grupo.length; i++){
                System.out.println("El nombre es " + grupo[i].generarNombrecom());
                System.out.println("Nació en el año; " + grupo[i].calcularAnnioNac());
            }
        
        
    }
    
}
