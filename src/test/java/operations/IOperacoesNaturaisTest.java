package operations;

import operations.impl.OperacoesNaturais;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class IOperacoesNaturaisTest {

    @Mock
    private IOperacao operacao;

    @InjectMocks
    private OperacoesNaturais operacoesNaturais;

    @Before
    public void setUp() {
        operacoesNaturais = new OperacoesNaturais();
    }

    @After
    public void tearDown() {
        operacoesNaturais = null;
    }

    @Test
    public void listaOperacoes() {
        assertNotNull(operacoesNaturais);
        List<String> operacoesNaturaisList = operacoesNaturais.listaOperacoes();
        assertNotNull(operacoesNaturaisList);
        assertEquals(3, operacoesNaturaisList.size());
    }

    @Test
    public void adicionaOperacaoTest() {
        assertNotNull(operacoesNaturais);
        IOperacao operacao = mock(IOperacao.class);
        when(operacao.getNomeDaOperacao()).thenReturn("factorial");
        operacoesNaturais.adicionaOperacao(operacao);
        List<String> newOperationList = operacoesNaturais.listaOperacoes();
        assertEquals(4, newOperationList.size());
        assertTrue(newOperationList.contains("factorial"));
    }

    @Test
    public void executaOperacao() {
        assertNotNull(operacoesNaturais);
        int result = operacoesNaturais.executaOperacao("soma", new int[]{1, 2});
        assertEquals(3, result);
    }
}