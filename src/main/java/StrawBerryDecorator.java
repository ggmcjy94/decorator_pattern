public class StrawBerryDecorator extends Decorator{

    public StrawBerryDecorator(Component component) {
        super(component);
    }

    @Override
    public String cakeAdd() {
        return super.cakeAdd() + " + 딸기";
    }
}
