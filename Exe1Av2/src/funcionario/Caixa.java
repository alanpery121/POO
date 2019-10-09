package funcionario;

public class Caixa extends Funcionario{

    @Override
    public void entrar() {
        System.out.println("Entrada caixa registrado com sucesso");
    }

    @Override
    public void sair() {
        System.out.println("Saida caixa registrado com sucesso");
    }
    
}
