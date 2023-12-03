public class Conta {
  public int id;
  public int saldo;
  public String usuario;
  
  Conta(int id, int saldo, String usuario){
    this.id = id;
    this.saldo = saldo;
    this.usuario = usuario;
  }
    
  public void sacar(int valor){
    if(valor > this.saldo){
      System.out.print("não pode sacar");
    } else{
      this.saldo = this.saldo - valor;
    }
  }
  
  public void deposito(int valor){
    this.saldo = this.saldo + valor;
  }
  
  public void status(){
    System.out.println("====STATUS DA CONTA====");
    System.out.println("Id: " + this.id);
    System.out.println("Nome: " + this.usuario);
    System.out.println("Saldo: " + this.saldo);
    System.out.println("=======================");
  }
}
