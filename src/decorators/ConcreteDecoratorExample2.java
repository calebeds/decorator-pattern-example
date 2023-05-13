package decorators;

public class ConcreteDecoratorExample2 extends AbstractDecorator {
    @Override
    public void doJob() {
        System.out.println("");
        System.out.println("***START Ex-2***");
        super.doJob();

        // add additional responsabilities

        System.out.println("I am explicitly from example2");
        System.out.println("***END. EX-2***");
    }
}
