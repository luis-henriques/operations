package operations;

public interface IOperacao {

    //Atribui os inputs da operaçao a realizar
    public void setInputs(int[] inputs);
    //Atribui nome à operação
    public void setNomeDaOperacao(String nomeDaOperacao);
    //Implementa a operacao
    public int realizaOperacao();
    //Devolve o nome da operacao
    public String getNomeDaOperacao();
    //devolve o nome e os inputs da operacao
    public String getDescricaoOperacaoAtual();

}
