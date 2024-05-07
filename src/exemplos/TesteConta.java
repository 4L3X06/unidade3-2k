package exemplos;

public class TesteConta {
    public static void main(String[] args) {
        Conta c = new Conta();
        c.depositar(100);
        c.depositar(50);
        c.setNomeTitular("laís");
        c.setNumero(1234);
        boolean saqueEfetuado = c.sacar(200);
        if (saqueEfetuado){
            System.out.println("Saque efetuado com sucesso!");
    }  else {
            System.err.println("ERRO AO SACAR!!!");
        }
        System.out.println("Nome Titular: " + c.getNomeTitilar());
        System.out.println("Número: " + c.getNumero());
        System.out.println("Saldo: " + c.getSaldo()) ;
        System.out.println(c);
        
    }
}
