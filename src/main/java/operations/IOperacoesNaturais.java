package operations;

import java.util.List;

public interface IOperacoesNaturais {

    //Permite adicionar uma nova operacao
    public void adicionaOperacao(IOperacao operacao);
    //Permite lista as operacoes disponiveis
    public List<String> listaOperacoes();
    //permite executar uma operacao de acordo com o nome e valores passados
    public int executaOperacao(String nome, int[] valores);

}
