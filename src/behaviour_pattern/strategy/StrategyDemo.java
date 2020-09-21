package behaviour_pattern.strategy;

public class StrategyDemo extends Context {

    @Override
    public void display(int result) {
        System.out.println("And the answer is: "+ result);
    }

    public static void main(String[] args) {

        StrategyDemo strategyDemo = new StrategyDemo();

        strategyDemo.setStrategyContext(new MulOperation());
        strategyDemo.display(strategyDemo.performOperation(10,20));

        strategyDemo.setStrategyContext(new SubOperation());
        strategyDemo.display(strategyDemo.performOperation(10,20));

        strategyDemo.setStrategyContext(new AddOperation());
        strategyDemo.display(strategyDemo.performOperation(10,20));

    }
}
