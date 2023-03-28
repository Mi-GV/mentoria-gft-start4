package me.dio;

import me.dio.models.Endereco;
import me.dio.models.Gerente;
import me.dio.models.OperadorDeCaixa;
import me.dio.models.Vendedor;

public class main {
    public static void main (String[]args){
       /*Endereco endereco = new Endereco();
       endereco.setRua(" Endereço para essa rua ");
       System.out.println(endereco.getRua());*/


       Endereco endereco =
       new Endereco("Rua funcionário",
               "Complemento endereço funcionário","bairro funcionário");

       System.out.println("*************");


       Vendedor vendedor = new Vendedor();
       vendedor.setNome("Michelle Vianna");
       vendedor.setDocumento("111.000.111-00");
       vendedor.setValorSalario(1000d);
       vendedor.setEndereco(endereco);
       vendedor.calculaBonificacao(2d);
       System.out.println(vendedor);

       System.out.println("*************");

       OperadorDeCaixa operadorDeCaixa =
               new OperadorDeCaixa("Michelle Op. Caixa", "000.000.111-11", 2000d, endereco);
       System.out.println(operadorDeCaixa);

       System.out.println("*************");

       Gerente gerente = new Gerente();
       gerente.setNome("Michelle Gerente");
       gerente.setDocumento("444.333.333-33");
       gerente.setEndereco(endereco);
       gerente.setHorasTrabalhadas(20);
       gerente.setValorHora(100d);

       gerente.calculaRemuneracao();
       gerente.calculaBonificacao(3d);

       System.out.println(gerente);

    }
}
