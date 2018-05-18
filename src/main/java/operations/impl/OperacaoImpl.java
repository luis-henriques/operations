package operations.impl;

import operations.IOperacao;

public class OperacaoImpl implements IOperacao {

    protected int[] inputs;
    protected String nomeDaOperacao;

    public void setInputs(int[] inputs) {
        this.inputs = inputs.clone();
    }

    public void setNomeDaOperacao(String nomeDaOperacao) {
        this.nomeDaOperacao = nomeDaOperacao;
    }

    public int realizaOperacao() {
        return 0;
    }

    public String getNomeDaOperacao() {
        return nomeDaOperacao;
    }

    public String getDescricaoOperacaoAtual() {
        StringBuilder builder = new StringBuilder();
        builder.append("Método com nome: ");
        builder.append(nomeDaOperacao);
        builder.append(" com os seguintes inputs: ");
        builder.append(inputs);
        return builder.toString();
    }
}
