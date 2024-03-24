
package banco;


public class Conta {
    private int Numero;
    private String Titular;
    private float Saldo;

    public Conta(int Numero, String Titular, float Saldo) {
        this.Numero = Numero;
        this.Titular = Titular;
        this.Saldo = Saldo;
        
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public String getTitular() {
        return Titular;
    }

    public void setTitular(String Titular) {
        this.Titular = Titular;
    }

    public float getSaldo() {
        return Saldo;
    }

    public void setSaldo(float Saldo) {
        this.Saldo = Saldo;
    }
     public float Sacar(float Saque){
        
         return this.Saldo -= Saque;
        
        }
     public float Depositar(float Deposito){
         
         return this.Saldo += Deposito;
     }
     public void imprimeNome(){
     
         System.out.println(this.Titular);
     }
     public void imprimeSaldo(){
     
         System.out.println(this.Saldo);
        
     }
   
    public void Tranfere(Conta destino, float valor){
    
        if(valor > Saldo){
        
           System.out.println("Sem saldo para transferencia");     
        }else{
            this.Saldo -= valor;
        destino.Depositar(valor);
        }

    }
}
