package behaviour_pattern.strategy;

public abstract class Context {

    private Strategy strategyContext;

    public void setStrategyContext(Strategy strategyContext) {
        this.strategyContext = strategyContext;
    }

    public int performOperation(int a, int b){
        return strategyContext.doOperation(a,b);
    }

    public abstract void display(int result);
}
