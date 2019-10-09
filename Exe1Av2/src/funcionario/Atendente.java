/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionario;



/**
 *
 * @author LABORATORIO 01
 */
public class Atendente extends Funcionario{

    @Override
    public void entrar() {
        System.out.println("Entrada Atendnete registrado com sucesso");
    }

    @Override
    public void sair() {
        System.out.println("Saida Atendnete registrado com sucesso");
    }

   
    
}
