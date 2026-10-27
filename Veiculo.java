
package com.mycompany.oficina;

public class Veiculo {
protected String placa;
protected int ano;

public Veiculo (String placa, int ano){
this.placa = placa;
this.ano = ano;
}
public String descrever(){
return "Veículo: "+ placa;
}
public int garantia(){
return 12;
}
public int garantia(int mesesAdicionais){
return 12+mesesAdicionais;
}
}


