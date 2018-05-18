package operations;

import operations.impl.SumOperation;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class IOperacaoTest {

    private SumOperation sumOperation;

    @Before
    public void setUp() throws Exception {
        sumOperation = new SumOperation();
    }

    @After
    public void tearDown() throws Exception {
        sumOperation = null;
    }

    @Test
    public void setInputs() {
    }

    @Test
    public void setNomeDaOperacao() {
    }

    @Test
    public void realizaOperacao() {
    }

    @Test
    public void getNomeDaOperacao() {
    }

    @Test
    public void getDescricaoOperacaoAtual() {
    }
}
