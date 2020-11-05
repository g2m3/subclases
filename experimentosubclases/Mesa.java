/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experimentosubclases;

/**
 *
 * @author clases
 */
public class Mesa extends Mueble {
    String color = "Rojo";
    
    @Override
    public String toString(){
        return "Soy una mesa de color: " + color;
    }
}
