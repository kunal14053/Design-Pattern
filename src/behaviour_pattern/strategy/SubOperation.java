package behaviour_pattern.strategy;

public class SubOperation implements Strategy {
    @Override
    public int doOperation(int a, int b) {
        return Math.abs(a-b);
    }
}
