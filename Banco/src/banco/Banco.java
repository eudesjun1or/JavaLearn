
package banco;


public class Banco {

  
    public static void main(String[] args) {
       Conta C1 = new Conta(1, "Joao", 2000);
       Conta C2 = new Conta(2, "Amanda",1000);
        System.out.println("Conta1 " + C1.getNumero());
        System.out.println("Conta1 " +C1.getTitular());
        System.out.println("Conta1 " +C1.getSaldo());
        System.out.println("Conta2 " +C2.getNumero());
        System.out.println("Conta2 " +C2.getTitular());
        System.out.println("Conta2 " +C2.getSaldo());
        
        C1.Tranfere(C2, 2000);
        C1.imprimeSaldo();
        C2.imprimeSaldo();
    }
    
}
