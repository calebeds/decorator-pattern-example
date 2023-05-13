package decorators;

public class ConcreteDecoratorExample1 extends AbstractDecorator {
    @Override
    public void doJob() {
        super.doJob();

        // add additional responsabilities

        System.out.println("I am explicitly from example1");
    }
}
