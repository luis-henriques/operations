package operations.impl;

public class MinusOperation extends OperacaoImpl {

    @Override
    public int realizaOperacao() {
        int total = 0;
        for (int i : inputs) {
            total -= i;
        }
        return total;
    }
}
