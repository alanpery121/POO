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
public class Diretor extends Pessoa{

    @Override
    public void andar() {
        System.out.println("O diretor esta andando");
    }

    @Override
    public void correr() {
        System.out.println("O diretor esta correndo");
    }
    
}
