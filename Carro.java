
package com.mycompany.oficina;

public class Carro extends Veiculo{
private int portas;

public Carro (String placa, int ano, int portas){
super (placa, ano);
this.portas = portas;
}
@Override
public String descrever(){
return "Carro: "+placa+ " ,"+portas+" portas";
}
}
