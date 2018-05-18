package operations.impl;

public class MultiplyOperation extends OperacaoImpl {

    @Override
    public int realizaOperacao() {
        int total = 1;
        for (int i: inputs) {
            total *= i;
        }
        return total;
    }
}
