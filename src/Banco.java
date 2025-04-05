import com.contaBancaria.conta.ContaBancaria;
import com.contaBancaria.conta.TipoConta;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Banco {
    public static void main(String[] args) {
        ContaBancaria primeiraConta = new ContaBancaria("Natan", "0123", TipoConta.CORRENTE);
        ContaBancaria segundaConta = new ContaBancaria("Giovana", "3456", TipoConta.SALARIO);
        ContaBancaria terceiraConta = new ContaBancaria("Thiago", "1233", TipoConta.POUPANCA);


        terceiraConta.apresentarResumo();
//        segundaConta.apresentarResumo();

        terceiraConta.depositar(30);
//        segundaConta.depositar(50);

        terceiraConta.sacar(20);
//        segundaConta.sacar(20.5);

        terceiraConta.setNomeTitular("João da Silva");

        terceiraConta.apresentarResumo();

    }
}