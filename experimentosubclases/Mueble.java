/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experimentosubclases;

import java.util.ArrayList;

/**
 *
 * @author clases
 */
public class Mueble {
    
    
    public static void imprimir(ArrayList<Mueble> muebles){
        for (Mueble mueble : muebles) {
            //System.out.println("La clase de este es: " + mueble.getClass().getName());
            
            /*
            if(mueble.getClass().getName().equals("experimentosubclases.Silla")){
                Silla s = (Silla)mueble;
                System.out.println("Rodachines: " + s.rodachines);
            }
            */
            System.out.println(mueble.toString());
            
        }
    }
}
