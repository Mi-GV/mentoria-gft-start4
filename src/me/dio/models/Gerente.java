package me.dio.models;

public class Gerente extends FuncionarioPJ implements CalculaBonificacao {
 private Double valorDaBonificacao;

    @Override
    public void calculaBonificacao(Double porcetagemBonificacao) {

        this.valorDaBonificacao = (super.getValorRemuneracao() * (porcetagemBonificacao/100)) + 100d;
    }

    @Override
    public String toString() {
        return "FuncionarioPJ{" +
                "nome='" + super.getNome() + '\'' +
                ", documento='" + super.getDocumento() + '\'' +
                ", endereco=" + super.getEndereco()+
                ", horasTrabalhadas=" + super.getHorasTrabalhadas()+
                ", valorHora=" + super.getValorHora()+
                ", valorRemuneracao=" + super.getValorRemuneracao() +
                ", valorBonificacao=" + this.valorDaBonificacao +        '}';
    }


}
