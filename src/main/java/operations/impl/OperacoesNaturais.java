package operations.impl;

import operations.IOperacao;
import operations.IOperacoesNaturais;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OperacoesNaturais implements IOperacoesNaturais {

    private Map<String, IOperacao> operacaoMap = new HashMap();

    public OperacoesNaturais() {
        operacaoMap.put("soma", new SumOperation());
        operacaoMap.put("subtracao", new MinusOperation());
        operacaoMap.put("multiplicacao", new MultiplyOperation());
    }

    public void adicionaOperacao(IOperacao operacao) {
        operacaoMap.put(operacao.getNomeDaOperacao(),operacao);
    }

    public List<String> listaOperacoes() {
        List<String> listToReturn = new ArrayList();
        for (String key : operacaoMap.keySet()) {
            listToReturn.add(key);
        }
        return listToReturn;
    }

    public int executaOperacao(String nome, int[] valores) {
        IOperacao operacao = operacaoMap.get(nome);
        operacao.setInputs(valores);
        return operacao.realizaOperacao();
    }
}
