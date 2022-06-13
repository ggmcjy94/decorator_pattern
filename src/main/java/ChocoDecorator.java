public class ChocoDecorator extends Decorator{

    public ChocoDecorator(Component component) {
        super(component);
    }

    @Override
    public String cakeAdd() {
        return super.cakeAdd() + " + 초코";
    }
}
