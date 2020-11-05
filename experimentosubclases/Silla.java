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
public class Silla extends Mueble {
    int rodachines;

    public Silla(int rodachines) {
        this.rodachines = rodachines;
    }
            
    @Override
    public String toString(){
        return "Soy una silla con "+rodachines+" rodachines";
    }
}
