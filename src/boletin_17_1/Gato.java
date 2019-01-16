/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_17_1;

/**
 *
 * @author jalvarezotero
 */
public class Gato extends Mamífero implements IPodeNadar, IPodeCamiñar {

    /**
     *
     */
    @Override
    public void caminar() {
        System.out.println("el gato puede moverse");
    }

    public void nadar() {
        System.out.println("el gato puede nadar");
    }

   

}
