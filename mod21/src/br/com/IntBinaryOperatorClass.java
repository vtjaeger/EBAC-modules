package mod21.src.br.com;

import java.util.function.IntBinaryOperator;

public class IntBinaryOperatorClass implements IntBinaryOperator {
    @Override
    public int applyAsInt(int x, int y) {
        return x + y;
    }
}
