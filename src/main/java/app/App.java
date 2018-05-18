package app;

import operations.IOperacoesNaturais;
import operations.impl.OperacoesNaturais;

import java.util.logging.Level;
import java.util.logging.Logger;

public class App {

    private static final Logger logger = Logger.getLogger(App.class.getName());

    public static void main(String[] args) throws Exception {

        int[] inputs = new int[]{4, 5};
        int[] fatorialInput = new int[]{5};
        int resultado;
        //IOperacao fatorial = new IOperacao();
        IOperacoesNaturais operacoes = new OperacoesNaturais();
        resultado = operacoes.executaOperacao("soma", inputs);
        logger.log(Level.INFO, "Soma: {0}", resultado);
        resultado = operacoes.executaOperacao("subtracao", inputs);
        logger.log(Level.INFO, "subtracao: {0}", resultado);
        resultado = operacoes.executaOperacao("multiplicacao", inputs);
        logger.log(Level.INFO, "multiplicacao: {0}", resultado);

        //fatorial.setNomeDaOperacao("fatorial");
        //operacoes.adicionaOperacao(fatorial);
        //resultado = operacoes.executaOperacao("fatorial", inputs);

    }

}
