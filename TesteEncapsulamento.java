public class TesteEncapsulamento {

    public static void main(String[] args) {
        
        
        System.out.println("--- 1. Criando a Conta Bancária ---");
        ContaBancaria conta = new ContaBancaria("4567-8", "Maria da Silva");

        System.out.println("\n--- 2. Usando Setters com Validação ---");
        conta.setNumeroConta("9876-5"); 
        conta.setTitular(null); 
        conta.setTitular("Maria da Silva"); 
        
        System.out.printf("Conta Inicializada: %s - Titular: %s%n", conta.getNumeroConta(), conta.getTitular());
        System.out.printf("Saldo Inicial: R$%.2f%n", conta.getSaldo());

        System.out.println("\n--- 3. Operações de Depósito ---");
        conta.depositar(100.00); 
        conta.depositar(250.75); 
        conta.depositar(-50.00); 

        System.out.println("\n--- 4. Operações de Saque ---");
        conta.sacar(50.00); 
        conta.sacar(-10.00); 
        conta.sacar(5000.00); 

        System.out.println("\n--- 5. Saldo Final (Acesso via Getter) ---");
        System.out.printf("O saldo final da conta %s é: R$%.2f%n", conta.getNumeroConta(), conta.getSaldo());
    }
}