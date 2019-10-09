/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package construcao;



/**
 *
 * @author LABORATORIO 01
 */
public class Edificio extends Construcao{

    @Override
    public void construir() {
        System.out.println("Construindo Edificio");
    }

    @Override
    public void reformar() {
        System.out.println("Reformando Edificio");
    }
    
}
