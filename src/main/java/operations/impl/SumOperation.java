package operations.impl;

public class SumOperation extends OperacaoImpl {

    @Override
    public int realizaOperacao() {
        int total = 0;
        for (int i: this.inputs) total += i;
        return total;
    }
}
