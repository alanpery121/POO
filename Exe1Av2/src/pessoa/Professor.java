/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pessoa;

/**
 *
 * @author LABORATORIO 01
 */
public class Professor extends Pessoa{

    @Override
    public void andar() {
        System.out.println("O professor esta andando");
    }

    @Override
    public void correr() {
        System.out.println("O professor esta correndo");
    }
    
}
