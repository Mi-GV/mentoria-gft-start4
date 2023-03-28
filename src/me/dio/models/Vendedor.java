package me.dio.models;

public class Vendedor extends FunncionarioCLT implements CalculaBonificacao {
    private Double valorDaBonificacao;

    @Override
    public void calculaBonificacao(Double porcetagemBonificacao) {
    this.valorDaBonificacao = this.valorSalario * (porcetagemBonificacao/100d);
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", valorSalario=" + valorSalario +
                ", endereco=" + endereco.getBairro() +
                ",valorBonificacao=" + valorDaBonificacao +
                '}';

    }


}
