/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import construcao.Casa;
import construcao.Edificio;
import construcao.Predio;
import funcionario.Atendente;
import funcionario.AuxiFiscal;
import funcionario.Caixa;
import pessoa.Aluno;
import pessoa.Diretor;
import pessoa.Professor;

/**
 *
 * @author LABORATORIO 01
 */
public class Main {
    
    public static void main(String[] args) {
        Casa c = new Casa();
        Edificio e = new Edificio();
        Predio p = new Predio();
        
        c.construir();
        c.reformar();
        
        e.construir();
        e.reformar();
        
        p.construir();
        p.reformar();
        

        Atendente at = new Atendente();
        AuxiFiscal af = new AuxiFiscal();
        Caixa cx = new Caixa();
        
        at.entrar();
        at.sair();
        
        af.entrar();
        af.sair();
        
        cx.entrar();
        cx.sair();
        
        Aluno a = new Aluno();
        Professor pr = new Professor();
        Diretor d = new Diretor();
        
        a.andar();
        a.correr();
        
        pr.andar();
        pr.correr();
        
        d.andar();
        d.correr();
    }
}
