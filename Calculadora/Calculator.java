import java.util.Scanner;
public class Calculator {
  //Scanner
  Scanner sc = new Scanner(System.in);
    
  //Atributos
  private int valueA = 0;
  private int valueB = 0;
  private char op = '+';
  private boolean opConfirm = false;
    
  //Métodos proprios do caso
  public void captureInformations(){
    System.out.println("Digite o valor do primeiro número");
    set_valueA(sc.nextInt());
    System.out.println("Digite o valor do segundo número");
    set_valueB(sc.nextInt());
    System.out.println("Digite qual operador deseja usar");
    set_op(sc.next().charAt(0));
  }
    
  public void testOperator(){
    //return this.op == '+' || op == '-' || op == '/' || op == '*'?true:false;
    if(this.op == '+' || this.op == '-' || this.op == '/' || this.op == '*'){
      this.set_opConfirm(true);
    }else{
      System.out.println("Você não digitou um operador matemático");
      this.set_opConfirm(false);
    }
  }
        
  public int calculate(){
    if(this.get_opConfirm()){
      if(op == '+'){
        return this.get_valueA() + this.get_valueB();
      }else if(op == '-'){
        return this.get_valueA() - this.get_valueB();
      }else if(op == '/'){
        if(this.valueB != 0){
          return this.get_valueA() / this.get_valueB();
        }else{
          System.out.println("O dividendo de uma divisão não pode ser zero");
          return 0;
        }
      }else if(op == '*'){
        return this.get_valueA() * this.get_valueB();
      }else{
        return 0;
      }
    }else{
      System.out.println("você digitou um operador inválido");
      return 0;
    }
  }
                                
  public void show(){
    System.out.println("##########STATUS##########");
    System.out.println("# ValueA: " + this.get_valueA() + "              #");
    System.out.println("# ValueB: " + this.get_valueB() + "              #");
    System.out.println("# Operator: " + this.get_op() + "            #");
    System.out.println("# Result: " + this.calculate() + "             #");
    System.out.println("##########################");
  }
    
  //Getters and Setters
  public int get_valueA(){
    return valueA;
  }
                                
  public void set_valueA(int valueA){
    this.valueA = valueA;
  }
                                
  public int get_valueB(){
    return valueB;
  }
                                
  public void set_valueB(int valueB){
    this.valueB = valueB;
  }
                                
  public char get_op(){
    return op;
  }
                                
  public void set_op(char op){
    this.op = op;
  }
                                
  public boolean get_opConfirm(){
    return opConfirm;
  }
                                
  public void set_opConfirm(boolean opConfirm){
    this.opConfirm = opConfirm;
  }
                                
}