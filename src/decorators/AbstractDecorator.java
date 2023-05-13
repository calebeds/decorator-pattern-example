package decorators;

import components.Component;

public class AbstractDecorator extends Component {

    protected Component component;

    public void setTheComponent(Component component) {
        this.component = component;
    }
    @Override
    public void doJob() {
        if (this.component != null) {
            this.component.doJob();
        }
    }
}
