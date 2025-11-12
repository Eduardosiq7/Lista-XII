/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class ContaBancaria {

    
    private String numeroConta;
    private String titular;
    private double saldo;

    
    public ContaBancaria(String numeroConta, String titular) {
      
        this.saldo = 0.0;
        

        setNumeroConta(numeroConta);
        setTitular(titular);
    }

    

    
    public String getNumeroConta() {
        return numeroConta;
    }

    
    public void setNumeroConta(String numeroConta) {
        if (numeroConta == null || numeroConta.trim().isEmpty()) {
            System.out.println("[ERRO] O número da conta não pode ser nulo ou vazio.");
            
        } else {
            this.numeroConta = numeroConta;
        }
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        if (titular == null || titular.trim().isEmpty()) {
            System.out.println("[ERRO] O nome do titular não pode ser nulo ou vazio.");
        } else {
            this.titular = titular;
        }
    }

    public double getSaldo() {
        return saldo;
    }


    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.printf("[SUCESSO] Depósito de R$%.2f realizado. Novo saldo: R$%.2f%n", valor, this.saldo);
        } else {
            System.out.println("[ERRO] O valor para depósito deve ser positivo.");
        }
    }


    public boolean sacar(double valor) {
        if (valor <= 0) {
            System.out.println("[ERRO] O valor para saque deve ser positivo.");
            return false;
        }

        if (valor > this.saldo) {
            
            System.out.printf("[ERRO] Saldo insuficiente. Saldo atual: R$%.2f. Valor solicitado: R$%.2f%n", this.saldo, valor);
            return false;
        }

        this.saldo -= valor;
        System.out.printf("[SUCESSO] Saque de R$%.2f realizado. Novo saldo: R$%.2f%n", valor, this.saldo);
        return true;
    }
}
        

        