
package com.mycompany.oficina;

public class Oficina {

    public static void main(String[] args) {
    Veiculo c = new Carro ("ABC1D23", 2020,4);
    Veiculo m = new Moto ("XYZ7K89", 2022,250);
    
    
    Veiculo [] veiculos ={
    new Carro ("ABC1D23", 2020,4),
    new Moto ("XYZ7K89", 2022,250),
    };
    for (Veiculo item: veiculos){
    System.out.println (item.descrever());
    }
    System.out.println(c.garantia());
    System.out.println(c.garantia(12));
    }
}
