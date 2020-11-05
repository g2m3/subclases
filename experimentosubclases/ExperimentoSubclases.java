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
public class ExperimentoSubclases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Mueble> muebles = new ArrayList<>();
        Silla silla1 = new Silla(5);
        Mesa mesa1 = new Mesa();
        muebles.add(mesa1);
        muebles.add(silla1);
        
        Mesa.imprimir(muebles);
    }
    
}
