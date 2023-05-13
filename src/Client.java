import components.ConcreteComponent;
import decorators.ConcreteDecoratorExample1;
import decorators.ConcreteDecoratorExample2;

public class Client {
    public static void main(String[] args) {
        System.out.println("***Decorator Pattern Demo***");
        ConcreteComponent concreteComponent = new ConcreteComponent();

        ConcreteDecoratorExample1 concreteDecoratorExample1 = new ConcreteDecoratorExample1();

        // Decorating ConcreteComponent Object concreteComponent with ConcreteDecoratorExample1
        concreteDecoratorExample1.setTheComponent(concreteComponent);
        concreteDecoratorExample1.doJob();

        ConcreteDecoratorExample2 concreteDecoratorExample2 = new ConcreteDecoratorExample2();

        // Decorating ConcreteComponent Object concreteComponent with ConcreteDecoratorExample1 & CConcreteDecoratorExample2
        concreteDecoratorExample2.setTheComponent(concreteDecoratorExample1);
        concreteDecoratorExample2.doJob();
    }
}