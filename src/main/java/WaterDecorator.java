public class WaterDecorator extends Decorator{

    public WaterDecorator(Component coffeeComponent) {
        super(coffeeComponent);
    }

    @Override
    public String coffeeAdd() {
        return super.coffeeAdd() + " + 물";
    }
}
