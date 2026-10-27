
package com.mycompany.oficina;


public class Moto extends Veiculo{
private int cilindradas;

public Moto (String placa, int ano, int cilindradas){
super (placa, ano);
this.cilindradas = cilindradas;
}
@Override
public String descrever(){
return "Carro: "+placa+ " ,"+cilindradas+" cilindradas";
}
}
